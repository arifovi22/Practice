package runBusiness;

import business.PizzaShop;

public class TestPizza {
	public static void main(String[] args) {
		
		
		PizzaShop myPizza =new  PizzaShop();
		
		
		myPizza.storeName();
		myPizza.storeAdress();
		myPizza.itemDeatails();
		myPizza.setCustomername("Arif");
		System.out.println("Customer Name: "+ myPizza.getCustomername());
		myPizza.setCustomerPhoneNumber("0192826356");
		System.out.println("Customer Phone Number: " +myPizza.getCustomerPhoneNumber());
		
		System.out.println("============================================");
		
		myPizza.handMadePizza();
		myPizza.ovenPizza();
		
		System.out.println("============================================");
		
		
		
		myPizza.productPrice();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
