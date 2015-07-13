/*
 * PROJECT: Prime Factorization
 * DESCRIPTION: Have the user enter a number and find all Prime Factors (if there are any) 
 * 				and display them.		
 * COMPLETED: 6/15/15
 */

package Numbers;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		//Instantiates main variable for user given number
		int num;
		
		//Asks for and Reads user input
		System.out.println("What number would you like to find the prime factors of?");
		num=scanner.nextInt();
		scanner.close();
		
		//Runs a loop that checks if a the main number is divisible by a number and then divides by that number until all factors are found
		int i=2;
		System.out.println("");
		System.out.println("Your factors are:");
		while(i>1){
			if(num%i==0){
				System.out.println(i);
				num=num/i;
			}
			else
				i++;
		}
		

	}

}
