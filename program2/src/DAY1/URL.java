package DAY1;

import org.openqa.selenium.chrome.ChromeDriver;

public class URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com/");
		d.manage().window().maximize();
		d.getCurrentUrl();

	}

}
