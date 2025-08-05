package com.oracle;

public class TestLoops {
	public static void main(String[] args) {
		String[] iplTeams = {"RCB", "MI", "CSK", "KKR", "RR"};
		// enhanced for loop - it doesn't need any index or expression - for(type v : coll)
		// it also called as for - each
		// traditional for loop still works in Java
		for(String team : iplTeams) {
			System.out.println(team);
		}
		/*
		 * Other types of loops are: while & do-while
		 */
		int counter = 5;
		do {
			System.out.println("Counter = "+counter);
			counter++;
		} while(counter < 5);
	}
}
