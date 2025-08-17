package easy;

import java.util.Scanner;

public class Average_Confusion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int count = 5;
		System.out.println("Enter the numbers");
		for (int i = 0; i < count; i++) {
			double num = sc.nextInt();
			if (num < 10) {
				num = num * 2;
			}
			sum += num;
		}
		double avg = sum / count;
		System.out.println("Avg is: " + avg);
		sc.close();
	}
}
