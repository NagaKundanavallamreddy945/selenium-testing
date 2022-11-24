package project4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	WebDriver d;
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/home/automation");
		d.manage().window().maximize();
	}
	public void signup() {
		d.findElement(By.linkText("Sign Up")).click();
	}
	public void register() {
		d.findElement(By.id("FirstName")).sendKeys("KUNDANA");
		d.findElement(By.id("Surname")).sendKeys("VREDDY");
		d.findElement(By.id("E_post")).sendKeys("star");
		d.findElement(By.id("Mobile")).sendKeys("9999999999");
		d.findElement(By.id("Username")).sendKeys("kundana945");
		d.findElement(By.id("Password")).sendKeys("Kundana945#");
		d.findElement(By.id("ConfirmPassword")).sendKeys("Kundana945#");
		d.findElement(By.id("submit")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scenario1 s1 = new Scenario1();
		s1.openUrl();
		s1.signup();
		s1.register();
		Thread.sleep(2000);
		

	}

}
