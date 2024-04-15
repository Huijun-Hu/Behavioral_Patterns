import java.util.Iterator;
import java.util.List;

public class User implements IterableByUser {
    protected ChatServer mediator;
    private String userName;
    private ChatHistory chatHistory;

    public User(String userName) {
        this.userName = userName;
        this.chatHistory = new ChatHistory();
    }

    public void setServer(ChatServer mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(List<User> recipients, String content) {
        Message msg = new Message(this, recipients, content);
        mediator.sendMessage(this, recipients, msg);
        chatHistory.saveState(msg);
    }

    public void receiveMessage(Message msg) {
        chatHistory.recordMessage(msg);
    }

    public void undoMessage() {
        mediator.recall(chatHistory.getLastMsgSent());
        chatHistory.recall();
    }

    public void viewChatHistory() {
        System.out.printf("\n--- Chat History : %s ---", this.userName);
        chatHistory.prompt();
        System.out.println("----------------------------");
    }

    public String getUserName() {
        return userName;
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return chatHistory.iterator(userToSearchWith);
    }

    public void searchSender(User userToSearchWith) {
        Iterator<Message> searchSenderIterator = iterator(userToSearchWith);
        System.out.printf("\n--- Chat History : %s --- \n Search: %s", this.userName, userToSearchWith.getUserName());
        while (searchSenderIterator.hasNext()) {
            searchSenderIterator.next().printMessage();
        }
        System.out.println("----------------------------");
    }

}
