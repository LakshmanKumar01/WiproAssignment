package com.java8.easy;

import java.util.Optional;
import java.util.Scanner;

public class Safe_Divider {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the diviend");
		int dividend = sc.nextInt();
		System.out.println("Enter the divisor");
		int divisor = sc.nextInt();
		Optional<Integer> divisorOpt = divisor == 0 ? Optional.empty() : Optional.of(divisor);
		String result = divisorOpt.map(d -> String.valueOf(dividend / d)).orElse("not allowed");
		System.out.println("Result: "+result);
		sc.close();
	}
}
