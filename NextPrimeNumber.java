/*
 * PROJECT: Next Prime Number
 * DESCRIPTION: Have the program find prime numbers until the user chooses to stop asking for the next one.		
 * COMPLETED: 6/15/15
 */

package Numbers;

import java.util.Scanner;

public class NextPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//Instantiates boolean to limit prime number to one per enter pressed
		boolean findNext=true;
		
		//Instantiates variable to track how many times a number is divisible by another
		int count;
		
		//Instantiates variable that the scanner looks for to calculate the next number
		String AffirmativeCommand="";
		
		//Startup instructions
		System.out.println("Press enter to find the next prime number");
		
		//Checks if user has asked to go on
		if (findNext == true){
			
			//For loop for dividend
			for (int i = 1; i > 0; i++) {
				count = 0;
				
				//For loop for divisor that checks each value for the dividend
				for (int j = 1; j < i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				
				//If the dividend is divisible by any divisor the if statement will not run
				if (count == 1){
					System.out.println(i);
					findNext=false;
					if(scanner.nextLine().equals(AffirmativeCommand))
						findNext=true;
				}
			}
		}else{
			scanner.close();
		}
		
	}
}
