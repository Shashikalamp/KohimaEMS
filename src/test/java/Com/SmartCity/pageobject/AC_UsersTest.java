package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AC_UsersTest {
	WebDriver driver;
	WebDriver ldriver;
	public AC_UsersTest (WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="")
	@CacheLookup
	WebElement Clickuserbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[3]/button/span")
	@CacheLookup
	WebElement Clickadduserbtn;
	@FindBy(id="addUserForm_loginId")
	@CacheLookup
	WebElement ClickLoginidbtn;
	@FindBy(id = "addUserForm_name")
	@CacheLookup
	WebElement ClickUsernamebtn;
	@FindBy(id= "addUserForm_passwd")
	@CacheLookup
	WebElement ClickPasswordbtn;
	@FindBy(id= "addUserForm_confirmPasswd")
	@CacheLookup
	WebElement ClickConfirmPasswordbtn;
	@FindBy(id="addUserForm_role")
	@CacheLookup
	WebElement ClickRolebtn;
	@FindBy(xpath= "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[5]/div/div[2]/div/div/div/div/span[2]")
	@CacheLookup
	WebElement SelectRolebtn;
	@FindBy(id="addUserForm_phone")
	@CacheLookup
	WebElement ClickPhoneNobtn;
	@FindBy(id="addUserForm_email")
	@CacheLookup
	WebElement ClickEmailIdbtn;
	@FindBy(id ="addUserForm_department")
	@CacheLookup
	WebElement ClickDepartmentbtn;
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]/span")
	@CacheLookup
	WebElement ClickAddbtn;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement ClickClosebtn;
	public void Clickonuseroption() {
		Clickuserbtn.click();
	}
	public void Clickonadduseroption() {
		Clickadduserbtn.click();
	}
	public WebElement Clickonloginidoption() {
		ClickLoginidbtn.click();
		return ClickLoginidbtn;
	}
	public WebElement ClickonUsernameoption() {
		ClickUsernamebtn.click();
		return ClickUsernamebtn;
	}
	public WebElement ClickonPasswordoption() {
		ClickPasswordbtn.click();
		return ClickPasswordbtn;
	}

	public WebElement ClickonConfirmPasswordoption() {
		ClickConfirmPasswordbtn.click();
		return ClickConfirmPasswordbtn;
	}
	public WebElement ClickonRoleoption() {
		ClickRolebtn.click();
		return ClickRolebtn;
	}
	public WebElement ClickonSelectroleoption() {
		SelectRolebtn.click();
		return SelectRolebtn;
	}
	public WebElement ClickonPhoneNooption() {
		ClickPhoneNobtn.click();
		return ClickPhoneNobtn;
	}  
	public WebElement ClickonEmailIdoption() {
		ClickEmailIdbtn.click();
		return ClickEmailIdbtn;
	}
	public WebElement ClickonDepartmentoption() {
		ClickDepartmentbtn.click();
		return ClickDepartmentbtn;
	}
	public void ClickonAddoption() {
		ClickAddbtn.click();
	}
	public void Clickoncloseoption() {
		ClickClosebtn.click();
	}

}
