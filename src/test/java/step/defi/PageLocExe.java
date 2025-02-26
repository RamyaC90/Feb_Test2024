package step.defi;




import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import base.pac.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.loc.BookHotels_Locators;
import page.loc.LoginPage_Locators;
import page.loc.Order_id;
import page.loc.SelectPage_Locators;

public class PageLocExe extends BookHotels_Locators {
	@Given("launch the Adactin application")
	public void launch_the_adactin_application() {
	   System.out.println("Adactin Url is Launched");
	}
	@When("enter username and password")
	public void enter_username_and_password() {
		BaseClass.passData(LoginPage_Locators.getUsername(), BaseClass.read_prop("username"));
		BaseClass.passData(LoginPage_Locators.getPassword(), BaseClass.read_prop("password"));
		BaseClass.clickElement1(LoginPage_Locators.getloginButton());
	}
	@When("search for a hotel")
	public void search_for_a_hotel() {
	BaseClass.selectByValue(page.loc.SearchHotel_Locators.getlocation(),BaseClass.excelread_all_reuse(2, 0));
	BaseClass.selectByVisible(page.loc.SearchHotel_Locators.gethotels(),BaseClass.excelread_all_reuse(2, 1));
	BaseClass.selectByVisible(page.loc.SearchHotel_Locators.getroomType(),BaseClass.excelread_all_reuse(2, 2));
	BaseClass.passData(page.loc.SearchHotel_Locators.getnoofrooms(), BaseClass.excelread_all_reuse(2, 3));
	BaseClass.passData(page.loc.SearchHotel_Locators.getcid(), BaseClass.excelread_all_reuse(2, 4));
	BaseClass.passData(page.loc.SearchHotel_Locators.getcod(), BaseClass.excelread_all_reuse(2, 5));
	BaseClass.passData(page.loc.SearchHotel_Locators.getadultspr(), BaseClass.excelread_all_reuse(2, 6));
	BaseClass.passData(page.loc.SearchHotel_Locators.getchildpr(), BaseClass.excelread_all_reuse(2, 7));
	BaseClass.clickElement1(page.loc.SearchHotel_Locators.getsearchButton());
	}
	@When("select a hotel and proceed")
	public void select_a_hotel_and_proceed() {
		BaseClass.clickElement1(SelectPage_Locators.getselect());
		BaseClass.clickElement1(SelectPage_Locators.getcontin());
	}
	@When("enter booking details")
	public void enter_booking_details() {
		
			BaseClass.passData(BookHotels_Locators.getfname(), BaseClass.excelread_all_reuse(2,8));
		
			BaseClass.passData(BookHotels_Locators.getlname(), BaseClass.excelread_all_reuse(2,9));
		
			BaseClass.passData(BookHotels_Locators.getaddr(), BaseClass.excelread_all_reuse(2,10));
		
			BaseClass.passData(BookHotels_Locators.getccnum(), BaseClass.excelread_all_reuse(2,11));
	
			BaseClass.selectByVisible(BookHotels_Locators.getcct(),BaseClass.excelread_all_reuse(2,12));
		
			BaseClass.selectByVisible(BookHotels_Locators.getccexm(),BaseClass.excelread_all_reuse(2,13));
	
			BaseClass.selectByVisible(BookHotels_Locators.getccexyr(),BaseClass.excelread_all_reuse(2,14));
		
			BaseClass.passData(BookHotels_Locators.getcvvr(), BaseClass.excelread_all_reuse(2, 15));
		
			BaseClass.clickElement1(BookHotels_Locators.getbookButton());
		
	}
	@Then("should see the booking confirmation")
	public void should_see_the_booking_confirmation() throws InterruptedException {
		BaseClass.sleepThread(20000);
		BaseClass.pullDataFromUiField(Order_id.orderid());
		
	}
}
