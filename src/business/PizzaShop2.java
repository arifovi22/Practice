package business;


public class PizzaShop2 extends Pizza2 implements DevelopBusinessExtension, DevelopBusiness {

	@Override
	public void itemDeatails() {
		System.out.println("WE sell SMALL, MEDIUM, LARGE PIZZA");
		
	}

	@Override
	public void netAmountPay (){
		System.out.println("This is the price You have to pay : ");
		
	}

	@Override
	public void wellcome() {
		System.out.println("Wellcome to our Store");
		
	}

	
	@Override
	public void storeAdress() {
		System.out.println("164-55; Manhattan-Ny-11626");
		
	}

	@Override
	public void storeName() {
		System.out.println("*******VAI VAI STORE*******");
	
	}
	

}
