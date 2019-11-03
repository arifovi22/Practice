package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomateSignup {

	public static void signUp() {
	

	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver.exe");
		 WebDriver signup = new ChromeDriver();
		signup.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		
		
		
		
		signup.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).click();
		
		signup.findElement(By.id("jqSignup")).click();
		signup.findElement(By.id("txtEmail")).sendKeys("Quazi@Pazi.com");
		signup.findElement(By.id("txtUserName")).sendKeys("Quazi Pazi");
		signup.findElement(By.id("txtPassword")).sendKeys("QuaziPazi");
		signup.findElement(By.id("txtCnfPassword")).sendKeys("QuaziPazi");
		
		signup.findElement(By.id("txtFirstName")).sendKeys("Quazi");
		
		signup.findElement(By.id("txtLastName")).sendKeys("Pazi");
		
		signup.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input")).sendKeys("PAZI HOUSE");
		signup.findElement(By.name("check_news")).click();
		signup.findElement(By.id("btnRegister")).click();
	


	}
public static void main(String[] args) {
	signUp();
	
	try {
		Thread.sleep(3000);
	
	} catch (Exception e) {
		System.out.println(e);
		}
	
	
	
	//signup.close();
	
	
	
}



}
