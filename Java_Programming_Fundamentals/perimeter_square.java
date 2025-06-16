package bridgelabz;

import java.util.*;

//Write a program to find the side of the square whose parameter you read from the user 

public class perimeter_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("perimeter of sqaure: ");
		Scanner sc = new Scanner(System.in);
		float perimeter = sc.nextInt();
		
		double side = perimeter / 4;
		
		System.out.println("The length of the side is "+ side +" whose perimeter is "+ perimeter);

	}

}
