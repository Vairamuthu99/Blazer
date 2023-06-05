package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class HomePageClass extends Utilclass {
	
	WebDriver driver;

	public HomePageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
