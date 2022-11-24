package amazonpage;

import org.testng.annotations.AfterTest;

public class closing extends operation{
  @AfterTest
  public void close() {
  d.close();
  }
}
