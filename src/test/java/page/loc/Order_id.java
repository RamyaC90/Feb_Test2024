package page.loc;

import org.openqa.selenium.WebElement;

public class Order_id {
	public static WebElement orderid() {
		return base.pac.BaseClass.getElement("id", "order_no");
		
	}
}
