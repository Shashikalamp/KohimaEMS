package Com.SmartCity.testcases;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import Com.SmartCity.pageobject.DashboardWeatherTest;

public class TC_DashbWeatherT_003 extends TC_LoginTest_001{
	@Test(groups ="TC_DashbWeatherT_003",priority=5)
	public void Weatherbtnclickable() {
		DashboardWeatherTest dw = new DashboardWeatherTest(driver);
		try {
			Thread.sleep(5000);
			dw.ClickSubmit();
			System.out.println("Weather button is clickable");
		}
		catch(Exception e){
			System.out.println("Weather button is not clickable" + e.getMessage());

		}
	}
	@Test(groups ="TC_DashbWeatherT_003",priority=6)
	public void Gobacktodashboardpage1() {
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
	@Test(groups="TC_DashbWeatherT_003",priority=7)
	public void testgetWeathervalue() {
		DashboardWeatherTest dw = new DashboardWeatherTest(driver);
		try {
			String cardWeatherData = dw.getValue();
			System.out.println("Weather ui data  is " + cardWeatherData);
			String serverWeatherData = getWeatherDataFromServer();
			System.out.println("Weather server data is: " + serverWeatherData);
			if (cardWeatherData.equals(serverWeatherData))
			{
				System.out.println("Weather data from UI is equal to Weather data from server");
			}
			else {
				System.out.println("Weather data from UI is not equal to Weather data from server");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get Weather value: " + e.getMessage()); 
		}
	}

	private String getWeatherDataFromServer() {
		try {
			String command = "/opt/iram/silvassa_ems/ems_2.2.1/bin/ems_summary_info | jq -r '.response.summary[] | select(.title == \"Weather\") | .data'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String serverWeatherData= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(serverWeatherData).append("\n");
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

