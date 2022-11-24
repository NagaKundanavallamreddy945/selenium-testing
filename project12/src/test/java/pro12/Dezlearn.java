package pro12;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dezlearn {
	WebDriver d;
	@Given("user is in dezlearn.com")
	public void user_is_in_dezlearn_com() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    d=new ChromeDriver(); 
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
		
	    
	}

	@When("user gets the url and title")
	public void user_gets_the_url_and_title() {
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		
		
	    
	}

	@Then("user works on alert")
	public void user_works_on_alert() throws InterruptedException {
		d.findElement(By.id("s_alert1")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);
		
		
	    
	}

	@And("closes the site")
	public void closes_the_site() {
		d.close();
		
		
				
				
	    
	}



}
