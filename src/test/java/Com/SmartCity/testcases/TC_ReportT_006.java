package Com.SmartCity.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Com.SmartCity.pageobject.Reports;

public class TC_ReportT_006 extends TC_LoginTest_001{
	@Test(groups ="TC_ReportT_006",priority=14)
	public void ClickonReportoption(){
		Reports rp = new Reports(driver);
		try {
			Thread.sleep(5000);
			rp.ClickSubmit();
			System.out.println("Reports button is clickable");
		}
		catch(Exception e){
			System.out.println("Reports button is not clickable" + e.getMessage());

		}
	}

	@Test(groups ="TC_ReportT_006",priority=15)
	public void Clickenvreportoption() {
		Reports rp = new Reports(driver);
		try {
			rp.ClickSubmit1();
			System.out.println("Reportsenv button is clickable");
		} catch (Exception e) {
			System.out.println("Reportsenv button is not clickable: " + e.getMessage());
		}
	}
	@Test(groups ="TC_ReportT_006",priority=16)
	public void doubleclickonreportoption() {
		Reports rp = new Reports(driver);
		try {
			Thread.sleep(5000);
			rp.ClickSubmit();
			System.out.println("Reports button is doubleclickable");
		}
		catch(Exception e){
			System.out.println("Reports button is not doubleclickable" + e.getMessage());

		}

	}

}
