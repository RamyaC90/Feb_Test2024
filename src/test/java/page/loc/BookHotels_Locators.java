package page.loc;

import org.openqa.selenium.WebElement;

import base.pac.BaseClass;

public class BookHotels_Locators {
	public static WebElement getfname() {
		return BaseClass.getElement("id", "first_name");
		
	}
	
	public static WebElement getlname() {
		return  BaseClass.getElement("id", "last_name");
		
	}
	
	public static WebElement getaddr() {
		return BaseClass.getElement("id", "address");
		
	}
	public static WebElement getccnum() {
		return BaseClass.getElement("id", "cc_num");
		
	}
	
	public static WebElement getcct() {
		return BaseClass.getElement("id", "cc_type");
		
	}
	
	public static WebElement getccexm() {
		return BaseClass.getElement("id", "cc_exp_month");
		
	}
	public static WebElement getccexyr() {
		return BaseClass.getElement("id", "cc_exp_year");
		
	}
	
	public static WebElement getcvvr() {
		return BaseClass.getElement("id", "cc_cvv");
		
	}
	
	public static WebElement getbookButton() {
		return BaseClass.getElement("id", "book_now");
		
	}
}
