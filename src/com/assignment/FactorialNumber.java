package com.assignment;
import java.util.Scanner;
/*
 * W.A.J.P to find factorial for Given Number.
 */
public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i = 1, fact=1;
	    System.out.println("Enter the number: ");
	    num=sc.nextInt();
	    
	    
//	    while (i<=num) {
//			num = num*i;
//			num++;
//		}
	    while(i<=num)
	    {
	        fact=fact*i;
	        i++;
	    }
	    System.out.println("Factorial of the number: "+fact);
	    
//	    Fact = n*(n-1);
	}
}
