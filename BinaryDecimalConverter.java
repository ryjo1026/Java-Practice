/*
 * PROJECT: Binary to Decimal and Back Converter
 * DESCRIPTION: Develop a converter to convert a decimal number to binary or a binary number to its 
 * 				decimal equivalent.
 * COMPLETED: 7/9/15
 */

package Numbers;

import java.util.Scanner;

public class BinaryDecimalConverter {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int mode;
		long decimal;
		String Binary= null;
		
		//Asks for and stores which way the user wants to convert
		System.out.println("Are you converting (1)From Decimal to Binary or (2)From Binary to Decimal?");
		mode=scanner.nextInt();
		if(mode>2){
			System.out.println("ERROR:Input not valid");
		}
		
		//Asks for and takes in different data types depending on the direction of the conversion
		if(mode==1){
			System.out.println("What Decimal number would you like to convert to Binary?");
			decimal=scanner.nextLong();
			System.out.println();
			System.out.println("Your converted number is: "+decimalBinary(decimal));
		}
		
		else if(mode==2){
			System.out.println("What Binary number would you like to convert to Decimal?");
			Binary=scanner.next();
			if(binaryDecimal(Binary)==0000000000)
				System.out.println("ERROR: Binary numbers can only contain 1s and 0s");
			else{
				System.out.println();
				System.out.println("Your converted number is: "+binaryDecimal(Binary));
			}
		}
		scanner.close();
	}
	
	public static long binaryDecimal(String b){
		long decimal=0;
		
		//For loop starts at right of number and moves left
		for(int i=b.length()-1; i>=0 ; i--){
			//If the number found is 1 add 2^i to the answer
			if(b.charAt(i)=='1'){
				decimal+=(Math.pow(2, b.length()-i-1));
			}
			//If the number found is 2 do nothing
			else if(b.charAt(i)=='0'){
				decimal+=0;
			}
			//Sloppy way for error
			else{
				decimal=0000000000;
				break;
			}
		}
		return decimal;
	}
	
	public static String decimalBinary(long d){
		String Binary="";
		while(d>0){
			Binary+=d%2;
			d=d/2;
		}
		return Binary;
		
	}
	

}
