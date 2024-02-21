package Com.SmartCity.testcases;

import org.testng.annotations.Test;

import Com.SmartCity.pageobject.AboutTest;
import Com.SmartCity.pageobject.AccessControlTest;

public class TC_AboutT_023 extends TC_LoginTest_001 {
	@Test(groups ="TC_AboutT_023", priority=84)
	public void ClickonAboutbutton() throws InterruptedException {
		AboutTest AT = new AboutTest(driver);
		try {
			Thread.sleep(2000);
			AT.ClickonAboutoption();
			System.out.println("About button is clickable");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	
	}
	@Test(groups ="TC_AboutT_023", priority=85)
	public void Checkbuildversion() throws InterruptedException {
		AboutTest AT = new AboutTest(driver);
		try {
			Thread.sleep(2000);

			System.out.println("Build version number is " + AT.Getversionno());
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	
	}
	@Test(groups ="TC_AboutT_023", priority=86)
	public void Comparebuildversion() throws InterruptedException {
		AboutTest AT = new AboutTest(driver);
		System.setProperty("versionNumber", "2.2.1");
		String versionNumber = System.getProperty("versionNumber", "defaultVersion");

		// Print the expected and actual version numbers
		System.out.println("Expected version number: " + versionNumber);

		// Get the actual version number
		String actualVersion = AT.Getversionno();
		System.out.println("Actual version number: " + actualVersion);

		// Perform any validation based on the version number
		if (versionNumber.equals(actualVersion)) {
			System.out.println("Version is correct");
		} else {
			System.out.println("Version is incorrect");
		}
	}
}
