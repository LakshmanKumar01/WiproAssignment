package com.java8.advance;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceSorter {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("VIJ", "GNT", "HYD", "MNG");
		cities.sort(String::compareTo);
		System.out.println(cities);
	}
}
