package Com.SmartCity.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.AC_UsersTest;
import Com.SmartCity.pageobject.AccessControlTest;

public class AC_UserT_016  extends TC_LoginTest_001{
	@Test(groups ="AC_UserT_016",priority=71)
	public void ClickonAdduserbutton() throws InterruptedException {
		AccessControlTest Ac = new AccessControlTest(driver);
		Thread.sleep(2000);
		Ac.Clickonaccesscontroloption();
		AC_UsersTest Acu = new AC_UsersTest(driver);
		try {
			Thread.sleep(2000);
			Acu.Clickonadduseroption();
			System.out.println("Add user button is clickable");
			Thread.sleep(2000);
			WebElement we1 = Acu.Clickonloginidoption();
			System.out.println("Login Id  button is clickable");
			Thread.sleep(2000);
			we1.sendKeys("operator");
			System.out.println("Login id data entered successfully");
			Thread.sleep(2000);
			WebElement we2 = Acu.ClickonUsernameoption();
			System.out.println("UserName button is clickable");
			Thread.sleep(2000);
			we2.clear();
			Thread.sleep(2000);
			we2.sendKeys("operatoruser1");
			System.out.println("Username data entered successfully");
			Thread.sleep(2000);
			WebElement we3 = Acu.ClickonPasswordoption();
			System.out.println("Password button is clickable");
			Thread.sleep(2000);
			we3.clear();
			Thread.sleep(2000);
			we3.sendKeys("admin1234");
			System.out.println("Password data entered successfully");
			Thread.sleep(2000);
			WebElement we4 = Acu.ClickonConfirmPasswordoption();
			System.out.println("ConfirmPassword button is clickable");
			Thread.sleep(2000);
			we4.clear();
			Thread.sleep(2000);
			we4.sendKeys("admin1234");
			System.out.println("ConfirmPassword data entered successfully");
			Thread.sleep(2000);
			Acu.ClickonRoleoption();
			System.out.println("Role button is clickable");
			Thread.sleep(2000);
			List<WebElement>allOptions = driver.findElements(By.xpath("//div[@class='rc-virtual-list']//div[@class='rc-virtual-list-holder-inner']/div"));
			String option = "Operator";
			for(int i = 0; i < allOptions.size(); i++) {
				if (allOptions.get(i).getText().contains(option)) {

					allOptions.get(i).click();

					System.out.println("roles data entered successfully");

					break;
				}
			}
			Thread.sleep(2000);
			WebElement we6= Acu.ClickonPhoneNooption();
			System.out.println("PhoneNo button is clickable");
			Thread.sleep(2000);
			we6.sendKeys("9998478444");
			System.out.println("PhoneNo data entered successfully");
			Thread.sleep(2000);
			WebElement we7= Acu.ClickonEmailIdoption();
			System.out.println("EmailId button is clickable");
			Thread.sleep(2000);
			we7.sendKeys("Operator@gmail.com");
			System.out.println("EmailId data entered successfully");
			Thread.sleep(2000);
			WebElement we8= Acu.ClickonDepartmentoption();
			System.out.println("Department button is clickable");
			Thread.sleep(2000);
			we8.sendKeys("IT");
			System.out.println("Department data entered successfully");
			//Thread.sleep(2000);
			//Acu.Clickoncloseoption();
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e.getMessage());
		}	
		try {
			driver.manage().window().maximize();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// Scroll down till the bottom of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			System.out.println("Page is scrolled down");
			Thread.sleep(2000);

			// The following line was missing in the original code
			Acu.ClickonAddoption();
			System.out.println("Add button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
}
