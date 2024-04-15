import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatHistory implements IterableByUser {
    private List<Message> history;
    private MementoCareTaker careTaker;

    public ChatHistory() {
        history = new ArrayList<>();
        careTaker = new MementoCareTaker();
    }

    public List<Message> getHistory() {
        return history;
    }

    public void recordMessage(Message msg) {
        this.history.add(msg);
    }

    public void saveState(Message msg) {
        careTaker.add(new MessageMemento(msg));
    }

    public void recall() {
        history.remove(getLastMsgSent());
        careTaker.recall();
    }

    public void getRecalled(Message msg) {
        history.remove(msg);
    }

    public void prompt() {
        for (Message m : history) {
            m.printMessage();
        }
    }

    public Message getLastMsgSent() {
        return careTaker.get().getState();
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new searchMessagesByUser(this, userToSearchWith);
    }

}
