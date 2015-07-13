/*
 * PROJECT: Fibonacci Sequence
 * DESCRIPTION: Enter a number and have the program generate the Fibonacci sequence to 
 * that number or to the Nth number.			
 * COMPLETED: 6/14/2015
 */

package Numbers;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		//Instantiates variable for nDigits of Fibonacci Sequence
		int nDigits;
		
		//Asks for and reads how many digits of the sequence the user wants
		System.out.println("How many digits of the Fibonacci Sequence would you like?");
		nDigits=scanner.nextInt();
		scanner.close();
		
		//Instantiates variables for lastNumber
		int lastNumber=0;
		//This variable is to make a backup for the variable that is changed first in the loop
		int lastNumberBak=0;
		int currentNumber=1;
		
		
		//loops the process of adding the last 2 numbers and then moving them up in position
		for(int i=0; i<=nDigits; i++){
			if (currentNumber>= 1836311903){
				System.out.println("Limit exceeded");
				break;
			}
			System.out.println(currentNumber);
			lastNumber=currentNumber;
			currentNumber+=lastNumberBak;
			lastNumberBak=lastNumber;
		}
	}

}
