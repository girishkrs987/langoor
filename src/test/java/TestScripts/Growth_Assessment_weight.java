package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Growth_Assessment_weight {

	
	public static WebDriver driver;
	public static String prop_path="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\config\\config.properties";
	
	public static String path ="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\src\\main\\java\\TestData\\Data.xlsx";
	

	
	
			
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		Properties prop =new Properties();
		 
		 FileInputStream ip=new FileInputStream(prop_path);
		 
		 prop.load(ip);
		 
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");

		 driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get(prop.getProperty("URL1"));
		 
		//span[@class='font-red' and text()='Severely Stunted'] 
		 			
		 
		 
			Utility.Xls_Reader obj= new Utility.Xls_Reader(path); 
			
			
		int count= 	obj.getRowCount("Testingdata");

		System.out.println("number of rows"+count);
		

		for (int i=2; i<= count; i++) {

			String Genders =obj.getCellData("Testingdata", "Gender", i);
			
			
			
			System.out.println(Genders.trim());
			
			String Ages =obj.getCellData("Testingdata", "Age", i);
			System.out.println(Ages);
			String Months =obj.getCellData("Testingdata", "Month", i);
			System.out.println(Months);
			String Heights =obj.getCellData("Testingdata", "Height", i);
			System.out.println(Heights);
			String Weights =obj.getCellData("Testingdata", "Weight", i);
			System.out.println(Weights);
			
			// String b ="Boy"; 
		 Select gender= new Select (driver.findElement(By.xpath(prop.getProperty("Gender"))));
		 gender.selectByVisibleText(Genders.trim());
//			 
			// Thread.sleep(2000);
//			 
//			// String ag ="2 yrs"; 
			 Select age= new Select (driver.findElement(By.xpath(prop.getProperty("Age"))));
			 age.selectByVisibleText(Ages);
		 	// Thread.sleep(2000);
//			 
//			// String mnth ="03 mths";  
			 Select months= new Select (driver.findElement(By.xpath(prop.getProperty("Month"))));
//				// gender.selectByVisibleText(ag);
		 months.selectByVisibleText(Months);	
//			
//			
		// Thread.sleep(2000);
//			// String hight ="73.5 cm"; 
			 Select Weight= new Select (driver.findElement(By.xpath(prop.getProperty("Weight"))));
			 
			
			 Weight.selectByVisibleText(Weights.trim());	

			 
			String OutPut1= driver.findElement(By.xpath("//span[@class='weight-msg']")).getText();
					 
			 obj.setCellData("Testingdata", "Height_Remarks", i, OutPut1);
			 
			 
			 //Thread.sleep(2000);

			 
			 
	}
			 
			
		
//		 String b ="Boy"; 
//		 Select gender= new Select (driver.findElement(By.xpath(prop.getProperty("Gender"))));
//		 gender.selectByVisibleText(b);
//		 
//		 Thread.sleep(2000);
		 //driver.findElement(By.xpath(prop.getProperty("Gender")));
	
		// list of age data 
//				 List<WebElement> age=	 driver.findElements(By.xpath(prop.getProperty("Age")));
//				 
//				 for(int i=0; i<age.size();i++) {
//					 
//					 System.out.println(age.get(i).getText());
//				 } 
				 
//				 String ag ="2 yrs"; 
//				 Select month= new Select (driver.findElement(By.xpath(prop.getProperty("Age"))));
//				 month.selectByVisibleText(ag);
				// month.selectByIndex(ag);
				 
				// list of Month data 
//				 List<WebElement> Month=	 driver.findElements(By.xpath(prop.getProperty("Month")));
//				 
//				 for(int i=0; i<Month.size();i++) {
//					 
//					 System.out.println(Month.get(i).getText());
//				 } 
				 
//				 String mnth ="03 mths";  
//				 Select months= new Select (driver.findElement(By.xpath(prop.getProperty("Month"))));
//					// gender.selectByVisibleText(ag);
//				 months.selectByVisibleText(mnth);	
//				 
				// list of height data 
//				 List<WebElement> Height=	 driver.findElements(By.xpath(prop.getProperty("Height")));
//				 
//				 for(int i=0; i<Height.size();i++) {
//					 
//					 System.out.println(Height.get(i).getText());
//				 }		 
				 
				 
//				 String hight ="73.5 cm"; 
//				 Select Height= new Select (driver.findElement(By.xpath(prop.getProperty("Height"))));
//				 Height.selectByVisibleText(hight);	
//				 
				// list of Weight data 
//				 List<WebElement> Weight=	 driver.findElements(By.xpath(prop.getProperty("Weight")));
//				 
//				 for(int i=0; i<Weight.size();i++) {
//					 
//					 System.out.println(Weight.get(i).getText());
//				 }		 
				 		 
//				 Thread.sleep(2000);l
//				 String weight ="6.4 kg"; 
//				 Select Weight= new Select (driver.findElement(By.xpath(prop.getProperty("Weight"))));
//				 Weight.selectByVisibleText(weight);	
//				 
//				 driver.navigate().refresh();
	

}}
