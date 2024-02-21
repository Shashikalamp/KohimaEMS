package Com.SmartCity.testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.DashboardAQITest1;
public class TC_DashboardAQIT_002 extends TC_LoginTest_001 {

	@Test(groups ="TC_DashboardAQIT_002",priority =2)
	public void dashboardsetup() throws InterruptedException {
		DashboardAQITest1 dt = new DashboardAQITest1(driver);

		try {
			Thread.sleep(5000);
			dt.clickSubmit();
			System.out.println("AQI button is clickable");
		}
		catch(Exception e){
			System.out.println("AQI button is not clickable" + e.getMessage());

		}
	}
	@Test(groups ="TC_LoginTest_002",priority=3)
	public void Gobacktodashboardpage() {
		try {
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(10000);
			System.out.println("Page navigate to dashboard page");
		}

		catch(Exception e) {
			System.out.println("Page is not navigate to dashboard page" + e.getMessage());
		}
	}
	@Test(groups ="TC_LoginTest_002",priority=4)
	public void testgetAQIvalue() {
		DashboardAQITest1 dt = new DashboardAQITest1(driver);
		try {
			String cardData = dt.getValue();
			System.out.println("AQI ui data  is " + cardData);
			String serverAQIData = getAQIDataFromServer();
			System.out.println("AQI server data is: " + serverAQIData);
			if (cardData.equals(serverAQIData))
			{
				System.out.println("AQI data from UI is equal to AQI data from server");
			}
			else {
				System.out.println("AQI data from UI is not equal  to AQI data from server");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get AQI value: " + e.getMessage()); 
		}

	}
	/*	@Test(priority=5)
	public void testgetAQIvaluefromserver() {
		  try {
			     String serverAQIData = getAQIDataFromServer();
			        System.out.println("AQI server data is: " + serverAQIData);


		  }
		       catch (Exception e) {
        e.printStackTrace();
    }
	}*/
	private String getAQIDataFromServer() {
		try {
			String command = "/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_summary_info | jq -r '.response.summary[] | select(.title == \"AQI\") | .data'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);

			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String aqiData = line.trim();
				System.out.println("AQI server data is: " + aqiData);
				output.append(aqiData).append("\n");
			}

			process.waitFor();
			int exitCode = process.exitValue();
			System.out.println("Script executed with exit code: " + exitCode);

			return output.toString().trim();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			return null;
		}



	}	
}
