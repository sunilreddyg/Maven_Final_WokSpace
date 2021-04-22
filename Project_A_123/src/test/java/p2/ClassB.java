package p2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassB
{
  @Test
  public void tc004() 
  {
	  Reporter.log("tc004 executed successfull",true);
  }
  
  @Test
  public void tc005() 
  {
	  Reporter.log("tc005 executed successfull",true);
  }
  
  @Test
  public void tc006() 
  {
	  Reporter.log("tc006 executed successfull",true);
  }

  @Test
  public void LogoutTest() 
  {
	  Reporter.log("Logout successfull",true);
  }
}
