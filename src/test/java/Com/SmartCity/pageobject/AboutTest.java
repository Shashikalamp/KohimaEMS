package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AboutTest {
	WebDriver driver;
	WebDriver ldriver;
	public AboutTest (WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="/html/body/div[1]/div/div/aside/div/div[2]/div/div[1]/ul/li[5]/span[2]/a")
	///html/body/div[1]/div/section/aside/div/div[2]/div/div[1]/ul/li[5]/span[2]/a

	@CacheLookup
	WebElement ClickAboutbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div/div[1]/div[4]/div[2]/span")
	// /html/body/div[1]/div/section/div/main/div/div/div/div/div[1]/div/div/div/div[1]/div[4]/div[2]/span
	@CacheLookup
	WebElement getVersionNo;



	public void ClickonAboutoption() {
		ClickAboutbtn.click();
	}
	public String Getversionno() {
		String buildversion =getVersionNo.getText();
		return buildversion;
	}

}
