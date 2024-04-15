public class MessageMemento {
    private Message state;

    public MessageMemento(Message msg) {
        this.state = msg;
    }

    public Message getState() {
        return state;
    }

    public void setState(Message msg) {
        this.state = msg;
    }

}
