package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class VaccationPageClass extends Utilclass {
	
	WebDriver driver;

	public VaccationPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='vacation.html']")
	WebElement Destination;
	
	@FindBy(xpath = "//a[@href='home']")
	WebElement Home;
	
	@FindBy(xpath = "//a[@href='https://blazedemo.com']")
	WebElement HomePage;

	public void Vaccation1() {
		Destination.click();
		Home.click();
		HomePage.click();
	}

}
