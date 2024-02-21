package Com.SmartCity.testcases;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.SmartCity.utilities.Readconfig;
import com.aventstack.extentreports.ExtentTest;
public class Basetest { 
	
	 Readconfig readconfig = new Readconfig();
	 public String Baseurl  = readconfig.getApplicationURL();
	 public String UserName = readconfig.getUserName();
	 public String password = readconfig.getpassword();
	 public static WebDriver driver;
	 public static Logger logger;
	 static ExtentTest test;
	 @BeforeClass
	 @Parameters("browser")
	 @Test(groups = "base")
	public void setup(@Optional("chrome")String br) {
	  //WebDriverManager.chromedriver().setup();
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/iram/Desktop/chromedriver-linux64/chromedriver");
			driver = new ChromeDriver();	
		}
		else if (br.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","/home/iram/Downloads/geckodriver");
			driver = new FirefoxDriver();	
		}
	 }
	 @AfterClass
	 @Test(groups = "base")
	 public void logout() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/a")).click();
		// /html/body/div[1]/div/section/header/div/a/span[2]
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/span/div")).click();
		 Thread.sleep(2000);
		//div[normalize-space()='Logout']
		 driver.quit();
		 Thread.sleep(2000);
		 driver.close();
	 }
}		
/*@Parameters("os")
		public void operatingsystem(String os) throws MalformedURLException {
			  DesiredCapabilities capabilities = new DesiredCapabilities();
		        if (os.equals("Linux")) {
		            capabilities.setCapability("platform", "Linux");
		        } 
		        else if (os.equals("Mac")) {
		            capabilities.setCapability("platform", "MAC");
		        }
		      URL remoteUrl = new URL("http://10.10.72.82:53/wd/hub");
		      driver = new RemoteWebDriver(remoteUrl, capabilities);
		    }*/
//logger = Logger.getLogger("Parking");
//	PropertyConfigurator.configure("Log4j.properties");
		
	/*@AfterClass
	public void tearDown() {
		
		driver.quit();
	}*/
	 


