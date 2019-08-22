package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import junit.framework.Assert;

public class extent {
	
	

	public static LoginPage login; 
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static void startTest()
	{
		 String workingDir = System.getProperty("user.dir");
		 
	
		 
		 //System.out.println(workingDir);
	report = new ExtentReports(workingDir+"\\test-output\\GirishReport.html",true);
	test = report.startTest("MVC_DOCNU.COM");
	}
	
	
	@Test
	public void login_function() {
		LoginPage obj= new LoginPage();
		
		
		
	HomePage value1=	obj.VerifyLogin("9972921986", "Valid@2019");
	
	 String value2="tetskkkk"; 
	
	
	 
	
if (value2.equals(value1)) {
	
	test.log(LogStatus.PASS, "ggggggggggggggggggg");
	//test.log(LogStatus.PASS, "VerifyLogin passed ");
	}
//	//Assert.assertEquals(value2, value);
	
	
		
else
		
		test.log(LogStatus.FAIL, "VerifyLogin failed ");
	
		
		
//		test.addBase64ScreenShot(base64);
//		test.log(LogStatus.INFO, "login form working");
//		test.log(LogStatus.PASS, "this test case passed ");
	}
	

	
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://beta.docnu.com");
	test.log(LogStatus.INFO, "open my application url");
	
	if(driver.getTitle().equals("Doctor Login"))
	{
	// test.log(LogStatus.PASS, "Navigated to the specified URL");
	
	test.log(LogStatus.PASS, "Title of the appliction is correct ");
	}
	else
	{
	//test.log(LogStatus.FAIL, "Test Failed");
	test.log(LogStatus.FAIL, "ttile not match");
	}
	}
	
	@Test()
	
	public  void login_function1 () {
		
    System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		test.log(LogStatus.INFO, "assign the chrme driver calss");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "maximizethe window ");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "page laod time out");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
			driver.get("http://beta.docnu.com/");
			//Thread.sleep(5000);
			test.log(LogStatus.INFO, "open the url ");
			
			 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
			 
			 test.log(LogStatus.INFO, "clcik dr login button");
			// Thread.sleep(2000);
			// Thread.sleep(10000);
	
			 
			 driver.findElement(By.id("UserName")).sendKeys("9880062888");
			 driver.findElement(By.id("DocLoginpassword")).sendKeys("Puneeth@129");
			// Thread.sleep(2000);
			 driver.findElement(By.id("DoctorLogin")).click();
    	
	}
	
	
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
	
	

}
