package page.loc;

import org.openqa.selenium.WebElement;

import base.pac.BaseClass;

public class SelectPage_Locators extends SearchHotel_Locators {
	public static WebElement getselect() {
		return BaseClass.getElement("id", "radiobutton_0");
		
	}
	public static WebElement getcontin() {
		return BaseClass.getElement("id", "continue");
		
	}
}
