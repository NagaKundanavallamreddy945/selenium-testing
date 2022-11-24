package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Defaultconstructor {
	WebDriver d;
	Defaultconstructor(){
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.findElement(By.id("Username")).sendKeys("kunna");
		d.findElement(By.id("Password")).sendKeys("123");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultconstructor d1=new Defaultconstructor();
		

	}

}
