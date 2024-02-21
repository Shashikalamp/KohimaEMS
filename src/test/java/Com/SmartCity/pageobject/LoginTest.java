package Com.SmartCity.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	WebDriver driver;

	WebDriver ldriver;
	public LoginTest(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id ="login_loginId")
	@CacheLookup
	WebElement txtUserName;
	@FindBy(css ="#login_password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(css ="#login > div:nth-child(5) > div > div > div > div > button > span")
	@CacheLookup
	WebElement btnLogin;



	public void setusername(String uname) {
		txtUserName.sendKeys(uname);
	}
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnLogin.click();
	}

}
