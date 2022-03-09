package utilities;

import Pages.adminLoginPage;
import Pages.loginPage;
import Pages.supplierPage;

public class PageInitializer extends BaseClass {
	
	public static loginPage lp; 
	public static adminLoginPage alp;
	
	public static supplierPage sup;
	
	
	public static void initialize() {
		
		
		lp = new loginPage();
		
		alp = new adminLoginPage();
		
		sup = new supplierPage();
		
		
		
		
		
		
	}

}
