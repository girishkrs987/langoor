package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mother_articles extends Horlicks_Mothers_Home_urls{
	public static Actions action ; 
	public static Properties prop;
	//public static WebDriver driver;
	public static FileInputStream ip;
	
	public static Utility.Xls_Reader reader;
	public static String prop_path="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\config\\url.properties";
	
	//public static String path ="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\src\\main\\java\\TestData\\Data.xlsx";
	
	public static String xldata="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\src\\test\\java\\TestData\\automation_Data.xlsx";
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties prop =new Properties();
		 
		 FileInputStream ip=new FileInputStream(prop_path);
		 
		 prop.load(ip);

		 // drive urls data from xl sheet 
		 
//		 
//		 Utility.Xls_Reader obj= new Utility.Xls_Reader(xldata); 
//			
//			
//			int count= 	obj.getRowCount("Urls_data");
//
//			System.out.println("number of rows"+count);
//			
//
//			for (int i=2; i<= count; i++) {
//
//				String urls =obj.getCellData("Urls_data", "URLs", i);
//				
//				System.out.println(urls);
//			}
			
			
		 
	 intilization();
	 
	 driver.get("https://unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@horlicks-in-agency-starterkit.unileversolutions.com/mothers.html");
	 
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
   jse.executeScript("window.scrollBy(0,1800)", "");
	 
	 WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
	 String data= ask_imge.
	 
	 System.out.println(data);
//		 //
//		         WebElement science_imge = driver.findElement(By.xpath(prop.getProperty("The_Science_Inside_Image")));
//		         Science_Inside_Image(driver,science_imge);
//		         //Thread.sleep(2000);
////		        
//		         intilization();
//		          WebElement science_title =driver.findElement(By.xpath(prop.getProperty("The_Science_Inside_Title")));
//		          Science_Inside_Title(driver,science_title);
//		          
//		          intilization();
//		          WebElement products_image =driver.findElement(By.xpath(prop.getProperty("Products_Image")));
//		          Science_Inside_Title(driver,products_image);
//		          
//		          intilization();
//		          WebElement products_title =driver.findElement(By.xpath(prop.getProperty("Products_Title")));
//		          Science_Inside_Title(driver,products_title);
	}
	
	
	
	public static void Science_Inside_Image(WebDriver driver,WebElement element) throws InterruptedException {
		 
		
		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
	      
		 String urls1= driver.getCurrentUrl();
		 String finalurl1=	 urls1.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
		//System.out.println("Ask The Nutritionist Title url"+" "+finalurl1);
		
		Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 
		
		//reader.addSheet("Urls_data");
		//reader.addColumn("Urls_data", "Ask The Nutritionist Title_name");
		//reader.addColumn("Urls", "Title_name");
		reader.setCellData("Articles", "The Science Inside Image_name", 2, finalurl1);
		
		driver.quit();
	}

	public static void Science_Inside_Title(WebDriver driver,WebElement element) throws InterruptedException {
	 

	Thread.sleep(2000);
	element.click();

	Thread.sleep(2000);
	 String urls1= driver.getCurrentUrl();
	 String finalurl1=	 urls1.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
	//System.out.println("Ask The Nutritionist Title url"+" "+finalurl1);

	Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 

	//reader.addSheet("Urls_data");
	//reader.addColumn("Urls_data", "Ask The Nutritionist Title_name");
	//reader.addColumn("Urls", "Title_name");
	reader.setCellData("Articles", "The Science Inside Title_name", 2, finalurl1);

	driver.quit();
	}

public static void Products_Image(WebDriver driver,WebElement element) throws InterruptedException {
		 
		
		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
	      
		 String urls1= driver.getCurrentUrl();
		 String finalurl1=	 urls1.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
		//System.out.println("Ask The Nutritionist Title url"+" "+finalurl1);
		
		Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 
		
		//reader.addSheet("Urls_data");
		//reader.addColumn("Urls_data", "Ask The Nutritionist Title_name");
		//reader.addColumn("Urls", "Title_name");
		reader.setCellData("Articles", "Products Image_name", 2, finalurl1);
		
		driver.quit();
	}

	public static void Products_Title(WebDriver driver,WebElement element) throws InterruptedException {
	 

	Thread.sleep(2000);
	element.click();

	Thread.sleep(2000);
	 String urls1= driver.getCurrentUrl();
	 String finalurl1=	 urls1.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
	//System.out.println("Ask The Nutritionist Title url"+" "+finalurl1);

	Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 

	//reader.addSheet("Urls_data");
	//reader.addColumn("Urls_data", "Ask The Nutritionist Title_name");
	//reader.addColumn("Urls", "Title_name");
	reader.setCellData("Articles", "Products Title_name", 2, finalurl1);

	driver.quit();
	}

}
