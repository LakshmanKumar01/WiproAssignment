package com.java8.easy;

interface Message {
	void print(String message);
}

class Print {
	static void process(String msg, Message printer) {
		printer.print(msg);
	}
}

public class Message_Printer {
	public static void main(String[] args) {
		Message printer = message -> System.out.println("Message: " + message);
		Print.process("hello", printer);
	}
}
