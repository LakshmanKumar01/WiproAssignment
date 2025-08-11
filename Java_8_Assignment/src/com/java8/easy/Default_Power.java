package com.java8.easy;

interface Power {
	void ePower();

	default void tPower() {
		System.out.println("default method");
	}
}

class Impl implements Power {
	@Override
	public void ePower() {
		System.out.println("Abstract method Implementation");
	}
}

public class Default_Power {
	public static void main(String[] args) {
		Impl imp = new Impl();
		imp.ePower();
		imp.tPower();
	}
}
