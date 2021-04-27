package p4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassD 
{
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


  @Test
  public void Captureallscreenshots() 
  {
	  Reporter.log("Sceens capture");
	 
  }
  
  @Test
  public void sendemails() 
  {
	  Reporter.log("emails forwarded");
	 
  }
  
  @Test
  public void Createreport_123() 
  {
	  Reporter.log("Reports generated for entire testcases",true);
	 
  }
}
