// import java.sql.Timestamp;
// import java.util.List;

// public class Message {
// private User sender;
// private List<User> recipients;
// private String timestamp;
// private String content;

// public Message(User sender, List<User> recipients, String content) {
// this.sender = sender;
// this.recipients = recipients;
// this.timestamp = new Timestamp(System.currentTimeMillis()).toString();
// this.content = content;
// }

// public User getSender() {
// return sender;
// }

// public List<User> getRecipients() {
// return recipients;
// }

// public String getTimestamp() {
// return timestamp;
// }

// public String getContent() {
// return content;
// }

// public void printMessage() {
// String recipients = "[ ";
// for (User u : this.recipients) {
// recipients += u.getUserName();
// recipients += " ";
// }
// recipients += "]";
// System.out.printf("\n+ FROM: %s\n| TO: %s\n| %s\n+ %s\n",
// this.sender.getUserName(), recipients,
// this.timestamp, this.content);
// }
// }