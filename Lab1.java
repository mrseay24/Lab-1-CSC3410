/*
 * CSC3420 - Spring 2015
 * Sidney Seay - sseay5@student.gsu.edu
 * DateDue: 01-15-2015
 * Assignment: 1, Lab1 code
 * File(s): Lab1.java
 */

//Calculates cube root of decimal number

import java.util.Scanner;
 public class Lab1 {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);  //ask user for input
	 System.out.print("Enter a decimal number: ");
      double a = sc.nextDouble();     
      double b = Math.cbrt(a);//calculates the cube root
	 System.out.println("The result is " +b );//displays result
	sc.close();
 }
 
 }
 