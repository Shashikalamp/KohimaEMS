package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBCRmaptest {
	WebDriver driver;

	WebDriver ldriver;
	public DashBCRmaptest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath ="/html/body/div/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[2]")
	@CacheLookup
	WebElement clickboxcuttingroad;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[6]/div/div[1]/div/div[2]/span")
	@CacheLookup
	WebElement getBCRaqilevelvalue;

	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[2]/span")
	WebElement getBCRAQIvalue;


	public void  clickboxcuttingroadoption() {
		clickboxcuttingroad.click();
	}
	public String getBCRaqllevelvalue() {
		String mapuidata = getBCRaqilevelvalue.getText();
		return mapuidata;
	}	 
	public String  getBCRAQIvalue() {
		String clickBCRdata = getBCRAQIvalue.getText();
		return clickBCRdata ;
	}
}
