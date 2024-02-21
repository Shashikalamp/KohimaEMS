package Com.SmartCity.testcases;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.Reports;
import Com.SmartCity.pageobject.ReportsEnvTest;

public class TC_ReportEnvT_007 extends TC_LoginTest_001 {
	@Test(groups ="TC_ReportEnvT_007",priority=17)
	public void ClickonReportandEnvbtn() throws InterruptedException{

		Reports rp = new Reports(driver);
		Thread.sleep(5000);
		rp.ClickSubmit();
		Thread.sleep(5000);
		rp.ClickSubmit1();
		Thread.sleep(5000);
	}
	@Test(groups ="TC_ReportEnvT_007",priority=18)
	public void selectenvBusStandsite() throws InterruptedException,NoSuchElementException {
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
	@Test(groups ="TC_ReportEnvT_007",priority=19)
	public void BusStandsite1dayreport() throws InterruptedException,NoSuchElementException{
		ReportsEnvTest ret = new ReportsEnvTest(driver);
		try {
			Thread.sleep(2000);
			ret.Clickon1dayoption();
			System.out.println("1 day button clickable");
			Thread.sleep(2000);
			ret.Clickon1daytableoption();
			System.out.println("table button clickable");
			Thread.sleep(2000);
			ret.Clickon1daycsvoption();
			System.out.println("csv button clickable and 1d report downloaded");
			Thread.sleep(2000);
			ret.Clickon1daypdfoption();
			System.out.println("pdf button clickable and 1d report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}
	}


	@Test(groups ="TC_ReportEnvT_007",priority=20)
	public void selectenvCollectorOfficesite() throws InterruptedException,NoSuchElementException {
		ReportsEnvTest ret = new ReportsEnvTest(driver);
		Thread.sleep(5000); 
		ret.ClickonCollectorOfficesite();
		System.out.println("dropdown clickable" );
		Thread.sleep(5000); 
		List<WebElement>allOptions = driver.findElements(By.xpath("//div[@class='rc-virtual-list']//div[@class='rc-virtual-list-holder-inner']/div"));
		/*System.out.println("Select value is " + dropdownElements);
   //Select dropdown = new Select(dropdownElement);
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

	@Test(groups ="TC_ReportEnvT_007",priority=21)
	public void CollectorOfficesite1dayreport() throws InterruptedException,NoSuchElementException {
		ReportsEnvTest ret = new ReportsEnvTest(driver);
		Thread.sleep(5000);
		try {
			ret.Clickon1dayoption();
			//System.out.println("1day button clickable");		
			ret.Clickon1daytableoption();
			System.out.println("table button clickable");	
			ret.Clickon1daycsvoption();
			System.out.println("csv button clickable and 1d report downloaded");
			ret.Clickon1daypdfoption();
			System.out.println("pdf button clickable and 1d report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}

	}




}

