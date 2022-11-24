package Testng1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;
	
  @Test(priority=1)
  public void f() {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com");
	  d.manage().window().maximize();
	  
	  
	  
  }
  @BeforeMethod()
  public void r() {
	  System.out.println("open");
	  
  }
  @Test(priority=5)
  public void g() {
	  System.out.println("close");
	  
  }
  @Test(priority=4)
  public void getTitle(){
	  System.out.println(d.getTitle());
	  
  }
  @Test(priority=2)
  public void getCurrentUrl(){
	  System.out.println(d.getCurrentUrl());
	  
  }
  @Test(priority=3) 
  public void Screenshot() throws IOException{
	  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src,new File("d://today.png"));
		  
  }
  @AfterMethod()
  public void close() {
	  d.close();
  }
  
}
