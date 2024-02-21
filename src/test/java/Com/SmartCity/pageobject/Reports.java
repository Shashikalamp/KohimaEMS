package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Reports {
	WebDriver driver;
	WebDriver ldriver;
	public Reports(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath ="/html/body/div/div/div/aside/div/div[2]/div/div[1]/ul/li[2]/div/span[2]/div/span")
	@CacheLookup
	WebElement Clickreportbtn;
	@FindBy(xpath ="/html/body/div/div/div/aside/div/div[2]/div/div[1]/ul/li[2]/ul/li[1]/span[2]/a")
	@CacheLookup
	WebElement Clickenvbtn;
	@FindBy(xpath = "/html/body/div/div/div/aside/div/div[2]/div/div[1]/ul/li[2]/ul/li[2]/span[2]/a")
	@CacheLookup
	WebElement ClickDevicesbtn;
	@FindBy(xpath = "/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[2]/div")
	@CacheLookup
	WebElement Clicklivestatusbtn;
	@FindBy(xpath = "/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[3]/div")
	@CacheLookup
	WebElement Clickhistorybtn;


	public void ClickSubmit() {
		Clickreportbtn.click();
	}
	public void ClickSubmit1() {
		Clickenvbtn.click();
	}

	public void Clickdeviceoption() {
		ClickDevicesbtn.click();
	}
	public void Clicklivestatusoption() {
		Clicklivestatusbtn.click();
	}
	public void Clickhistoryoption() {
		Clickhistorybtn.click();
	}
}

