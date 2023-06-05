package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.HomePageClass;

public class HomePageTest extends BaseClass {
	
	@Test
	public void HomePageTest() {

		HomePageClass Home = new HomePageClass(driver);
		
		
	}

}
