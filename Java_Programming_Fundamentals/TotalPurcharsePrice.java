package bridgelabz;
import java.util.*;

//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

public class TotalPurcharsePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("wrfite Unit Priced and Quantity brought: ");
		float price = sc.nextInt();
		float quantity = sc.nextInt();
		
		float purchase = price * quantity;
		
		System.out.println("The total purchase price is INR "+ purchase+" if the quantity "+ quantity+ " unit and unit price is INR "+price);

	}

}
