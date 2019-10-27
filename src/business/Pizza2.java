package business;

import java.util.Scanner;

public abstract class Pizza2 extends Pizza {

	public void getInput() {
		String name;
		String productName;
		double price;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Customer Namne: ");
		name= scan.nextLine();
		System.out.println("Please Enter Product Namne: ");
		productName = scan.nextLine();
		System.out.println("Please Enter Product price : ");
		price= scan.nextDouble();

	}

}
