package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Xls_Reader;
import junit.framework.Assert;


public class Horlicks_Mothers_Home_urls2 {
	public static WebDriverWait wait ;  
	
	public static Actions action ; 
	public static Properties prop;
	public static WebDriver driver;
	public static FileInputStream ip;
	public static WebElement ask_imge;
	public static WebElement ask_title;
	public static WebElement buyonline_image;
	public static WebElement buyonline_title;
	public static WebElement Ads_Image;
	public static WebElement Ads_title;
	public static JavascriptExecutor jse;
	
	// Create action class object
	public static Actions builder; 
	
	public static Utility.Xls_Reader reader;
	public static String prop_path="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\config\\url.properties";
	
	public static String path ="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\src\\main\\java\\TestData\\Data.xlsx";
	
	public static String xldata="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\src\\test\\java\\TestData\\automation_Data.xlsx";
	
	//public static Properties prop1 ;
	//public static void main(String[] args) throws IOException, InterruptedException {
		
		@BeforeMethod
		public void setup() throws InterruptedException, IOException {
			 prop =new Properties();
			 
			 FileInputStream ip=new FileInputStream(prop_path);
			 
			 prop.load(ip);
			 System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
				
				
			 driver =new ChromeDriver(); 
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 
			 Thread.sleep(2000);

		}
		
		
		 @AfterMethod
		 public void closebrowser() {
			 
			 driver.quit();
		 }
		 
		 // verify Ask_The_Nutritionist__Image_Name url 
		 @Test(enabled=true)
		 public void ask_image1() throws InterruptedException{
			 
			 driver.get(prop.getProperty("URL_mothers"));
		
			 JavascriptExecutor jse = (JavascriptExecutor) driver;
		     jse.executeScript("window.scrollBy(0,1800)", "");
			 WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
			 Thread.sleep(2000);
			 ask_image(driver, ask_imge); 
			 
			
			 		 }
		// verify Ask_The_Nutritionist__Image_title  url 	 
		 @Test(enabled=true)
		 public void ask_title1() throws InterruptedException{
			 
			  driver.get(prop.getProperty("URL_mothers"));
			 JavascriptExecutor jse = (JavascriptExecutor) driver;
		   jse.executeScript("window.scrollBy(0,1800)", "");
		   WebElement ask_title =driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Title_Name")));
			 Thread.sleep(2000);
			 ask_title(driver, ask_title); 
			//Horlicks_Mothers_Home_urls2.ask_title(driver, element)
			}
		 //verify buyonline_image_image  url
			 @Test(enabled=true)
			 public void buyonline_image() throws InterruptedException{
				driver.get(prop.getProperty("URL_mothers"));
				JavascriptExecutor jse = (JavascriptExecutor) driver;
			   jse.executeScript("window.scrollBy(0,1400)", "");
			      WebElement buyonline_image =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Image_Name")));
			      jse.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", buyonline_image); 

				 Thread.sleep(2000);
				 Buy_Online_image(driver, buyonline_image); 	
				
				 			 }
			 //verify buyonline_image_title url		
			 @Test(enabled=true)
	 public void buyonline_title() throws InterruptedException{
				driver.get(prop.getProperty("URL_mothers"));
				JavascriptExecutor jse = (JavascriptExecutor) driver;
			   jse.executeScript("window.scrollBy(0,1400)", "");
			     WebElement buyonline_title =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Nutritionist__Title_Name")));
				 Thread.sleep(2000);
				 Buy_Online_Title(driver, buyonline_title); 	
				// Horlicks_Mothers_Home_urls2.Buy_Online_Title(driver, element)
	 }
	 //verify watch_ads_image url	
			 @Test(enabled=true)
	 public void watch_ads_image() throws InterruptedException{
		 driver.get(prop.getProperty("URL_mothers"));
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0,1400)", "");
	   WebElement Ads_Image =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Image_Name")));
		 Thread.sleep(2000);
		 watch_our_ads_image(driver, Ads_Image); 
		 Thread.sleep(5000);
	 }
	//verify watch_ads_title url	
			 @Test(enabled=true)
	 public void watch_ads_title() throws InterruptedException{
		 driver.get(prop.getProperty("URL_mothers"));
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0,1400)", "");
	    WebElement Ads_title =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Nutritionist__Title_Name")));
		 Thread.sleep(2000);
		 watch_our_ads_Title(driver, Ads_title); 
		 Thread.sleep(5000);
		 //Horlicks_Mothers_Home_urls.watch_our_ads_Title(driver, element)
	 }
			
			 
				//verify watch_ads_title url	
			 @Test(enabled=true)
	 public void myths_facts_image() throws InterruptedException{
		 driver.get(prop.getProperty("URL_mothers-pregnancy-you"));
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0,1400)", "");
	   WebElement Myths_vs_Facts_Image =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Image")));
		 Thread.sleep(2000);
		 Myths_vs_Facts_image(driver, Myths_vs_Facts_Image); 
		 Thread.sleep(5000);
		// Horlicks_Mothers_Home_urls.Myths_vs_Facts_image(driver, element)
	 }
			 
			 @Test(enabled=true)
			 public void myths_facts_title() throws InterruptedException{
				 driver.get(prop.getProperty("URL_mothers-pregnancy-you"));
				 JavascriptExecutor jse = (JavascriptExecutor) driver;
			   jse.executeScript("window.scrollBy(0,1400)", "");
			   WebElement Myths_vs_Facts_titile =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Title")));
				 Thread.sleep(2000);
				 Myths_vs_Facts_Title(driver, Myths_vs_Facts_titile); 
				 Thread.sleep(5000);
				//Horlicks_Mothers_Home_urls.Myths_vs_Facts_Title(driver, element)
			 }
