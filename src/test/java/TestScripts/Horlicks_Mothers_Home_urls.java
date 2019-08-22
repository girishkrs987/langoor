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

import Utility.Xls_Reader;


public class Horlicks_Mothers_Home_urls {
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
	
	// Create action class object
	public static Actions builder; 
	
	public static Utility.Xls_Reader reader;
	public static String prop_path="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\config\\url.properties";
	
	public static String path ="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\src\\main\\java\\TestData\\Data.xlsx";
	
	public static String xldata="C:\\Users\\Girish\\eclipse-workspace\\Horlicks\\src\\test\\java\\TestData\\automation_Data.xlsx";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		Properties prop =new Properties();
		 
		 FileInputStream ip=new FileInputStream(prop_path);
		 
		 prop.load(ip);
		 
		 
		 
		// drive urls data from xl sheet 
		 
		 
		// WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
		//WebElement ask_title =driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Title_Name")));	
						
		intilization();
	 Xls_Reader obj= new Xls_Reader(xldata); 
//			
		 System.out.println(obj.path);
			
			int count= 	obj.getRowCount("Urls_data");

			//System.out.println("number of rows"+count);
			

			for (int i=2; i<= count; i++) {
				
				System.out.println(obj.getCellData("Urls_data", "URLs", i));
				
				String url=obj.getCellData("Urls_data", "URLs", i);
				
				
				
				driver.get(url);
				
				
				 Thread.sleep(2000);
				 
				 JavascriptExecutor jse = (JavascriptExecutor) driver;
			   jse.executeScript("window.scrollBy(0,1800)", "");
			 
			   
			  // Horlicks_Mothers_Home_urls.ask_image(driver, ask_imge);
			   
			   	WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
				WebElement ask_title =driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Title_Name")));
				WebElement buyonline_image =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Image_Name")));
				WebElement buyonline_title =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Nutritionist__Title_Name")));
				WebElement Ads_Image =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Image_Name")));
				WebElement Ads_title =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Nutritionist__Title_Name")));
				
				//try {
				WebElement Myths_vs_Facts_Image =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Image")));
				//Myths_vs_Facts_Image.isDisplayed();
				
				
				WebElement Myths_vs_Facts_titile =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Title")));
				
			
				
				try {
				WebElement Pregnancy_image =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Image")));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				try {
				WebElement Pregnancy_title =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Title")));
				}
				
				catch (Exception e) {
					e.printStackTrace();
				}
				try {
				WebElement Products_image =driver.findElement(By.xpath(prop.getProperty("Products_Image")));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				try {
				WebElement Products_title =driver.findElement(By.xpath(prop.getProperty("Products_Title")));
				break;
				}
				catch (Exception e) {
					e.printStackTrace();
				}
		
				if (ask_imge.isDisplayed() ) {
				
				
					Horlicks_Mothers_Home_urls.ask_image(driver, ask_imge);
					break;
				}
					else if (ask_title.isDisplayed()) {
						
						Horlicks_Mothers_Home_urls.ask_title(driver, ask_title);
						break;
					}
					
					else if(buyonline_image.isDisplayed()) {
						
						 Horlicks_Mothers_Home_urls.Buy_Online_image(driver, buyonline_image);
						 break;
					}
					
					else if (buyonline_title.isDisplayed()) {
						 Horlicks_Mothers_Home_urls.Buy_Online_Title(driver,buyonline_title);
						 break;
											}
					else if (Ads_Image.isDisplayed()) {
						Horlicks_Mothers_Home_urls.watch_our_ads_image(driver, Ads_Image);
						break;
					}
						else if (Ads_title.isDisplayed()){
							Horlicks_Mothers_Home_urls.watch_our_ads_Title(driver, Ads_title);
							break;
						}
						else if (Myths_vs_Facts_Image.isDisplayed()){
							Horlicks_Mothers_Home_urls.Myths_vs_Facts_image(driver, Myths_vs_Facts_Image);
							break;
						}
				
						else if (Myths_vs_Facts_titile.isDisplayed()) {
							Horlicks_Mothers_Home_urls.Myths_vs_Facts_image(driver, Myths_vs_Facts_Image);
							break;
														
						}
				
				
					}
				
			  
				
			  
			  
			 
			 
			  
			  
			  
//			  try {
//			  Horlicks_Mothers_Home_urls.Myths_vs_Facts_image(driver,Myths_vs_Facts_Image);
//			  
//			  }
//			  
//			  catch(Exception e ) {
//					e.printStackTrace();
//					
//				}
//			  Horlicks_Mothers_Home_urls.Myths_vs_Facts_Title(driver, Myths_vs_Facts_titile);
//			  Horlicks_Mothers_Home_urls.Pregnancy__You_image(driver, Pregnancy_image);
//			  Horlicks_Mothers_Home_urls.Pregnancy__You_Title(driver, Pregnancy_title);
//			  Horlicks_Mothers_Home_urls.Products_image(driver, Products_image);
//			  Horlicks_Mothers_Home_urls.Products_Title(driver, Products_title);
			 // System.out.println(ele);
			//String var=  ele.toString();
			  
			  
//			   switch(ele) {
//			   
//			   //case ele=:
//			   Horlicks_Mothers_Home_urls.ask_image(driver, ask_imge);
//			   }
			   
//			   if(ask_imge.equals(ele)) {
//				   
//				   Horlicks_Mothers_Home_urls.ask_image(driver, ask_imge);
//				   
//			   }
//			   else if (Horlicks_Mothers_Home_urls.Ads_Image.isDisplayed()) {
//				   
//				   
//			   }
			   
			}

