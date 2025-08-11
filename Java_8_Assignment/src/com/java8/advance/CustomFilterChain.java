package com.java8.advance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomFilterChain {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ananta", "Anitha", "Annaya", "Annamaya", "Kumar");
		Predicate<String> startsWithA = name -> name.startsWith("A");
		Predicate<String> endsWithA = name -> name.endsWith("a");
		List<String> filterName = names.stream().filter(startsWithA.and(endsWithA)).collect(Collectors.toList());
		System.out.println(filterName);
	}
}
