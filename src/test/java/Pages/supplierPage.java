package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class supplierPage {
	
public supplierPage () {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[1]/label/input")
	public WebElement usernamefilde;
	@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input")
	public WebElement password;
	@FindBy(id="cookie_stop")
	public WebElement cookiebutton;
	@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button")
	public WebElement loginbutton;
	
	public void suppliertest() {
		
		
		usernamefilde.sendKeys(BaseClass.getProperty("supplierUsername"));
		
		password.sendKeys(BaseClass.getProperty("supplierPassword"));
		
		//cookiebutton.click();
		
		loginbutton.click();
	
	}

}
