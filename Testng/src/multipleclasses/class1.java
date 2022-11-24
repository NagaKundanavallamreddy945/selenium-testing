package multipleclasses;

import org.testng.annotations.Test;

public class class1 {
  @Test(priority=1)
  public void login() {
	System.out.println("welcome to newtours");  
  }
  @Test(priority=2)
  public void login1() {
	System.out.println("cus updated");  
  }
  @Test(priority=3)
  public void login2() {
	System.out.println("pro updated");  
  }
  
    
}
