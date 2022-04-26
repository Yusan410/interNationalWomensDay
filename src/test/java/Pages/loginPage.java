package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class loginPage {
	
	public loginPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")
	public WebElement usernamefilde;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
	public WebElement password;
	@FindBy(id="cookie_stop")
	public WebElement cookiebutton;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public WebElement loginbutton;
	
	
		public void loginagent() {
		
		
		usernamefilde.sendKeys(BaseClass.getProperty("agentUsername"));
		
		password.sendKeys(BaseClass.getProperty("agentPassword"));
		
		cookiebutton.click();
		
		loginbutton.click();
		
		
		
	}
	
     public void customerLogin() {
		
		
		usernamefilde.sendKeys(BaseClass.getProperty("custUsername"));
		
		password.sendKeys(BaseClass.getProperty("custPassword"));
		
		cookiebutton.click();
		
		loginbutton.click();
}

}
