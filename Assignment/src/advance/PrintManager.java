package advance;

import java.util.concurrent.ArrayBlockingQueue;

public class PrintManager {
	private ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<String>(3);

	public void addJob(String jobName) {
		if (!printQueue.offer(jobName)) {
			System.out.println("Queue full! Skipping: " + jobName);
		}
	}

	public void printJob() {
		String job = printQueue.poll();
		if (job != null) {
			System.out.println("Printing: " + job);
		} else {
			System.out.println("No jobs to print");
		}
	}

	public static void main(String[] args) {
		PrintManager print = new PrintManager();
		print.addJob("Doc1");
		print.addJob("Based on Java");
		print.addJob("Python Programming");
		print.addJob(".Net");

		print.printJob();
		print.printJob();
		print.printJob();
	}

}
