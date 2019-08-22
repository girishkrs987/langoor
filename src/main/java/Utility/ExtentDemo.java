package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;
import Pages.LoginPage;
import Testcases.PatientRegistrationTest;



public class ExtentDemo extends TestBase{
	ExtentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static LoginPage login; 
	static ExtentTest test;
	static ExtentReports report;
	
	
	@BeforeClass
	public static void startTest()
	{
		 String workingDir = System.getProperty("user.dir");
	report = new ExtentReports(workingDir+"\\test-output\\Girish.html",true);
	test = report.startTest("ExtentDemo");
	}
	
	// ExtentReportResults
	
	@BeforeMethod
	public void setup() {
		TestBase obj=new TestBase();
		obj.intiliazation();
		test.log(LogStatus.INFO, "Application opened");
	}
	
	@Test
	public void login_function() {
		LoginPage obj= new LoginPage();
		
		obj.VerifyLogin("8310181488", "qweasdzxc");
		test.log(LogStatus.INFO, "login form working");
	}
	
	
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://beta.docnu.com");
	if(driver.getTitle().equals("Google"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	}
	
	@Test
	public 	void verifyPatientRegistration() {
		
		
				//String text=loginpage.verifymessage();	
				// Assert.assertEquals(text, "DOCTOR LOGIN");
	login.VerifyLogin(porp.getProperty("Username"),porp.getProperty("Password"));
		//login.Patient_reg.Patient_Registeration();
	}
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	


	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
	
}
