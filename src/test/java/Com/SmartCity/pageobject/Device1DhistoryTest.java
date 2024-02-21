package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Device1DhistoryTest {
	WebDriver driver;
	WebDriver ldriver;
	public Device1DhistoryTest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[1]/input")
	@CacheLookup
	WebElement Selectelement;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[2]/span[2]")
	@CacheLookup
	WebElement Clickon1dDevicehistoryoption;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[1]/span[2]")
	@CacheLookup
	WebElement Clickon1dhistorytable;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[2]")
	@CacheLookup
	WebElement Clickon1dhistorycsv;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[5]/div/label[3]/span[2]")
	@CacheLookup
	WebElement Clickon1dhistorypdf;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[1]/span[2]/div/div[1]/input")
	@CacheLookup
	WebElement Clickondatepicker;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[2]")
	@CacheLookup
	WebElement selectCollectorOfficesite;

	/*@FindBy(xpath ="//input[@value='01-11-2023']/parent::div")
@CacheLookup
WebElement Choosestartdate;
@FindBy(xpath="//input[@value='20-11-2023']/parent::div")
@CacheLookup
WebElement Chooseenddate;*/
	public WebElement Clickondevicehistorydrpdown() 
	{
		Selectelement.click();
		return Selectelement;
	}
	public void Clickon1dayoption() {
		Clickon1dDevicehistoryoption.click();
	}

	public void Clickon1dhistorytableoption() {
		Clickon1dhistorytable.click();
	}
	public void Clickon1dhistorycsvoption() {
		Clickon1dhistorycsv.click();
	}
	public void Clickon1dhistorypdfoption() {
		Clickon1dhistorypdf.click();
	}
	public WebElement Clickondatepickeroption() {
		Clickondatepicker.click();
		return Clickondatepicker;

	}
	public WebElement ClickonCollectorOfficesite() {
		selectCollectorOfficesite.click();
		return selectCollectorOfficesite;
	}

}
/*	public WebElement Clickonstartdateoption() {
	Choosestartdate.click();
	return Choosestartdate;
	}
public WebElement Clickonenddateoption() {
	Chooseenddate.click();
	return Chooseenddate;

}*/




