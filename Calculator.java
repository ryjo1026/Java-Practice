/*
 * PROJECT: Calculator
 * DESCRIPTION: A simple calculator to do basic operators. Make it a scientific calculator
 *  			for added complexity.
 * COMPLETED:
 */

package Numbers;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter two numbers and then an operator");
		System.out.println("(Accepted operators are +, -, *, /)");
		long value1= scanner.nextLong();
		long value2= scanner.nextLong();
		
		if(scanner.nextLine().equals("+"))
			System.out.println(value1+value2);
		if(scanner.nextLine().equals("-"))
			System.out.println(value1-value2);
		if(scanner.nextLine().equals("*"))
			System.out.println(value1*value2);
		if(scanner.nextLine().equals("/"))
			System.out.println(value1/value2);

		scanner.close();
		
	}

}
