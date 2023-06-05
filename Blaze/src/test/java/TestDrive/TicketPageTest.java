package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.TicketPageClass;

public class TicketPageTest extends BaseClass {
	
	@Test
	public void TicketPageTest() {

		TicketPageClass Ticket = new TicketPageClass(driver);
		Ticket.Ticket1();
		Ticket.Ticket2("Vairam","Chrompet","Chennai","Tamil Nadu","600044","66666666","10","2023","Vairam Muthu");
	}

}
