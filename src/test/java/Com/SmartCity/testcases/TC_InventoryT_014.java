package Com.SmartCity.testcases;

import org.testng.annotations.Test;

import Com.SmartCity.pageobject.InventoryTest;

public class TC_InventoryT_014 extends 	TC_LoginTest_001 {
	@Test(groups ="TC_InventoryT_014",priority=69)
	public void Clickoninventorybutton() throws InterruptedException {
		InventoryTest It = new InventoryTest(driver);
		Thread.sleep(5000);
		try {
			It.Clickoninventoryoption();
			System.out.println("Inventory button is clickable");


			/*It.ClickonNationoption();
	  System.out.println("Nation button is clickable");
	  Thread.sleep(2000);
	  It.ClickonStateoption();
	  System.out.println("State button is clickable");*/
			Thread.sleep(2000);
			It.ClickonKohimacityoption();
			System.out.println("City button is clickable");
			Thread.sleep(2000);
			It.ClickonHighSchoolWardoption();
			System.out.println("Ward 1 button is clickable");
			Thread.sleep(2000);
			It.ClickonHighSchoolNH2Streetoption();
			System.out.println("Street 1 button is clickable");
			Thread.sleep(2000);
			It.ClickonHighSchoolJunctionPoleoption();
			System.out.println("Pole 1 button is clickable");
			Thread.sleep(2000);
			It.ClickonESSHighSchoolJunctionoption();
			System.out.println("Smart Pole 1 button is clickable");

			Thread.sleep(2000);
			It.ClickonDaklaneWardoption();
			System.out.println("Ward 2 button is clickable");
			Thread.sleep(2000);
			It.ClickonDaklanNH2Streetoption();
			System.out.println("Street 2 button is clickable");
			Thread.sleep(2000);
			It.ClickonPhoolBariJunctionPoleoption();
			System.out.println("Pole 2 button is clickable");
			Thread.sleep(2000);
			It.ClickonPhoolBariJunctionESSoption();
			System.out.println("Smart Pole 2 button is clickable");

			Thread.sleep(1000);
			It.ClickonMidLanewardoption();
			System.out.println("Ward 3 button is clickable");
			Thread.sleep(2000);
			It.ClickonMidLaneNH2Streetoption();
			System.out.println("Street 3 button is clickable");
			Thread.sleep(2000);
			It.ClickonBoxCuttingJunctionPoleoption();
			System.out.println("Pole 3 button is clickable");
			Thread.sleep(2000);
			It.ClickonBoxCuttingJunctionESSoption();
			System.out.println("Smart Pole 3 button is clickable");

			Thread.sleep(2000);
			It.ClickonPRHillWardoption();
			System.out.println("Ward 4 button is clickable");
			Thread.sleep(2000);
			It.ClickonPRHillNH2Streetoption();
			System.out.println("Street 4 button is clickable");
			Thread.sleep(2000);
			It.ClickonPoliceHeadQuartersPoleoption();;
			System.out.println("Pole 4 button is clickable");
			Thread.sleep(2000);
			It.ClickonPoliceHeadQuartersESSoption();
			System.out.println("Smart Pole 4 button is clickable");

			Thread.sleep(2000);


			It.ClickonInventoryinfooption();
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}
	}
}
