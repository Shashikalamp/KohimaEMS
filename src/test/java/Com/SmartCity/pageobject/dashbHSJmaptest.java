package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashbHSJmaptest {
	WebDriver driver;

	WebDriver ldriver;
	public dashbHSJmaptest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[4]")
	@CacheLookup
	WebElement clickhighschooljunction;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[6]/div/div[1]/div/div[2]/span")
	@CacheLookup
	WebElement gethighschooljunctionvalue;
	@FindBy(xpath ="/html/body/div/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div[1]/div/a[2]")
	@CacheLookup
	WebElement clickzoomoutbtn;
	@FindBy(xpath ="/html/body/div/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[4]")
	@CacheLookup
	WebElement getHSJAQIvalue;

	public WebElement clickzoomoutoption() {
		clickzoomoutbtn.click();
		return clickzoomoutbtn;
	}
	public void  clickhighschooljunctionoption() {
		clickhighschooljunction.click();
	}
	public String  gethighschooljunctionValue() {
		String mapuidata =gethighschooljunctionvalue.getText();
		return mapuidata;
	}	 
	public String  getHSJdAQIatavalue() {
		String clickHSJdatabtn = getHSJAQIvalue.getText();
		return clickHSJdatabtn ;
	}
}
