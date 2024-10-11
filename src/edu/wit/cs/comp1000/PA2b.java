package edu.wit.cs.comp1000;

import java.util.Scanner;
import java.lang.Math;

/**
 * Solution to second programming assignment solves for x using the quadratic equation taking the user inputed a b and c 
 * 
 * @author William Angel
 */

public class PA2b {
/**
 * this starts the program and reads the user input to calculate the discriminate and the roots
 * @param args comman-lines arguments, ignored 
 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a b c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		
		double d = (b*b) - (4*a*c);
		
		
		if (d < 0) {
			System.out.println("Roots: imaginary");
			
		}
		
		else if (d == 0) {
			
			double root = (-b) / (2*a);
			
			System.out.printf("Root: %.2f%n", root);
			
		}
		
		
		else {
			
			double root1 = (-b + Math.sqrt(d)) / (2*a);
			double root2 = (-b - Math.sqrt(d)) / (2*a);
			
			double smallerroot = Math.min(root1, root2);
			double largerroot = Math.max(root1, root2);
			
			System.out.printf("Roots: %.2f, %.2f%n", smallerroot, largerroot);
			
		}
	}

}
