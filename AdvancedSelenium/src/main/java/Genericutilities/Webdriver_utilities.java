package Genericutilities;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Webdriver_utilities {
	   
	 
		public void  MaximizeWindow(WebDriver driver)
		{
			driver.manage().window().maximize();
			
		}
		
		public void implicitwait(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		public void Actionsmethod(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.moveToElement(element);
		}
		
//		public void logintoapplication(WebDriver driver)
//		{
//			
//		}
	}