//
//		//intilization(ask_imge);
////						WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
////						WebElement ask_title =driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Title_Name")));
////						WebElement buyonline_image =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Image_Name")));
////						WebElement buyonline_title =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Nutritionist__Title_Name")));
////						WebElement Ads_Image =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Image_Name")));
////						WebElement Ads_title =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Nutritionist__Title_Name")));
////						WebElement Myths_vs_Facts_Image =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Image")));
////						WebElement Myths_vs_Facts_titile =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Title")));
////						WebElement Pregnancy_image =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Image")));
////						WebElement Pregnancy_title =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Title")));
////						WebElement Products_image =driver.findElement(By.xpath(prop.getProperty("Products_Image")));
////						WebElement Products_title =driver.findElement(By.xpath(prop.getProperty("Products_Title")));


	public static String ask_image(WebDriver driver, WebElement element) throws InterruptedException {
		
		
		Thread.sleep(2000);
		
		//builder=new Actions(driver);
		//Thread.sleep(2000);
		//builder.moveToElement(element).perform();
		//
		String data=element.getText();
		element.click();
		
		
		 String urls= driver.getCurrentUrl();
		 String finalurl=	 urls.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
		//System.out.println("Ask The Nutritionist image url"+" "+finalurl);
		
		
		Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 
		
		//reader.addSheet("Urls_data");
		//reader.addColumn("Urls_data", "Ask The Nutritionist Image_name");
		//reader.addColumn("Urls", "Title_name");
		reader.setCellData("Urls_data", "Ask The Nutritionist Image_name", 2, finalurl);
		//driver.close();
		//return data;
		return urls;
		
	}
	public static WebElement ask_title(WebDriver driver,WebElement element) throws InterruptedException {
		 
		
		Thread.sleep(2000);
		String data=element.toString();
		
		System.out.println(data);
		element.click();
	
	      
		 String urls1= driver.getCurrentUrl();
		 String finalurl1=	 urls1.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
		//System.out.println("Ask The Nutritionist Title url"+" "+finalurl1);
		
		Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 
		
		//reader.addSheet("Urls_data");
		//reader.addColumn("Urls_data", "Ask The Nutritionist Title_name");
		//reader.addColumn("Urls", "Title_name");
		reader.setCellData("Urls_data", "Ask The Nutritionist Title_name", 2, finalurl1);
		
		//driver.quit();
		return element;
	}
	
public static WebElement Buy_Online_image(WebDriver driver, WebElement element) throws InterruptedException {
		 

	Thread.sleep(2000);
	
	//jse.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'');", element);
	//jse.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

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
		reader.setCellData("Urls_data", "Buy Online Image", 2, finalurl1);
		
		//driver.quit();
		return element;
	}

public static WebElement Buy_Online_Title(WebDriver driver,WebElement element) throws InterruptedException {
	 
	
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
	reader.setCellData("Urls_data", "Buy Online Title_name", 2, finalurl1);
	
	//driver.quit();
	return element;
}

public static WebElement watch_our_ads_image(WebDriver driver,WebElement element) throws InterruptedException {
	 
	
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
	reader.setCellData("Urls_data", "Watch Our Ads Image", 2, finalurl1);
	
	//driver.quit();
	return element;
}

public static WebElement watch_our_ads_Title(WebDriver driver,WebElement element) throws InterruptedException {
 

Thread.sleep(2000);
element.click();

Thread.sleep(5000);
 String urls1= driver.getCurrentUrl();
 String finalurl1=	 urls1.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
//System.out.println("Ask The Nutritionist Title url"+" "+finalurl1);

Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 

//reader.addSheet("Urls_data");
//reader.addColumn("Urls_data", "Ask The Nutritionist Title_name");
//reader.addColumn("Urls", "Title_name");
reader.setCellData("Urls_data", "Watch Our Ads Title_name", 2, finalurl1);

//driver.quit();
return element;
}

public static WebElement Myths_vs_Facts_image(WebDriver driver,WebElement element) throws InterruptedException {
	 
	
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
	reader.setCellData("Urls_data", "Myths vs Facts_Image_name", 2, finalurl1);
	
	driver.quit();
	return element;
}

public static WebElement Myths_vs_Facts_Title(WebDriver driver,WebElement element) throws InterruptedException {
 

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
reader.setCellData("Urls_data", "Myths vs Facts_Title_name", 2, finalurl1);

driver.quit();
return element;
}


public static WebElement Pregnancy__You_image(WebDriver driver,WebElement element) throws InterruptedException {
	 
	
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
	reader.setCellData("Urls_data", "Pregnancy & You_Image_name", 2, finalurl1);
	
	driver.quit();
	return element;
}

public static WebElement Pregnancy__You_Title(WebDriver driver,WebElement element) throws InterruptedException {
 

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
reader.setCellData("Urls_data", "Pregnancy & You_Title_name", 2, finalurl1);

driver.quit();
return element;
}


public static WebElement Products_image(WebDriver driver,WebElement element) throws InterruptedException {
	 
	
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
	reader.setCellData("Urls_data", "Products Image_name", 2, finalurl1);
	
	driver.quit();
	return element;
}

public static WebElement Products_Title(WebDriver driver,WebElement element) throws InterruptedException {
 

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
reader.setCellData("Urls_data", "Products Title_name", 2, finalurl1);

driver.quit();
return element;
}

}

