package Testng;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void f() {
	  System.out.println("cus details successfully updated");
	  
  }
  @Test(priority=3)
  public void r() {
	  System.out.println("collected");
	  
  }
  @Test
  public void s() {
	  System.out.println("delivered");
	  
  }
  @Test(priority=4)
  public void e() {
	  System.out.println("logoff");
	  
  }
  
  
}
