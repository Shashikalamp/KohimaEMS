package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Device1WhistoryTest {
	WebDriver driver;
	WebDriver ldriver;
	public Device1WhistoryTest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[1]/input")
	@CacheLookup
	WebElement Selectelement;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[3]/span[2]")
	@CacheLookup
	WebElement Clickon1wDevicehistoryoption;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[1]/span[2]")
	@CacheLookup
	WebElement Clickon1whistorytable;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[2]")
	@CacheLookup
	WebElement Clickon1whistorycsv;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[3]/span[2]")
	@CacheLookup
	WebElement Clickon1whistorypdf;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[1]/span[2]/div/div[2]")
	@CacheLookup
	WebElement Clickondatepicker;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[2]")
	@CacheLookup
	WebElement selectCollectorOfficesite;

	public WebElement Clickondevicehistorydrpdown() 
	{
		Selectelement.click();
		return Selectelement;
	}
	public void Clickon1weekoption() {
		Clickon1wDevicehistoryoption.click();
	}

	public void Clickon1whistorytableoption() {
		Clickon1whistorytable.click();
	}
	public void Clickon1whistorycsvoption() {
		Clickon1whistorycsv.click();
	}
	public void Clickon1whistorypdfoption() {
		Clickon1whistorypdf.click();
	}
	public void Clickondatepickeroption(){
		Clickondatepicker.click();
	}

	public WebElement ClickonCollectorOfficesite() {
		selectCollectorOfficesite.click();
		return selectCollectorOfficesite;
	}


}
