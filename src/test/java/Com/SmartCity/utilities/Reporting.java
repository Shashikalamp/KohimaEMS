package Com.SmartCity.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.HTMLReporter;

public class Reporting extends TestListenerAdapter  {

	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	public void onstart(ITestContext testcontext)
	{
      
     String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName ="Karimnagar"+timeStamp+".html" ;
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/Karimnagaroutput/"+repName);
		htmlreporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Hostname","localhost");
	htmlreporter.config().setDocumentTitle("Karimanagar report");
	htmlreporter.config().setReportName("Login report");
		
	}
	
	public void OnTestsuccess(ITestResult tr) {
		logger = extent.createTest(tr.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
	}
	public void OnTestfailure(ITestResult tr)
	{
		logger = extent.createTest(tr.getName());
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
	}
	 
	public void OnFinish(ITestContext testcontext) {
		extent.flush();
	}
}
