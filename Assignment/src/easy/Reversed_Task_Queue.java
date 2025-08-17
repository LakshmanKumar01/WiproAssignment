package easy;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Reversed_Task_Queue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> tasks = new LinkedList<>();
		System.out.println("Enter 4 tasks");
		for (int i = 0; i < 4; i++) {
			String task = sc.nextLine().trim();
			if (task.endsWith("!")) {
				tasks.addFirst(task);
			} else {
				tasks.addLast(task);
			}
		}
		System.out.println("\nTasks in reverse order");
		ListIterator<String> it = tasks.listIterator(tasks.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		sc.close();
	}
}
