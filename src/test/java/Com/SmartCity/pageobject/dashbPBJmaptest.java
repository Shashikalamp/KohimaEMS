package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashbPBJmaptest {
	WebDriver driver;

	WebDriver ldriver;
	public dashbPBJmaptest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath ="/html/body/div/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[3]")
	@CacheLookup
	WebElement clickphoolbarijunction;
	@FindBy(xpath ="/html/body/div/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[6]/div/div[1]/div/div[2]/span")
	@CacheLookup
	WebElement getPBJaqllevelvalue;

	@FindBy(xpath ="/html/body/div/div/div/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[4]/div[3]/span")
	WebElement getPBJAQIvalue;


	public void  clickphoolbarijunctionoption() {
		clickphoolbarijunction.click();
	}
	public String  getPBJaqllevelvalue() {
		String mapuidata =getPBJaqllevelvalue.getText();
		return mapuidata;
	}	 
	public String  getPBJdAQIvalue() {
		String clickPBJdata = getPBJAQIvalue.getText();
		return clickPBJdata ;
	}

}
