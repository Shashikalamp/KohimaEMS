package Com.SmartCity.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.AccessControlTest;
import Com.SmartCity.pageobject.InventoryTest;

public class TC_AccessControlT_015 extends TC_LoginTest_001 {

	@Test(groups ="TC_AccessControlT_015",priority=70)

	public void ClickonAccessControlbutton() throws InterruptedException {
		AccessControlTest Ac = new AccessControlTest(driver);
		Thread.sleep(2000);
		try {
			Ac.Clickonaccesscontroloption();
			System.out.println("Access Control button is clickable");
			Thread.sleep(2000);
			Ac.ClickonUserroleoption();
			System.out.println("User role button is clickable");
			Thread.sleep(2000);
			Ac.ClickonUserLivesessionoption();
			System.out.println("User Live Session button is clickable");
			Thread.sleep(2000);
			Ac.ClickonUserPastsessionoption();
			System.out.println("User Past Session button is clickable");
			Thread.sleep(2000);
			Ac.ClickonUserActivityoption();
			System.out.println("User Activity button is clickable");
			Thread.sleep(2000);


		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	  
	}
}