		//intilization(ask_imge);
//						WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
//						WebElement ask_title =driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Title_Name")));
//						WebElement buyonline_image =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Image_Name")));
//						WebElement buyonline_title =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Nutritionist__Title_Name")));
//						WebElement Ads_Image =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Image_Name")));
//						WebElement Ads_title =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Nutritionist__Title_Name")));
//						WebElement Myths_vs_Facts_Image =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Image")));
//						WebElement Myths_vs_Facts_titile =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Title")));
//						WebElement Pregnancy_image =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Image")));
//						WebElement Pregnancy_title =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Title")));
//						WebElement Products_image =driver.findElement(By.xpath(prop.getProperty("Products_Image")));
//						WebElement Products_title =driver.findElement(By.xpath(prop.getProperty("Products_Title")));
//						
//						if(ask_imge.isDisplayed()) {
//							
//							Horlicks_Mothers_Home_urls.ask_image(driver,ask_imge);
//						}
//							else if(ask_title.isDisplayed()) {
//								
//								ask_title(driver,ask_title);
//							}
//						
//							else if (buyonline_image.isDisplayed()) {
//								
//								Buy_Online_image(driver, buyonline_image);
//							}
//							else if (buyonline_title.isDisplayed()) {
//								
//								Buy_Online_Title(driver, buyonline_title);
//							}
					
					
					
					
	// intilization();
//
       // WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
       // Horlicks_Mothers_Home_urls.ask_image(driver,ask_imge);
        //Thread.sleep(2000);
////       
//         intilization();
//         WebElement ask_title =driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Title_Name")));
//         ask_title(driver,ask_title);
//         
//         
//         intilization();
//         WebElement buyonline_image =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Image_Name")));
//         Buy_Online_image(driver,buyonline_image);
////
////         
//         intilization();
//         WebElement buyonline_title =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Nutritionist__Title_Name")));
//         Buy_Online_Title(driver,buyonline_title);
////         
//         intilization();
//         WebElement Ads_Image =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Image_Name")));
//         watch_our_ads_image(driver,Ads_Image);
//         
//         intilization();
//         WebElement Ads_title =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Nutritionist__Title_Name")));
//         watch_our_ads_Title(driver,Ads_title);
         
	
	
	
	
