package Com.SmartCity.testcases;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.Device1MhistoryTest;
import Com.SmartCity.pageobject.Device1WhistoryTest;
import Com.SmartCity.pageobject.Reports;

public class TC_Device1MhistoryreportT_013 extends TC_LoginTest_001{

	@Test(groups ="TC_Device1MhistoryreportT_013",priority=61)
	public void selectenvBusStandsite() throws InterruptedException,NoSuchElementException {
		Reports rp = new Reports(driver);
		Thread.sleep(2000);
		rp.ClickSubmit();
		Thread.sleep(2000);
		rp.Clickdeviceoption();
		Thread.sleep(2000);
		rp.Clickhistoryoption();
		Thread.sleep(2000);
		Device1MhistoryTest dmh = new Device1MhistoryTest(driver);
		dmh.Clickondevicehistorydrpdown();
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
	@Test(groups ="TC_Device1MhistoryreportT_013",priority=62)
	public void BusStandsite1mreport() throws InterruptedException,NoSuchElementException{
		Device1MhistoryTest dmh = new Device1MhistoryTest(driver);

		try {
			Thread.sleep(2000);
			dmh.Clickon1mhistoryoption();
			System.out.println("1 month button clickable");
			Thread.sleep(2000);
			dmh.Clickon1mhistorytableoption();
			System.out.println("table button clickable");
			Thread.sleep(2000);
			dmh.Clickon1mhistorycsvoption();
			System.out.println("csv button clickable and 1m report downloaded");
			Thread.sleep(2000);
			dmh.Clickon1mhistorypdfoption();
			System.out.println("pdf button clickable and 1m report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}

	}
	@Test(groups ="TC_Device1MhistoryreportT_013",priority=63)
	public void selectenvCollectorOfficesite() throws InterruptedException,NoSuchElementException {
		Device1MhistoryTest dmh = new Device1MhistoryTest(driver);
		Thread.sleep(5000); 
		dmh.ClickonCollectorOfficesite();
		System.out.println("dropdown clickable" );
		Thread.sleep(5000); 
		List<WebElement>allOptions = driver.findElements(By.xpath("//div[@class='rc-virtual-list']//div[@class='rc-virtual-list-holder-inner']/div"));
		/*System.out.println("Select value is " + dropdownElements);
	 //Select dropdown = new Select(dropdownElement);
	 for(WebElement option:dropdownElements) {
	 	System.out.println(option.getText());*/
		String option = "Collector Office";
		for(int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("Collector Office site selected");

				break;
			}
		}
	}

	@Test(groups ="TC_Device1MhistoryreportT_013",priority=64)
	public void CollectorOfficesite1mreport() throws InterruptedException,NoSuchElementException{
		Device1MhistoryTest dmh = new Device1MhistoryTest(driver);

		try {
			Thread.sleep(2000);
			dmh.Clickon1mhistoryoption();
			System.out.println("1 month button clickable");
			Thread.sleep(2000);
			dmh.Clickon1mhistorytableoption();
			System.out.println("table button clickable");
			Thread.sleep(2000);
			dmh.Clickon1mhistorycsvoption();
			System.out.println("csv button clickable and 1m report downloaded");
			Thread.sleep(2000);
			dmh.Clickon1mhistorypdfoption();
			System.out.println("pdf button clickable and 1m report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}

	}

}

