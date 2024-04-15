import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private List<User> userList;
    private List<User> blackList;

    public ChatServer() {
        this.userList = new ArrayList<>();
        this.blackList = new ArrayList<>();
    }

    public void sendMessage(User sender, List<User> recipients, Message msg) {
        if (blackList.contains(sender)) {
            System.out.printf("\n***Sender {%s} is blocked, message fails to send.***\n",
                    sender.getUserName());
        } else {
            sender.getChatHistory().recordMessage(msg);
            // sender.getChatHistory().saveState(msg);
            this.receiveMessage(recipients, msg);
            System.out.print("\n------ Message sent ------");
            msg.printMessage();
        }
    }

    public void receiveMessage(List<User> recipients, Message msg) {
        for (User u : recipients) {
            u.receiveMessage(msg);
        }
    }

    public void registerUser(User user) {
        userList.add(user);
        user.setServer(this);
    }

    public void unresgiterUser(User user) {
        userList.remove(user);
    }

    public void block(User user) {
        blackList.add(user);
    }

    public void recall(Message msg) {
        System.out.printf("\n**** A message from [ %s ] recalled *****\n %s\n %s\n",
                msg.getSender().getUserName(), msg.getTimestamp().toString(),
                msg.getContent());
        for (User u : msg.getRecipients()) {
            u.getChatHistory().getRecalled(msg);
        }
    }
}
