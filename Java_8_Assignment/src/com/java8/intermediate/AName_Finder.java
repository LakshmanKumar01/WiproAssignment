package com.java8.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AName_Finder {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Arjun", "Ambani", "Kumar");
		List<String> namesStartWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println("Names start with A :" + namesStartWithA);
	}
}
