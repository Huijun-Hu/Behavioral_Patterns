import java.util.Stack;

public class MementoCareTaker {
    private Stack<MessageMemento> history = new Stack<>();

    public void add(MessageMemento state) {
        history.push(state);
    }

    public MessageMemento get() {
        return history.peek();
    }

    public void recall() {
        history.pop();
    }
}
