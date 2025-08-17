package advance;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ChatProcessor {
	private BlockingDeque<String> chatBuffer = new LinkedBlockingDeque<String>(5);

	public void addMessage(String message) throws InterruptedException {
		chatBuffer.put(message);

		System.out.println("Added: " + message);
	}

	public void readMessage() throws InterruptedException {
		String msg = chatBuffer.take();
		System.out.println("Read: " + msg);
	}

	public static void main(String[] args) {
		ChatProcessor pro = new ChatProcessor();

		Thread producer = new Thread(() -> {
			String[] messages = { "Hi", "Are you fine?" };

			for (String msg : messages) {
				try {
					pro.addMessage(msg);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
		Thread consumer = new Thread(() -> {
			for (int i = 0; i < 6; i++) {
				try {
					pro.readMessage();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
		producer.start();
		consumer.start();
	}
}
