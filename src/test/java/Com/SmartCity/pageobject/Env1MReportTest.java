package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Env1MReportTest {
	WebDriver driver;
	WebDriver ldriver;
	public Env1MReportTest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath ="/html/body/div[1]/div/section/div/main/div/div/div/div/div[1]/div/div/div[1]/div/div/span[1]/input")
	@CacheLookup
	WebElement Selectelement;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[3]/div/label[4]/span[2]")
	@CacheLookup
	WebElement Clickon1monthreport;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[5]/div/label[1]/span[2]")
	@CacheLookup
	WebElement Clickon1monthtablereport;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[5]/div/label[2]/span[2]")
	@CacheLookup
	WebElement Clickon1monthcsvreport;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[5]/div/label[3]/span[2]")
	@CacheLookup
	WebElement Clickon1monthpdfreport;
	@FindBy(xpath="/html/body/div[1]/div/section/div/main/div/div/div/div/div[1]/div/div/div[3]/div/label[1]/span[2]/div/div[1]/input")
	@CacheLookup
	WebElement Clickondatepicker;
	@FindBy(xpath="/html/body/div[1]/div/section/div/main/div/div/div/div/div[1]/div/div/div[1]/div")
	@CacheLookup
	WebElement selectBoxCuttingRoadsite;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div/div/span[2]")
	@CacheLookup
	WebElement selectPhoolBariJunctionsite;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div/div/span[2]")
	@CacheLookup
	WebElement selectHighSchoolJunctionsite;
	public WebElement Clickenvdrpdown() 
	{
		Selectelement.click();
		return Selectelement;
	}
	public WebElement ClickonBoxCuttingRoadsite() {
		selectBoxCuttingRoadsite.click();
		return selectBoxCuttingRoadsite;
	}
	public void Clickon1monthoption() {
		Clickon1monthreport.click();
	}
	public void Clickon1monthtableoption() {
		Clickon1monthtablereport.click();
	}
	public void Clickon1monthcsvoption() {
		Clickon1monthcsvreport.click();
	}
	public void Clickon1monthpdfoption() {
		Clickon1monthpdfreport.click();
	}
	public WebElement Clickondatepickeroption() {
		Clickondatepicker.click();
		return Clickondatepicker;

	}
	public WebElement ClickonPhoolBariJunctionsite() {
		selectPhoolBariJunctionsite.click();
		return selectPhoolBariJunctionsite;
	}
	public WebElement ClickonHighSchoolJunctionsite() {
		selectHighSchoolJunctionsite.click();
		return selectHighSchoolJunctionsite;

	}
}
