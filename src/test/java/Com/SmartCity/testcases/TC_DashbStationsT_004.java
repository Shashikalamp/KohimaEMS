package Com.SmartCity.testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.DashboardStationsTest;
import Com.SmartCity.pageobject.DashboardWeatherTest;

public class TC_DashbStationsT_004 extends TC_LoginTest_001 {

	@Test(groups ="TC_DashbStationsT_004",priority=8)
	public void Stationsbtnclickable() {

		DashboardStationsTest ds = new DashboardStationsTest(driver);
		try {
			Thread.sleep(10000);
			ds.ClickSubmit();
			System.out.println("Stations button is clickable");
		}
		catch(Exception e){
			System.out.println("Stations button is not clickable" + e.getMessage());

		}
	}
	@Test(groups ="TC_DashbStationsT_004",priority=9)
	public void Gobacktodashboardpage2() {
		try {
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(10000);
			System.out.println("Page navigate to dashboard page");
		}

		catch(Exception e) {
			System.out.println("Page is not navigate to dashboard page" + e.getMessage());
		}
	}
	@Test(groups ="TC_DashbStationsT_004",priority=10)
	public void testgetStationsvalue() {
		DashboardStationsTest ds = new DashboardStationsTest(driver);
		try {
			String cardStationsData = ds.getValue();
			System.out.println("Stations ui data  is " + cardStationsData);
			String serverStationsData = getStationsDataFromServer();
			System.out.println("Stations server data is: " + serverStationsData);
			if (cardStationsData.equals(serverStationsData))
			{
				System.out.println("Stations data from UI is equal to Stations data from server");
			}
			else {
				System.out.println("Stations data from UI is not equal to Stations data from server");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get Stations value: " + e.getMessage()); 
		}

	}
	private String getStationsDataFromServer() {
		try {
			String command = "/opt/iram/silvassa_ems/ems_2.2.1/bin/ems_summary_info | jq -r '.response.summary[] | select(.title == \"Stations\") | .data'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String serverStationsData= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(serverStationsData).append("\n");
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
