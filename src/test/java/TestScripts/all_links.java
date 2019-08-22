package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_links {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		
		
		 driver =new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 System.out.println("driver details" +driver);
		
		 driver.get("https://unilever:Dr2gaYUM6ch_sPAsw2vEPHaSwEmata3A@horlicks-in-agency-starterkit.unileversolutions.com/mothers.html");
		
		 Thread.sleep(2000);
		 
		//Get list of web-elements with tagName  - a
			List<WebElement> allLinks = driver.findElements(By.linkText("a href"));
			
			System.out.println("number of links "+allLinks.size());
			
			//Traversing through the list and printing its text along with link address
			for(WebElement link:allLinks){
				System.out.println(link.getText() + " - " + link.getAttribute("href"));
			}
		 
//		 JavascriptExecutor jse = (JavascriptExecutor) driver;
//	   jse.executeScript("window.scrollBy(0,1200)", "");

	}

}
