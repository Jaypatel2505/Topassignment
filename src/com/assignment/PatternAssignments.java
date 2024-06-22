package com.assignment;
/*
 * 		1
 * 	   2 2
 * 	  3 3 3
 * 	 4 4 4 4

 */
public class PatternAssignments {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int k = i; k <=5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}	
	}

}
