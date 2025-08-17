package intermediate;

import java.util.ArrayDeque;

public class GroceryLineShuffle {
	ArrayDeque<String> queue = new ArrayDeque<String>();

	public void addCustomer(String name) {
		if (name.length() % 2 == 0) {
			queue.addFirst(name);
		} else {
			queue.addLast(name);
		}
	}

	public String serve() {
		if (queue.isEmpty()) {
			return null;
		}
		return queue.removeFirst();
	}

	public void printQueue() {
		System.out.println(queue);
	}

	public static void main(String[] args) {
		GroceryLineShuffle grocery = new GroceryLineShuffle();
		grocery.addCustomer("Oil");
		grocery.addCustomer("Rice");
		grocery.addCustomer("Vegetables");
		grocery.addCustomer("Fruits");
		System.out.println("Current Queue: ");
		grocery.printQueue();
		System.out.println("Serving: " + grocery.serve());
		System.out.println("Queue after serving: ");
		grocery.printQueue();
	}
}
