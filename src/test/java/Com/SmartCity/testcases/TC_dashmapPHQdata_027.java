package Com.SmartCity.testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.DashBCRmaptest;
import Com.SmartCity.pageobject.dashPHQmaptest;

public class TC_dashmapPHQdata_027 extends TC_LoginTest_001 {
	@Test(groups = "TC_dashmapPHQdata_027", priority = 93)
	public void PHQaqileveluicompdata() throws InterruptedException {
		dashPHQmaptest dpht = new dashPHQmaptest(driver);
		Thread.sleep(2000);

		try {
			dpht.clickpoliceheadquartersoption();
			System.out.println("police head quarters button is clickable");
		}
		catch(Exception e){
			System.out.println("police head quarters button is not clickable" + e.getMessage());

		}
		try {
			Thread.sleep(4000);
			String PHQmapuidata =dpht.getPHQaqllevelvalue();
			System.out.println("police head quarters ui aqi level value is : " + PHQmapuidata);
			String PHQaqilevelmapServerdata = getPHQAQIlevelDatacompServer();
			System.out.println("police head quarters server aqi level value is: " + PHQaqilevelmapServerdata);
			if (PHQmapuidata.equals(PHQaqilevelmapServerdata))
			{
				System.out.println("police head quarters ui value is equal to PHQ aqi level map Server data");
			}
			else {
				System.out.println("police head quarters ui value is not equal to PHQ aqi level map Server data");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get AQI Level value: " + e.getMessage()); 
		}
	}


	private String getPHQAQIlevelDatacompServer() {
		try {
			String command = "/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"Police Head Quarters\").devices[0].aqi_level'";		
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String PHQaqilevelmapServerdata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(PHQaqilevelmapServerdata).append("\n");
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

	@Test(groups = "TC_dashMapPHQdata_027", priority = 94)
	public void PHQaqiuiservercompdata() throws InterruptedException {
		Thread.sleep(2000);
		dashPHQmaptest dpht = new dashPHQmaptest(driver);
		String clickPHQdata  =  dpht.getPHQAQIvalue();
		System.out.println("police head quarters ui aqi value is : " + clickPHQdata );	
		String PHQmapServeraqidata = getPHQAQIDatacompServer();
		System.out.println("police head quarters server aqi value is: " + PHQmapServeraqidata);
		if (clickPHQdata.equals(PHQmapServeraqidata))
		{
			System.out.println("police head quarters ui aqi value is equal to PBJ aqi map Server data");
		}
		else {
			System.out.println("police head quarters ui aqi value is not equal to PBJ aqi map Server data");
		}
	} 
	private String getPHQAQIDatacompServer() {
		try {

			String command = "/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"Police Head Quarters\").devices[0].aqi'";

			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String PHQmapServeraqidata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(PHQmapServeraqidata).append("\n");
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
