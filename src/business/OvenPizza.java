package business;

import java.util.Scanner;

public abstract class OvenPizza extends HandMadePizza{
	static String ovenMade;
	static String handMade;
	//static Scanner scan= new Scanner(System.in);
	static String unUsed;
	static double cost;


	static String choise;
	public void pizzaType() {

		Scanner scan= new Scanner(System.in);
		System.out.println("What Type of Pizza You Like: OVEN_Pizza(oP) OR HAND_Pizza(hP)");
		choise= scan.nextLine();
		String oP = "oP" ;
		String hP = "hP" ;



		try {do {

			if (choise.equalsIgnoreCase(oP)) {
				String size;
				Scanner sizwScanner= new Scanner(System.in);
				System.out.println("PLease Chose Pizza Size: (S)    (M)    (L)");

				size = sizwScanner.nextLine();

				switch (size) {
				case "S":
					//cost=  10;
					System.out.println(10);
				case "M":
					//cost =12;
					System.out.println(11);
				case "L":
					//cost =14;
					System.out.println(14);

				}}else if (choise.equalsIgnoreCase(hP)) {
					String size;
					Scanner sizwScanner= new Scanner(System.in);
					System.out.println("PLease Chose Pizza Size: (p)    (q)    (r)");
					size= sizwScanner.nextLine();
					switch (size) {
					case "p":

						//cost=  12;
						System.out.println(12);
					case "q":
						//	cost =14;
						System.out.println(14);
					case "r":
						//cost =16;
						System.out.println(16);
					}}}
		
		while (choise .equalsIgnoreCase(unUsed));



		}finally {

		}

		//catch (Exception e) {
		// TODO: handle exception

	}}





























