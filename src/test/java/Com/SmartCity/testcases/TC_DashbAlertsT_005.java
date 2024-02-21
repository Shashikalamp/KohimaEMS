package Com.SmartCity.testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.DashboardAlertsTest;
import Com.SmartCity.pageobject.DashboardStationsTest;

public class TC_DashbAlertsT_005 extends TC_LoginTest_001 {
	@Test(groups ="TC_DashbAlertsT_005",priority=11)
	public void Alertsbtnclickable() {

		DashboardAlertsTest da = new DashboardAlertsTest(driver);
		try {
			Thread.sleep(5000);
			da.ClickSubmit();
			System.out.println("Alerts button is clickable");
		}
		catch(Exception e){
			System.out.println("Alerts button is not clickable" + e.getMessage());

		}
	}
	@Test(groups ="TC_DashbAlertsT_005",priority=12)
	public void Gobacktodashboardpage3() {
		try {
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			System.out.println("Page navigate to dashboard page");
		}

		catch(Exception e) {
			System.out.println("Page is not navigate to dashboard page" + e.getMessage());
		}
	}
	@Test(groups ="TC_DashbAlertsT_005",priority=13)
	public void testgetAlertsvalue() {
		DashboardAlertsTest da = new DashboardAlertsTest(driver);
		try {
			String cardAlertsData = da.getValue();
			System.out.println("Alerts ui data  is " + cardAlertsData);
			String serverAlertsData = getAlertsDataFromServer();
			System.out.println("Alerts server data is: " + serverAlertsData);
			if (cardAlertsData.equals(serverAlertsData))
			{
				System.out.println("Alerts data from UI is equal to Alerts data from server");
			}
			else {
				System.out.println("Alerts data from UI is equal not to Alerts data from server");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get Alerts value: " + e.getMessage()); 
		}

	}
	private String getAlertsDataFromServer() {
		try {
			String command = "/opt/iram/silvassa_ems/ems_2.2.1/bin/ems_summary_info | jq -r '.response.summary[] | select(.title == \"Alerts\") | .data'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String serverAlertsData= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(serverAlertsData).append("\n");
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
