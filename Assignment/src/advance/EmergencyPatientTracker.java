package advance;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
	String name;
	int severity; // Lower is more severe
	long timestamp; // For tiebreaker (addition order)

	public Patient(String name, int severity, long timestamp) {
		this.name = name;
		this.severity = severity;
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return name + " (Severity: " + severity + ")";
	}
}

public class EmergencyPatientTracker {
	private PriorityQueue<Patient> queue = new PriorityQueue<>(5,
			Comparator.comparingInt((Patient p) -> p.severity).thenComparingLong(p -> p.timestamp));
	private static final int MAX_SIZE = 5;

	public void addPatient(String name, int severity) {
		if (queue.size() >= MAX_SIZE) {
			System.out.println("Queue full! Cannot add: " + name);
			return;
		}
		long ts = System.nanoTime();
		queue.add(new Patient(name, severity, ts));
		System.out.println("Added: " + name);
	}

	public void treatPatient() {
		Patient p = queue.poll();
		if (p == null) {
			System.out.println("No patients.");
		} else {
			System.out.println("Treating: " + p);
		}
	}

	public static void main(String[] args) {
		EmergencyPatientTracker tracker = new EmergencyPatientTracker();
		tracker.addPatient("Alice", 4);
		tracker.addPatient("Bob", 2);
		tracker.addPatient("Charlie", 2);
		tracker.addPatient("Diana", 1);
		tracker.addPatient("Eve", 3);
		tracker.addPatient("Frank", 5); // Should not be added (queue max)

		tracker.treatPatient(); // Treat Diana (1)
		tracker.treatPatient(); // Treat Bob (2, earlier than Charlie)
		tracker.treatPatient(); // Treat Charlie (2)
		tracker.treatPatient(); // Treat Eve (3)
		tracker.treatPatient(); // Treat Alice (4)
		tracker.treatPatient(); // No patients
	}
}