package advance;

import java.util.concurrent.LinkedBlockingQueue;

class Task {
	int id;
	String desc;

	public Task(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Task{id=" + id + ", desc='" + desc + "'}";
	}
}

public class StageBasedTaskRunner {
	private LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
	private LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

	public void addTaskToStage1(Task task) throws InterruptedException {
		stage1.put(task);
		System.out.println("Added to Stage 1: " + task);
	}

	public void processStage1() throws InterruptedException {
		while (!stage1.isEmpty()) {
			Task task = stage1.take();
			System.out.println("Processing Stage 1: " + task);
			if (task.id % 2 == 0) {
				stage2.put(task);
				System.out.println("Moved to Stage 2: " + task);
			}
		}
	}

	public void processStage2() throws InterruptedException {
		while (!stage2.isEmpty()) {
			Task task = stage2.take();
			System.out.println("Processing Stage 2: " + task);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		StageBasedTaskRunner runner = new StageBasedTaskRunner();
		runner.addTaskToStage1(new Task(1, "Clean"));
		runner.addTaskToStage1(new Task(2, "Cook"));
		runner.addTaskToStage1(new Task(3, "Wash"));
		runner.addTaskToStage1(new Task(4, "Shop"));

		runner.processStage1();
		runner.processStage2();
	}
}