	public static void  intilization( ) throws InterruptedException, IOException {

		Properties prop =new Properties();
		 
		 FileInputStream ip=new FileInputStream(prop_path);
		 
		 prop.load(ip);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
	
	
	 driver =new ChromeDriver(); 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 
		
		
		
	}
	
	// System.out.println("driver details" +driver);
	
	// driver.get("https://unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@horlicks-in-agency-starterkit.unileversolutions.com/mothers.html");
	
//	 Xls_Reader obj= new Xls_Reader(xldata); 
//		
//	 //System.out.println(obj.path);
//		
//		int count= 	obj.getRowCount("Urls_data");
//
//		//System.out.println("number of rows"+count);
//		
//
//		for (int i=2; i<= count; i++) {
//			
//			System.out.println(obj.getCellData("Urls_data", "URLs", i));
//			
//			String url=obj.getCellData("Urls_data", "URLs", i);
//			
//			driver.get(url);
//			 Thread.sleep(2000);
//			 
//			 JavascriptExecutor jse = (JavascriptExecutor) driver;
//		   jse.executeScript("window.scrollBy(0,1800)", "");
//		   
//		   
		   // WebElement ask_imge = driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Image_Name")));
			//WebElement ask_title =driver.findElement(By.xpath(prop.getProperty("Ask_The_Nutritionist__Title_Name")));
			//WebElement buyonline_image =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Image_Name")));
			//WebElement buyonline_title =driver.findElement(By.xpath(prop.getProperty("Buy_Online__Nutritionist__Title_Name")));
			//WebElement Ads_Image =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Image_Name")));
			//WebElement Ads_title =driver.findElement(By.xpath(prop.getProperty("Watch_Our_Ad__Nutritionist__Title_Name")));
//			WebElement Myths_vs_Facts_Image =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Image")));
//			WebElement Myths_vs_Facts_titile =driver.findElement(By.xpath(prop.getProperty("Myths_vs_Facts_Title")));
//			WebElement Pregnancy_image =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Image")));
//			WebElement Pregnancy_title =driver.findElement(By.xpath(prop.getProperty("Pregnancy_&_You_Title")));
//			WebElement Products_image =driver.findElement(By.xpath(prop.getProperty("Products_Image")));
//			WebElement Products_title =driver.findElement(By.xpath(prop.getProperty("Products_Title")));
			
		
		
		
	 
	 
   
   
   
   
   
	
	

	public static WebElement ask_image(WebDriver dWebDriverriver, WebElement element) throws InterruptedException {
		
		
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
		driver.close();
		//return data;
		return element;
		
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
		
		driver.quit();
		return element;
	}
	
public static WebElement Buy_Online_image(WebDriver driver,WebElement element) throws InterruptedException {
		 
		
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
		reader.setCellData("Urls_data", "Buy Online Image", 2, urls1);
		
		driver.quit();
		return element;
	}

public static WebElement Buy_Online_Title(WebDriver driver,WebElement element) throws InterruptedException {
	 
	
	Thread.sleep(2000);
	element.click();

	Thread.sleep(2000);
	 String urls1= driver.getCurrentUrl();
	// String finalurl1=	 urls1.replace("unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@", "");
	//System.out.println("Ask The Nutritionist Title url"+" "+finalurl1);
	
	Utility.Xls_Reader reader=new Utility.Xls_Reader(xldata); 
	
	//reader.addSheet("Urls_data");
	//reader.addColumn("Urls_data", "Ask The Nutritionist Title_name");
	//reader.addColumn("Urls", "Title_name");
	reader.setCellData("Urls_data", "Buy Online Title_name", 2, urls1);
	
	driver.quit();
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
	
	driver.quit();
	return element;
}

public static WebElement watch_our_ads_Title(WebDriver driver,WebElement element) throws InterruptedException {
 

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
reader.setCellData("Urls_data", "Watch Our Ads Title_name", 2, finalurl1);

driver.quit();
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

