package business;


public class MyPizzaMenue extends OvenPizza implements DevelopBusinessExtension, DevelopBusiness {

	@Override
	public void itemDeatails() {
		System.out.println("WE sell SMALL, MEDIUM, LARGE PIZZA");
		
	}

	@Override
	public void productPrice (){
		System.out.println("This is the price You have to pay : ");
		
	}

	
	
	@Override
	public void storeAdress() {
		System.out.println("164-55; Manhattan-Ny-11626");
		
	}

	@Override
	public void storeName() {
		System.out.println("*******VAI VAI STORE*******");
	
	}

	@Override
	public void handMadePizza() {
	
		System.out.println("Making Hand Made Pizza ");
	}
	

}
