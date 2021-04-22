package p4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassD {
  @Test
  public void openBrowser() 
  {
	  Reporter.log("Browser is opened");
  }
  
  @Test
  public void closebrowser() 
  {
	  Reporter.log("close browser");
	  Reporter.log("End browser");
  }
}
