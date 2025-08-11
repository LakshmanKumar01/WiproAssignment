package com.java8.intermediate;

import java.util.Arrays;
import java.util.List;

public class WordCounter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sai", "kumar", "lakshman");
		long count = names.stream().filter(name -> name.length() > 5).count();
		System.out.println("Number of words that are greater than 5 characters are :" + count);

	}
}
