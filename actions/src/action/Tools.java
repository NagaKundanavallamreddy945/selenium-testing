package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.id("userName")).sendKeys("kunna");
		d.findElement(By.id("userEmail")).sendKeys("nagakundana@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("vits");
		d.findElement(By.id("permanentAddress")).sendKeys("Jaladanki");
		Thread.sleep(2000);
		WebElement t=d.findElement(By.id("submit"));
		t.click();
		String s=d.findElement(By.xpath("//*[@id=\"output\"]/div")).getText();
		System.out.println(s);
		
		
		
		
		
		
	
		
	}

}
