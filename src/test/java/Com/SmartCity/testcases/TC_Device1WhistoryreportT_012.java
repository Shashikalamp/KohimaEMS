package Com.SmartCity.testcases;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Com.SmartCity.pageobject.Device1WhistoryTest;
import Com.SmartCity.pageobject.Reports;

public class TC_Device1WhistoryreportT_012 extends TC_LoginTest_001 {
	@Test(groups ="TC_Device1WhistoryreportT_012",priority=53)
	public void selectenvBusStandsite() throws InterruptedException,NoSuchElementException {
		Reports rp = new Reports(driver);
		Thread.sleep(2000);
		rp.ClickSubmit();
		Thread.sleep(2000);
		rp.Clickdeviceoption();
		Thread.sleep(2000);
		rp.Clickhistoryoption();
		Thread.sleep(2000);
		Device1WhistoryTest dwh = new Device1WhistoryTest(driver);
		dwh.Clickondevicehistorydrpdown();
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
	@Test(groups ="TC_Device1WhistoryreportT_012",priority=54)
	public void BusStandsite1dayreport() throws InterruptedException,NoSuchElementException{
		Device1WhistoryTest dwh = new Device1WhistoryTest(driver);
		try {
			Thread.sleep(2000);
			dwh.Clickon1weekoption();
			System.out.println("1 week button clickable");
			Thread.sleep(2000);
			dwh.Clickon1whistorytableoption();
			System.out.println("table button clickable");
			Thread.sleep(2000);
			dwh.Clickon1whistorycsvoption();
			System.out.println("csv button clickable and 1d report downloaded");
			Thread.sleep(2000);
			dwh.Clickon1whistorypdfoption();
			System.out.println("pdf button clickable and 1d report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}
	}
	@Test(groups ="TC_Device1WhistoryreportT_012",priority=55)
	public void selectenvCollectorOfficesite() throws InterruptedException,NoSuchElementException {
		Device1WhistoryTest dwh = new Device1WhistoryTest(driver);
		Thread.sleep(5000); 
		dwh.ClickonCollectorOfficesite();
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
	@Test(groups ="TC_Device1WhistoryreportT_012",priority=56)
	public void CollectorOfficesite1weekreport() throws InterruptedException,NoSuchElementException{
		Device1WhistoryTest dwh = new Device1WhistoryTest(driver);
		try {
			Thread.sleep(2000);
			dwh.Clickondatepickeroption();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[1]/td[3]/div")).click();
			Thread.sleep(5000);
			System.out.println("start date is selected from the date picker");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[1]/td[4]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/div")).click();
			Thread.sleep(2000);
			System.out.println("End date is selected from the date picker");
			dwh.Clickon1whistorytableoption();
			System.out.println("table button clickable");
			Thread.sleep(2000);
			dwh.Clickon1whistorycsvoption();
			System.out.println("csv button clickable and 1d report downloaded");
			Thread.sleep(2000);
			dwh.Clickon1whistorypdfoption();
			System.out.println("pdf button clickable and 1d report downloaded");
			Thread.sleep(2000);
			dwh.Clickon1weekoption();
			System.out.println("1 week button clickable");
			Thread.sleep(2000);
			dwh.Clickon1whistorytableoption();
			System.out.println("table button clickable");
			Thread.sleep(2000);
			dwh.Clickon1whistorycsvoption();
			System.out.println("csv button clickable and 1d report downloaded");
			Thread.sleep(2000);
			dwh.Clickon1whistorypdfoption();
			System.out.println("pdf button clickable and 1d report downloaded");
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}
	} 

}
