package com.java8.easy;

import java.util.Arrays;
import java.util.List;

public class Simple_Name_Sorter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sai", "kumar", "abhi", "madhav", "jehu");
		names.sort((a, b) -> a.compareTo(b));
		System.out.println(names);
	}
}
