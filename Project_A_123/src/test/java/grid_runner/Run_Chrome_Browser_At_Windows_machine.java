package grid_runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Run_Chrome_Browser_At_Windows_machine {

	public static void main(String[] args) throws MalformedURLException {
		

		  String Node_url="http://192.168.1.9:36688/wd/hub";
		  
		  DesiredCapabilities caps=new DesiredCapabilities().chrome();
		  caps.setBrowserName("chrome");
		  caps.setPlatform(Platform.WINDOWS);
		  
		  WebDriver driver=new RemoteWebDriver(new URL(Node_url), caps);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://outlook.com");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		  System.out.println("Signin button clicked");

	}

}
