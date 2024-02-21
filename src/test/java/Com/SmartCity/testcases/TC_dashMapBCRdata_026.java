package Com.SmartCity.testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.DashBCRmaptest;
import Com.SmartCity.pageobject.dashbPBJmaptest;

public class TC_dashMapBCRdata_026 extends TC_LoginTest_001 {
	@Test(groups = "TC_dashMapBCRdata_026", priority = 91)
	public void PBJaqileveluicompdata() throws InterruptedException {
		DashBCRmaptest dbt = new DashBCRmaptest(driver);
		Thread.sleep(2000);

		try {
			dbt.clickboxcuttingroadoption();
			System.out.println("box cutting road button is clickable");
		}
		catch(Exception e){
			System.out.println("box cutting road button is not clickable" + e.getMessage());

		}
		try {
			Thread.sleep(4000);
			String BCRmapuidata =dbt.getBCRaqllevelvalue();
			System.out.println("box cutting road ui aqi level value is : " + BCRmapuidata);
			String BCRaqilevelmapServerdata = getBCRAQIlevelDatacompServer();
			System.out.println("box cutting road server aqi level value is: " + BCRaqilevelmapServerdata);
			if (BCRmapuidata.equals(BCRaqilevelmapServerdata))
			{
				System.out.println("box cutting road ui value is equal to BCR aqi level map Server data");
			}
			else {
				System.out.println("box cutting road ui value is not equal to BCR aqi level map Server data");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get AQI Level value: " + e.getMessage()); 
		}
	}


	private String getBCRAQIlevelDatacompServer() {
		try {
			String command = "/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"Box Cutting Junction\").devices[0].aqi_level'";		
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String BCRaqilevelmapServerdata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(BCRaqilevelmapServerdata).append("\n");
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

	@Test(groups = "TC_dashMapBCRdata_026", priority = 92)
	public void BCRaqiuiservercompdata() throws InterruptedException {
		Thread.sleep(2000);
		DashBCRmaptest dbt = new DashBCRmaptest(driver);
		String clickBCRdata  =  dbt.getBCRAQIvalue();
		System.out.println("box cutting road ui aqi value is : " + clickBCRdata );	
		String BCRmapServeraqidata = getBCRAQIDatacompServer();
		System.out.println("box cutting road server aqi value is: " + BCRmapServeraqidata);
		if (clickBCRdata.equals(BCRmapServeraqidata))
		{
			System.out.println("box cutting road ui aqi value is equal to PBJ aqi map Server data");
		}
		else {
			System.out.println("box cutting road ui aqi value is not equal to PBJ aqi map Server data");
		}
	} 
	private String getBCRAQIDatacompServer() {
		try {

			String command = "/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"Box Cutting Junction\").devices[0].aqi'";

			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String BCRmapServeraqidata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(BCRmapServeraqidata).append("\n");
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
