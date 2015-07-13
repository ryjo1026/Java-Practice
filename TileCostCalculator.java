/*
 * PROJECT: Find Cost of Tile to Cover W x H Floor
 * DESCRIPTION: Calculate the total cost of tile it would take to cover a floor plan of width and height, 
 * 				using a cost entered by the user.
 * COMPLETED: 6/16/15
 */

package Numbers;

import java.util.Scanner;

public class TileCostCalculator {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double width;
		double height;
		double cost;
		
		System.out.println("What is the width of the area you would like to tile?");
		width=scanner.nextDouble();
		
		System.out.println("What is the height of the area you would like to tile?");
		height=scanner.nextDouble();
		
		System.out.println("What is the cost per square unit of tile?");
		cost=scanner.nextDouble();
		
		System.out.println("Your area of" + width*height + " un^2 will cost $" + cost*width*height + " to tile");
		
		scanner.close();

	}

}
