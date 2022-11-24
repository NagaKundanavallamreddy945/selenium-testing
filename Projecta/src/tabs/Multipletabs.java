package tabs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");

	}

}
