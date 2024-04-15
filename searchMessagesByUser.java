import java.util.Iterator;
import java.util.List;

public class searchMessagesByUser implements Iterator<Message> {

    private int indexInChatHistory;
    private int chatHistorySize;
    private List<Message> chatHistory;
    private User target;

    public searchMessagesByUser(ChatHistory current, User target) {
        this.chatHistory = current.getHistory();
        this.chatHistorySize = chatHistory.size();
        this.indexInChatHistory = 0;
        this.target = target;
    }

    @Override
    public boolean hasNext() {
        while (indexInChatHistory < chatHistorySize) {
            if (chatHistory.get(indexInChatHistory).getSender() == target) {
                return true;
            } else {
                indexInChatHistory++;
            }
        }
        return false;
    }

    @Override
    public Message next() {
        if (indexInChatHistory < chatHistorySize) {
            indexInChatHistory++;
            return chatHistory.get(indexInChatHistory - 1);
        }

        return null;
    }

}
