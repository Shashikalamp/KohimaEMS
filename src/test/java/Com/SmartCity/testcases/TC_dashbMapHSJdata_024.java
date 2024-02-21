package Com.SmartCity.testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import Com.SmartCity.pageobject.LoginTest;
import Com.SmartCity.pageobject.dashbHSJmaptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TC_dashbMapHSJdata_024 extends TC_LoginTest_001  {
	@Test(groups = "TC_dashbMapdata_024", priority = 87)
	public void HSJaqileveluicompdata() throws InterruptedException {
		dashbHSJmaptest dmt = new dashbHSJmaptest(driver);
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement doubleclick = dmt.clickzoomoutoption();
		actions.doubleClick(doubleclick).perform();
		System.out.println("zoom out button is clickable ");
		Thread.sleep(2000);
		try {
			dmt.clickhighschooljunctionoption();
			System.out.println("high school junction button is clickable");
		}
		catch(Exception e){
			System.out.println("high school junction button is not clickable" + e.getMessage());

		}
		try {
			Thread.sleep(4000);
			String mapuidata =dmt.gethighschooljunctionValue();
			System.out.println("high school junction ui aqi level value is : " + mapuidata);
			String HSJaqilevelmapServerdata = getHSJAQIlevelDataFromServer();
			System.out.println("high school junction server aqi level value is: " + HSJaqilevelmapServerdata);
			if (mapuidata.equals(HSJaqilevelmapServerdata))
			{
				System.out.println("high school junction ui value is equal to HSJ aqi level map Server data");
			}
			else {
				System.out.println("high school junction ui value is not equal to HSJ aqi level map Server data");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get AQI Level value: " + e.getMessage()); 
		}
	}


	private String getHSJAQIlevelDataFromServer() {
		try {
			String command ="/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"High School Junction\").devices[0].aqi_level'";


			//String command = "/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[].devices[] | select(.id == \"200017\") | .aqi_level'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String HSJaqilevelmapServerdata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(HSJaqilevelmapServerdata).append("\n");
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
	@Test(groups = "TC_dashbMapdata_024", priority = 88)
	public void HSJaqiuiservercompdata() throws InterruptedException {
		Thread.sleep(2000);
		dashbHSJmaptest dmt = new dashbHSJmaptest(driver);
		String clickHSJuiaqidata  =  dmt.getHSJdAQIatavalue();
		System.out.println("High school junction ui aqi value is : " + clickHSJuiaqidata );	
		String HSJmapServeraqidata = getHSJAQIDataFromServer();
		System.out.println("high school junction server aqi value is: " + HSJmapServeraqidata);
		if (clickHSJuiaqidata.equals(HSJmapServeraqidata))
		{
			System.out.println("high school junction ui aqi value is equal to HSJ aqi map Server data");
		}
		else {
			System.out.println("high school junction ui aqi value is not equal to HSJ aqi map Server data");
		}
	} 
	private String getHSJAQIDataFromServer() {
		try {
			String command ="/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"High School Junction\").devices[0].aqi'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String HSJaqilevelmapServerdata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(HSJaqilevelmapServerdata).append("\n");
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