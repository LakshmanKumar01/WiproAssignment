package com.java8.advance;

import java.util.Arrays;
import java.util.List;

public class ParallelSquarePrinter {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.parallelStream().forEach(n -> System.out.println(n + "^2 = " + (n * n)));
	}
}
