package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.commonMethod;

public class supplierTest extends commonMethod {
	
	
	@BeforeMethod
	public void steup() {
		
		BaseClass.getDriver().get(BaseClass.getProperty("supplierBackEndUrl"));
		BaseClass.getDriver().manage().window().maximize();
		BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	}
	@Test
	public void suppliertest() {
		
	sup.suppliertest();
		
	}
}
