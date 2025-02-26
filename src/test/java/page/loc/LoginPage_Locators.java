package page.loc;

import org.openqa.selenium.WebElement;

import base.pac.BaseClass;

public class LoginPage_Locators extends BaseClass {
	public static WebElement getUsername() {
		return BaseClass.getElement("id", "username");
		
	}
	
	public static WebElement getPassword() {
		return BaseClass.getElement("id", "password");
		
	}
	
	public static WebElement getloginButton() {
		return BaseClass.getElement("id", "login");
		
	}
}
