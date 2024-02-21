package Com.SmartCity.testcases;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.Env1MReportTest;
import Com.SmartCity.pageobject.Reports;
import Com.SmartCity.pageobject.ReportsEnvTest;


public class TC_Env1MonthreportT_009 extends TC_LoginTest_001{
	@Test(groups ="TC_Env1MonthreportT_009",priority=34)
	public void selectenvBusStandsite() throws InterruptedException,NoSuchElementException {
		Reports rp = new Reports(driver);
		Thread.sleep(5000);
		rp.ClickSubmit();
		Thread.sleep(5000);
		rp.ClickSubmit1();
		Thread.sleep(5000);
		ReportsEnvTest ret = new ReportsEnvTest(driver);
		ret.Clickenvdrpdown();
		Thread.sleep(5000);
		List<WebElement>allOptions = driver.findElements(By.xpath("//div[@class='rc-virtual-list']//div[@class='rc-virtual-list-holder-inner']/div"));
		/*System.out.println("Select value is " + dropdownElements);
//Select dropdown = new Select(dropdownElement);
for(WebElement option:dropdownElements) {
	System.out.println(option.getText());*/
		String option = "Bus Stand";
		for(int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("Bus Stand site selected");

				break;
			}
		}
	}
	@Test(groups ="TC_Env1MonthreportT_009",priority=35)
	public void BusStandsite1Mreport() throws InterruptedException,NoSuchElementException{
		Env1MReportTest emr = new Env1MReportTest(driver);
		try {
			Thread.sleep(2000);
			emr.Clickon1monthoption();
			System.out.println("1 month button clickable");
			Thread.sleep(2000);
			emr.Clickon1monthtableoption();
			System.out.println("table button clickable");
			Thread.sleep(2000);
			emr.Clickon1monthcsvoption();
			System.out.println("csv button clickable and 1m report downloaded");
			Thread.sleep(2000);
			emr.Clickon1monthpdfoption();
			System.out.println("pdf button clickable and 1m report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}
	} 
	@Test(groups ="TC_Env1MonthreportT_009",priority=36)
	public void selectenvCollectorOfficesite() throws InterruptedException,NoSuchElementException {
		ReportsEnvTest ret = new ReportsEnvTest(driver);
		Thread.sleep(5000); 
	ret.ClickonCollectorOfficesite();
		System.out.println("dropdown clickable" );
		Thread.sleep(5000); 
		List<WebElement>allOptions = driver.findElements(By.xpath("//div[@class='rc-virtual-list']//div[@class='rc-virtual-list-holder-inner']/div"));
		/*System.out.println("Select value is " + dropdownElements);
	   Select dropdown = new Select(dropdownElement);
	   for(WebElement option:dropdownElements) {
	   	System.out.println(option.getText())*/
		String option = "Collector Office";
		for(int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("Collector Office site selected");

				break;
			}
		}
	}

	@Test(groups ="TC_Env1MonthreportT_009",priority=37)
	public void CollectorOfficesite1Mreport() throws InterruptedException,NoSuchElementException {
		Env1MReportTest emr = new Env1MReportTest(driver);
		Thread.sleep(5000);
		try {
			emr.Clickon1monthoption();
			System.out.println("1month button clickable");		
			emr.Clickon1monthtableoption();
			Thread.sleep(2000);
			System.out.println("table button clickable");
			emr.Clickon1monthcsvoption();
			Thread.sleep(2000);
			System.out.println("csv button clickable and 1m report downloaded");
			emr.Clickon1monthpdfoption();
			Thread.sleep(2000);
			System.out.println("pdf button clickable and 1m report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}

	}
}
