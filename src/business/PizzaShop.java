package business;

import org.omg.CORBA.PRIVATE_MEMBER;

public class PizzaShop extends MyPizzaMenue{

	private String Customername;
	private String customerPhoneNumber;
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
	
	
	
	

}
