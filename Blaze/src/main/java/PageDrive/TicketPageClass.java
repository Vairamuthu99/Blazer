package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class TicketPageClass extends Utilclass {
	
	WebDriver driver;

	public TicketPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//option[@value='Mexico City']")
	WebElement Mexico;
	
	@FindBy(xpath = "//option[@value='London']")
	WebElement London;
	
	@FindBy(xpath = "//input[@value='Find Flights']")
	WebElement FindFlight;
	
	@FindBy(xpath = "(//input[@value='Choose This Flight'])[3]")
	WebElement ChooseFlight;
	
	@FindBy(xpath = "//input[@placeholder='First Last']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@placeholder='123 Main St.']")
	WebElement Address;
	
	@FindBy(xpath = "//input[@placeholder='Anytown']")
	WebElement City;
	
	@FindBy(xpath = "//input[@placeholder='State']")
	WebElement State;
	
	@FindBy(xpath = "//input[@placeholder='12345']")
	WebElement Pincode;
	
	@FindBy(xpath = "//option[@value='visa']")
	WebElement Visa;
	
	@FindBy(xpath = "//input[@placeholder='Credit Card Number']")
	WebElement Card;
	
	@FindBy(xpath = "//input[@placeholder='Month']")
	WebElement Month;
	
	@FindBy(xpath = "//input[@placeholder='Year']")
	WebElement Year;
	
	@FindBy(xpath = "//input[@placeholder='John Smith']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='rememberMe']")
	WebElement Box;
	
	@FindBy(xpath = "//input[@value='Purchase Flight']")
	WebElement Book;

	public void Ticket1() {
		Mexico.click();
		London.click();
		FindFlight.click();
		ChooseFlight.click();
	}
	
	public void Ticket2(String Name, String Add, String Cit, String stat, String pin, String crd, String mon, String yrs, String nam) {
		FirstName.sendKeys(Name);
		Address.sendKeys(Add);
		City.sendKeys(Cit);
		State.sendKeys(stat);
		Pincode.sendKeys(pin);
		Visa.click();
		Card.sendKeys(crd);
		Month.sendKeys(mon);
		Year.sendKeys(yrs);
		name.sendKeys(nam);
		Box.click();
		Book.click();
	}
}
