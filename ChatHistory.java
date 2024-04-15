// import java.util.ArrayList;
// import java.util.List;

// public class ChatHistory {
// private List<Message> history;
// private MementoCareTaker careTaker;

// public ChatHistory() {
// history = new ArrayList<>();
// careTaker = new MementoCareTaker();
// }

// public void recordMessage(Message msg) {
// this.history.add(msg);
// }

// public void saveState(Message msg) {
// careTaker.add(new MessageMemento(msg));
// }

// public void recall() {
// history.remove(getLastMsgSent());
// careTaker.recall();
// }

// public void getRecalled(Message msg) {
// history.remove(msg);
// }

// public void prompt() {
// for (Message m : history) {
// m.printMessage();
// }
// }

// public Message getLastMsgSent() {
// return careTaker.get().getState();
// }
// }
