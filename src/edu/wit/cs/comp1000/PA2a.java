package edu.wit.cs.comp1000;

import java.util.Scanner;


/**
 * This program takes 5 numbers from the user and detects the number of positive and negative numbers takes the sum of all 
 * then takes the averages respectivly 
 * 
 * @author William Angel
 */

public class PA2a {

	/**
	 * This starts the program and outputs the sum of the positive, negative, and all numbers
	 * Then calculates the averages respectively 
	 * 
	 * @param args comman-line arguments,ignored
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
System.out.printf("Enter five whole numbers: ");

int sumALL = 0;
int sum_pos_num = 0;
int sum_neg_num = 0;
int sum_all_num = 0;
int count_positive = 0;
int count_negative = 0;
	
// Read 5 numbers from user and add them together 
for(int i = 0; i < 5; i++) {
	int num = input.nextInt();
	sumALL += num;
	
// Detects if numbers are positive and counts the number of positive integers 
	if (num > 0) {
		sum_pos_num += num;
		
		count_positive++;
		
	}else { 
		sum_neg_num += num;
		count_negative++;
		
	}
	
}
	

//Calculate averages
double avgALL = sumALL / 5.0;
double avgPositive = (count_positive > 0) ? (sum_pos_num / (double) count_positive) : 0.0;
double avgNegative = (count_negative > 0) ? (sum_neg_num / (double) count_negative) : 0.0;

//output results to console

if (count_positive == 1) {
	System.out.println("The sum of the 1 positive number: " + sum_pos_num);
}else {System.out.println("The sum of the " + count_positive + " positive numbers: " + sum_pos_num);

}

if (count_negative == 1) {
    System.out.println("The sum of the 1 non-positive number: " + sum_neg_num);
} else {
    System.out.println("The sum of the " + count_negative + " non-positive numbers: " + sum_neg_num);
}

System.out.println("The sum of the 5 numbers: " + sumALL);

if (count_positive == 1) {
    System.out.printf("The average of the 1 positive number: %.2f%n", avgPositive);
} else {
    System.out.printf("The average of the %d positive numbers: %.2f%n", count_positive, avgPositive);
}

if (count_negative == 1) {
    System.out.printf("The average of the 1 non-positive number: %.2f%n", avgNegative);
} else {
    System.out.printf("The average of the %d non-positive numbers: %.2f%n", count_negative, avgNegative);
}


System.out.printf("The average of the 5 numbers: %.2f%n",avgALL);




	
	

		
	}

}
