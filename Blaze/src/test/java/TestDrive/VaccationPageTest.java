package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.VaccationPageClass;

public class VaccationPageTest extends BaseClass {

	@Test
	public void VaccationPageTest() {

		VaccationPageClass Vaccation = new VaccationPageClass(driver);
		Vaccation.Vaccation1();
	}
}
