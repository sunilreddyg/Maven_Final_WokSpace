package p3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassC 
{
  @Test(priority=0)
  public void firstTest() 
  {
	  Reporter.log("first test method");
  }
  
  @Test
  public void SecondTest()
  {
	  Reporter.log("Second test finishded");
  }
}
