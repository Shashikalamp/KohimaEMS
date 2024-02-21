package Com.SmartCity.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.AC_UserPastSessionTest;
import Com.SmartCity.pageobject.AccessControlTest;

public class AC_UserPastsession1MT_019 extends TC_LoginTest_001  {
	@Test(groups ="AC_UserPastsession1MT_019",priority=76)

	public void ClickonAdmin1WPastsessionbutton() throws InterruptedException {
		AccessControlTest Ac = new AccessControlTest(driver);
		Thread.sleep(2000);
		Ac.Clickonaccesscontroloption();
		AC_UserPastSessionTest Acp = new AC_UserPastSessionTest(driver);
		Thread.sleep(2000);
		Acp.ClickonPastsessionoption();
		Thread.sleep(2000);
		Acp.ClickonDropdwnoption();

		try {
			Thread.sleep(2000);
			/*	 WebDriverWait wait = new WebDriverWait(driver, 10);
			   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Acp.SelectadminUseroption()));
			   System.out.println("dropdown clickable" );
		  System.out.println("Dropdown button is clickable");*/
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
			Acp.Clickon1Moption();
			System.out.println("User Pastsession  1Month button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1Dtableoption();
			System.out.println("User Pastsession  1M Table button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DCSVoption();
			System.out.println("User Pastsession  1M CSV button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DPDFoption();
			System.out.println("User Pastsession  1M PDF button is clickable");
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	
	}
	@Test(groups ="AC_UserPastsession1MT_019",priority=77)
	public void ClickonServiceuser1WPastsessionbutton() throws InterruptedException {
		AC_UserPastSessionTest Acp = new AC_UserPastSessionTest(driver);
		try {
			
			Acp.SelectserviceUseroption();
			System.out.println("dropdown clickable" );
			Thread.sleep(2000);
			Thread.sleep(2000);
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
			Acp.Clickon1Moption();
			System.out.println("User Pastsession  1month button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1Dtableoption();
			System.out.println("User Pastsession  1M Table button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DCSVoption();
			System.out.println("User Pastsession  1M CSV button is clickable");
			Thread.sleep(2000);
			Acp.Clickon1DPDFoption();
			System.out.println("User Pastsession  1M PDF button is clickable");
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	
	}
}
