package step.defi;




import org.openqa.selenium.chrome.ChromeDriver;

import base.pac.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hook {
	
	@Before
	public void before() {
		
		
		BaseClass.launchBrowser(BaseClass.read_prop("browser"), BaseClass.read_prop("url"));
		//browserLaunch(read_prop("browser"), read_prop("url"));
		
	}

	@After
	public void after() {
		System.out.println("after");
	}
	
}
