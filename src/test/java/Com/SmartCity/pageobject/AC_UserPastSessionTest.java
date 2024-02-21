package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AC_UserPastSessionTest {
	WebDriver driver;
	WebDriver ldriver;
	public AC_UserPastSessionTest (WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[4]/div")
	@CacheLookup
	WebElement ClickPastsessionbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[1]/input")
	@CacheLookup
	WebElement Clickdrpdwnbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[2]")
	@CacheLookup
	WebElement SelectserviceUserbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/span[2]")
	@CacheLookup
	WebElement SelectadminUserbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[2]/span[2]")
	@CacheLookup
	WebElement Clickon1Dbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[3]/span[2]")
	@CacheLookup
	WebElement Clickon1Wbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[3]/div/label[4]/span[2]")
	@CacheLookup
	WebElement Clickon1Mbtn;



	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[4]/div/label[1]/span[2]")
	@CacheLookup
	WebElement ClickonTablebtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[4]/div/label[2]/span[2]")
	@CacheLookup
	WebElement ClickonCSVDbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[4]/div/label[3]/span[2]")
	@CacheLookup
	WebElement ClickonPDFbtn;

	public void ClickonPastsessionoption() {
		ClickPastsessionbtn.click();
	}
	public void ClickonDropdwnoption() {
		Clickdrpdwnbtn.click();
	}
	public WebElement SelectserviceUseroption() {
		SelectserviceUserbtn.click();
		return SelectserviceUserbtn;

	}
	public WebElement SelectadminUseroption() {
		SelectadminUserbtn.click();
		return SelectadminUserbtn;
	}
	public void Clickon1Doption() {
		Clickon1Dbtn.click();
	}
	public void Clickon1Woption() {
		Clickon1Wbtn.click();
	}
	public void Clickon1Moption() {
		Clickon1Mbtn.click();
	}

	public void Clickon1Dtableoption() {
		ClickonTablebtn.click();
	}
	public void Clickon1DCSVoption() {
		ClickonCSVDbtn.click();
	}
	public void Clickon1DPDFoption() {
		ClickonPDFbtn.click();
	}
}
