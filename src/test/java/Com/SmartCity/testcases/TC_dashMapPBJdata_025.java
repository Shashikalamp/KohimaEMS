package Com.SmartCity.testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SmartCity.pageobject.dashbHSJmaptest;
import Com.SmartCity.pageobject.dashbPBJmaptest;

public class TC_dashMapPBJdata_025 extends TC_LoginTest_001 {
	@Test(groups = "TC_dashbMapdata_024", priority = 89)
	public void PBJaqileveluicompdata() throws InterruptedException {
		dashbPBJmaptest dpt = new dashbPBJmaptest(driver);
		Thread.sleep(2000);

		try {
			dpt.clickphoolbarijunctionoption();
			System.out.println("phool bari junction button is clickable");
		}
		catch(Exception e){
			System.out.println("phool bari junction button is not clickable" + e.getMessage());

		}
		try {
			Thread.sleep(4000);
			String PBJmapuidata =dpt.getPBJaqllevelvalue();
			System.out.println("phool bari junction ui aqi level value is : " + PBJmapuidata);
			String PBJaqilevelmapServerdata = getPBJAQIlevelDatacompServer();
			System.out.println("phool bari junction server aqi level value is: " + PBJaqilevelmapServerdata);
			if (PBJmapuidata.equals(PBJaqilevelmapServerdata))
			{
				System.out.println("phool bari  junction ui value is equal to PBJ aqi level map Server data");
			}
			else {
				System.out.println("phool bari  junction ui value is not equal to PBJ aqi level map Server data");
			}
		} catch (Exception e) {
			Assert.fail("Failed to get AQI Level value: " + e.getMessage()); 
		}
	}


	private String getPBJAQIlevelDatacompServer() {
		try {
			String command ="/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"Phool Bari Junction\").devices[0].aqi_level'";


			//String command = "/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[].devices[] | select(.id == \"200017\") | .aqi_level'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String PBJaqilevelmapServerdata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(PBJaqilevelmapServerdata).append("\n");
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
	@Test(groups = "TC_dashbMapdata_024", priority = 90)
	public void HSJaqiuiservercompdata() throws InterruptedException {
		Thread.sleep(2000);
		dashbPBJmaptest dpt = new dashbPBJmaptest(driver);
		String clickPBJdata  =  dpt.getPBJdAQIvalue();
		System.out.println("phool bari junction ui aqi value is : " + clickPBJdata );	
		String PBJmapServeraqidata = getPBJAQIDatacompServer();
		System.out.println("phool bari junction server aqi value is: " + PBJmapServeraqidata);
		if (clickPBJdata.equals(PBJmapServeraqidata))
		{
			System.out.println("phool bari junction ui aqi value is equal to PBJ aqi map Server data");
		}
		else {
			System.out.println("phool bari junction ui aqi value is not equal to PBJ aqi map Server data");
		}
	} 
	private String getPBJAQIDatacompServer() {
		try {
			String command ="/opt/iram/kohima_smartpole/ems_2.2.1/bin/ems_info | jq -r '.response.poles[] | select(.name == \"Phool Bari Junction\").devices[0].aqi'";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				String PBJmapServeraqidata= line.trim();
				// System.out.println("Weather server data is: " + serverWeatherData);
				output.append(PBJmapServeraqidata).append("\n");
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

