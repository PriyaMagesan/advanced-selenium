package Repository;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomforcreatecampaign {
	
       WebDriver driver;

	public pomforcreatecampaign(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="user_name")
	private WebElement usertextfield;
	
	@FindBy(name="user_password")
	private WebElement passwordtextfield;
	
	@FindBy(id="submitButton")
	private WebElement submitbutton;
	
	public WebElement getUsertextfield() {
		return usertextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

    public void logintoapplication(String username,String password)
    {
    	usertextfield.sendKeys(username);
    	passwordtextfield.sendKeys(password);
    	submitbutton.click();
    }
    
        

}

