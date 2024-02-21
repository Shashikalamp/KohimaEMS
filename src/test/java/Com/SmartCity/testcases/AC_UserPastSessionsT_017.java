package Com.SmartCity.testcases;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.AC_UserPastSessionTest;
import Com.SmartCity.pageobject.AC_UsersTest;
import Com.SmartCity.pageobject.AccessControlTest;

public class AC_UserPastSessionsT_017 extends TC_LoginTest_001 {
	@Test(groups ="AC_UserPastSessionsT_017",priority=72)
	public void ClickonAdminPastsessionbutton() throws InterruptedException {
		AccessControlTest Ac = new AccessControlTest(driver);
		Thread.sleep(2000);
		Ac.Clickonaccesscontroloption();
		AC_UserPastSessionTest Acp = new AC_UserPastSessionTest(driver);
		try {
			Thread.sleep(2000);
			Acp.ClickonPastsessionoption();
			System.out.println("User Pastsession button is clickable");
			Thread.sleep(2000);
			Acp.ClickonDropdwnoption();
			System.out.println("Dropdown button is clickable");
			Thread.sleep(2000);
			List<WebElement>allOptions = driver.findElements(By.xpath("//div[@class='rc-virtual-list']//div[@class='rc-virtual-list-holder-inner']/div"));
			String option = "admin";
			for(int i = 0; i < allOptions.size(); i++) {
				if (allOptions.get(i).getText().contains(option)) {

					allOptions.get(i).click();

					System.out.println("Admin user role data entered successfully");

					break;
				}
			}
			Thread.sleep(2000);
			Acp.Clickon1Doption();
			System.out.println("User Pastsession  1Day button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1Dtableoption();
			System.out.println("User Pastsession  1Day Table button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DCSVoption();
			System.out.println("User Pastsession  1Day CSV button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DPDFoption();
			System.out.println("User Pastsession  1Day PDF button is clickable");
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	
	}
	@Test(groups ="AC_UserPastSessionsT_017",priority=73)
	public void ClickonServiceuserPastsessionbutton() throws InterruptedException {
		AC_UserPastSessionTest Acp = new AC_UserPastSessionTest(driver);
		try {
			Thread.sleep(2000);
			Acp.SelectserviceUseroption();
			System.out.println("dropdown clickable" );
			Thread.sleep(5000);
			List<WebElement>allOptions = driver.findElements(By.xpath("//div[@class='rc-virtual-list']//div[@class='rc-virtual-list-holder-inner']/div"));
			String option = "service";
			for(int i = 0; i < allOptions.size(); i++) {
				if (allOptions.get(i).getText().contains(option)) {

					allOptions.get(i).click();

					System.out.println("Service user role data entered successfully");

					break;
				}
			}
			Thread.sleep(2000);
			Acp.Clickon1Doption();
			System.out.println("User Pastsession  1Day button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1Dtableoption();
			System.out.println("User Pastsession  1Day Table button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DCSVoption();
			System.out.println("User Pastsession  1Day CSV button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DPDFoption();
			System.out.println("User Pastsession  1Day PDF button is clickable");
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	
	}
}
