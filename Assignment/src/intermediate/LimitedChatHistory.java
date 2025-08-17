package intermediate;

import java.util.ArrayDeque;

public class LimitedChatHistory {
	private ArrayDeque<String> chat = new ArrayDeque<String>();

	private static final int MAX_SIZE = 4;

	public void addMessage(String message) {
		if (chat.size() == MAX_SIZE) {
			chat.pollFirst();
		}
		chat.addLast(message);

	}

	public void printHistory() {
		System.out.println("Chat history:");
		for (String msg : chat) {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		LimitedChatHistory history = new LimitedChatHistory();
		history.addMessage("Hello");
		history.addMessage("How are you?");
		history.addMessage("Did you eat anything?");
		history.addMessage("What's up");
		history.addMessage("Bye");

		history.printHistory();
	}
}
