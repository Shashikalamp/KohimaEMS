package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashPHQmaptest {
	WebDriver driver;

	WebDriver ldriver;
	public dashPHQmaptest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[1]")
	@CacheLookup
	WebElement clickpoliceheadquarters;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[6]/div/div[1]/div/div[2]/span")
	@CacheLookup
	WebElement getPHQaqilevelvalue;

	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[1]/span")
	WebElement getPHQAQIvalue;


	public void  clickpoliceheadquartersoption() {
		clickpoliceheadquarters.click();
	}
	public String getPHQaqllevelvalue() {
		String mapuidata = getPHQaqilevelvalue.getText();
		return mapuidata;
	}	 
	public String  getPHQAQIvalue() {
		String clickPHQdata = getPHQAQIvalue.getText();
		return clickPHQdata ;
	}

}
