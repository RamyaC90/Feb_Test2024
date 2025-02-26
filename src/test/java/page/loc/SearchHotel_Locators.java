package page.loc;

import org.openqa.selenium.WebElement;

import base.pac.BaseClass;

public class SearchHotel_Locators extends LoginPage_Locators {
	public static WebElement getlocation() {
		return BaseClass.getElement("id", "location");
		
	}
	
	public static WebElement gethotels() {
		return  BaseClass.getElement("id", "hotels");
		
	}
	
	public static WebElement getroomType() {
		return BaseClass.getElement("id", "room_type");
		
	}
	public static WebElement getnoofrooms() {
		return BaseClass.getElement("id", "room_nos");
		
	}
	
	public static WebElement getcid() {
		return BaseClass.getElement("id", "datepick_in");
		
	}
	
	public static WebElement getcod() {
		return BaseClass.getElement("id", "datepick_out");
		
	}
	public static WebElement getadultspr() {
		return BaseClass.getElement("id", "adult_room");
		
	}
	
	public static WebElement getchildpr() {
		return BaseClass.getElement("id", "child_room");
		
	}
	
	public static WebElement getsearchButton() {
		return BaseClass.getElement("id", "Submit");
		
	}
}
