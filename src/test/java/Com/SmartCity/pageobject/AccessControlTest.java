package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AccessControlTest {
	WebDriver driver;
	WebDriver ldriver;
	public AccessControlTest (WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath ="/html/body/div[1]/div/div/aside/div/div[2]/div/div[1]/ul/li[4]/span[2]/a")
	@CacheLookup
	WebElement Clickaccesscontrolbtn;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[2]")
	@CacheLookup
	WebElement Clickrolesbtn;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[3]/div")
	@CacheLookup
	WebElement Clicklivesessionsbtn;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[4]/div")
	@CacheLookup
	WebElement Clickpastsessionsbtn;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[5]/div")
	@CacheLookup
	WebElement Clickuseractivitybtn;


	public void Clickonaccesscontroloption() {
		Clickaccesscontrolbtn.click();
	}
	public void ClickonUserroleoption() {
		Clickrolesbtn.click();
	}
	public void ClickonUserLivesessionoption() {
		Clicklivesessionsbtn.click();
	}
	public void ClickonUserPastsessionoption() {
		Clickpastsessionsbtn.click();
	}
	public void ClickonUserActivityoption() {
		Clickuseractivitybtn.click();
	}


}
