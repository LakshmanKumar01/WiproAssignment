package intermediate;

import java.util.PriorityQueue;

class JobPicker {
	String name;
	int urgency;

	public JobPicker(String name, int urgency) {
		this.name = name;
		this.urgency = urgency;
	}

	@Override
	public String toString() {
		return name + " (Urgency: " + urgency + ")";
	}
}

public class SmartJob {
	private PriorityQueue<JobPicker> job = new PriorityQueue<JobPicker>((a, b) -> {
		if (a.urgency != b.urgency)
			return Integer.compare(a.urgency, b.urgency);
		return Integer.compare(a.name.length(), b.name.length());
	});

	public void addJob(String name, int urgency) {
		job.add(new JobPicker(name, urgency));
	}

	public JobPicker pickNextJob() {
		return job.poll();
	}

	public static void main(String[] args) {
		SmartJob picker = new SmartJob();
		picker.addJob("Mail", 2);
		picker.addJob("Test", 3);
		picker.addJob("Write", 1);

		System.out.println("First job: " + picker.pickNextJob());
		System.out.println("Second job: " + picker.pickNextJob());
		System.out.println("Third job: " + picker.pickNextJob());
	}
}
