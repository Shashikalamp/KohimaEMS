package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Device1MhistoryTest {
	WebDriver driver;
	WebDriver ldriver;
	public Device1MhistoryTest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[1]/input")
	@CacheLookup
	WebElement Selectelement;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[4]/span[2]")
	@CacheLookup
	WebElement Clickon1mDevicehistoryoption;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[1]/span[2]")
	@CacheLookup
	WebElement Clickon1mhistorytable;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[2]")
	@CacheLookup
	WebElement Clickon1mhistorycsv;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[3]/span[2]")
	@CacheLookup
	WebElement Clickon1mhistorypdf;
	@FindBy(xpath="/html/body/div[1]/div/section/div/main/div/div/div/div/div[1]/div/div/div[3]/div/label[1]/span[2]/div/div[1]/input")
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
	public void Clickon1mhistoryoption() {
		Clickon1mDevicehistoryoption.click();
	}

	public void Clickon1mhistorytableoption() {
		Clickon1mhistorytable.click();
	}
	public void Clickon1mhistorycsvoption() {
		Clickon1mhistorycsv.click();
	}
	public void Clickon1mhistorypdfoption() {
		Clickon1mhistorypdf.click();
	}

	public WebElement ClickonCollectorOfficesite() {
		selectCollectorOfficesite.click();
		return selectCollectorOfficesite;
	}

}
