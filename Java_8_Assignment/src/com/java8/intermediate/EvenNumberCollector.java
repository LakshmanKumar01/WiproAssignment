package com.java8.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberCollector {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 44);
		List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers are :" + even);
	}
}
