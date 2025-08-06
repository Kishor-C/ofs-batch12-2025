package com.oracle;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestCollection {
	public static void main(String[] args) {
		Set<String> strings;
		strings = new HashSet<String>(); // random order
		//change HashSet<> to new TreeSet<>, new LinkedHashSet<>
		// Use List<String> and assign LinkedList and ArrayList
		strings.add("hello");
		strings.add("HELLO");
		strings.add("Welcome");
		strings.add("Thanks");
		strings.add("hello");
		printStringItems(strings);
	}
	// Try to use List, Set & Queue as the reference as much as possible
	public static void printStringItems(Collection<String> items) {
		for(String item : items) {
			System.out.println(item);
		}
		System.out.println("*****************************");
	}
}
