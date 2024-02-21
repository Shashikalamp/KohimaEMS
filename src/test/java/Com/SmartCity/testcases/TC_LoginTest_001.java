package Com.SmartCity.testcases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import Com.SmartCity.pageobject.LoginTest;


public class TC_LoginTest_001 extends Basetest {
	//	ExtentReports extent = new ExtentReports();
	//    ExtentTest test = extent.createTest("Your Test Case Name");
	public static WebElement We;

	@Test(groups = "TC_LoginTest_001", priority = 1)
	public void login() throws InterruptedException{
		Thread.sleep(3000);
		driver.get(Baseurl);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginTest lt = new LoginTest(driver);
		lt.setusername(UserName);
		lt.setpassword(password);
		lt.clickSubmit();

		if (driver.getTitle().equals("iRAM Environment Monitoring System | Login")) {

			Assert.assertTrue(true, "Title is matched");
			System.out.println("Title is matched");
		} else {
			Assert.assertTrue(false, "Title is not matched");
			System.out.println("Title is not matched");

		}

	}
}

