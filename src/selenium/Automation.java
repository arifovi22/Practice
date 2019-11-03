package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Automation {
public static void main (String [] args) {
	//System.setProperty("WebDriver.chrome.driver","C:\\Users\\Arif\\eclipse project\\Practice\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver.exe");
	WebDriver myDriver= new ChromeDriver();
	
	myDriver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
	
	
	
	
	myDriver.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).click();
	
	
	
	//enter username & password
	//
	
	myDriver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");
	myDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
	//login
	myDriver.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();
	try {
		Thread.sleep(1000);
	
	} catch (Exception e) {
		System.out.println(e);
		}
	
	//test actual user pass or fail
	String actualProfile = myDriver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();
	String expectedProfile ="JAMES WILLIAMS";
	if (actualProfile.equalsIgnoreCase( expectedProfile)) {
		System.out.println("Test pass....");
		
	} else {
		System.out.println("Test failed....");

	}
				
	
	try {
		Thread.sleep(2000);
	
	} catch (Exception e) {
		System.out.println(e);
		}	
	//logout
			
		myDriver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).click();	
		myDriver.findElement(By.xpath("//*[@id=\"drp_div\"]/ul/li/div/div[3]/a")).click();

	
		try {
			Thread.sleep(2000);
		
		} catch (Exception e) {
			System.out.println(e);
			}	

		
		
		
			
			myDriver.close();
	
}
	
	
	
	
	
	
	
	
	
	
}
