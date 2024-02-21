package Com.SmartCity.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.Reports;

public class TC_ReportDeviceT_010 extends TC_LoginTest_001 {
	@Test(groups ="TC_ReportDeviceT_010",priority=42)
	public void Clickondevicesbtn() throws InterruptedException {
		Reports rp = new Reports(driver);

		try {
			Thread.sleep(2000);
			rp.ClickSubmit();
			Thread.sleep(2000);
			rp.Clickdeviceoption();
			Thread.sleep(5000);
			System.out.println("Devices button is clickable");
		}
		catch(Exception e){
			System.out.println("Devices button is not clickable" + e.getMessage());

		}

	}
	@Test(groups ="TC_ReportDeviceT_010",priority=43)
	public void Clickonlivestatusoption() {
		Reports rp = new Reports(driver);
		try {
			rp.Clicklivestatusoption();
			Thread.sleep(5000);
			System.out.println("Live status button is clickable");
		}
		catch(Exception e){
			System.out.println("Live status button is not clickable" + e.getMessage());

		}
	}
	@Test(groups ="TC_ReportDeviceT_010",priority=44)
	public void ClickonHistoryoption() {
		Reports rp = new Reports(driver);
		try {
			rp.Clickhistoryoption();
			Thread.sleep(5000);
			System.out.println("History button is clickable");
		}
		catch(Exception e){
			System.out.println("History button is not clickable" + e.getMessage());
		}
	}

}
