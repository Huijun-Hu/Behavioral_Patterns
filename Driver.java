// import java.util.Arrays;

// public class Driver {
// public static void main(String[] args) {

// ChatServer centralServer = new ChatServer();
// User adam = new User("Adam");
// centralServer.registerUser(adam);

// User eva = new User("Eva");
// centralServer.registerUser(eva);

// User bob = new User("Bob");
// centralServer.registerUser(bob);

// User scamer = new User("Scamer");
// centralServer.registerUser(scamer);
// centralServer.block(scamer);

// adam.sendMessage(Arrays.asList(new User[] { eva }), "Hello");
// adam.sendMessage(Arrays.asList(new User[] { eva, bob }), "This is Adam.");

// scamer.sendMessage(Arrays.asList(new User[] { adam, eva }), "Please pay!!!");

// adam.viewChatHistory();
// eva.viewChatHistory();
// bob.viewChatHistory();

// System.out.print("\n@@@ Last Message sent by Adam @@@");
// adam.getChatHistory().getLastMsgSent().printMessage();
// adam.undoMessage();
// System.out.print("\n@@@ Updated Last Message sent by Adam @@@");
// adam.getChatHistory().getLastMsgSent().printMessage();

// adam.viewChatHistory();
// eva.viewChatHistory();
// bob.viewChatHistory();
// }
// }
