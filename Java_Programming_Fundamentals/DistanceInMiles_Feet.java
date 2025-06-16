package bridgelabz;

import java.util.*;

//Write a program to find the distance in yards and miles for the distance provided by the user in feet

public class DistanceInMiles_Feet {
	public static void main(String[] args) {
		System.out.print("Distance in feet: ");
		Scanner sc = new Scanner(System.in);
		float feet = sc.nextInt();
		
//		1 mile = 1760 yards and 1 yard is 3 feet
		
		float yard = feet / 3;
		float mile = yard / 1760;
		
		System.out.println("Distance in mile is "+ mile + " and in yard is "+yard);
	}

}
