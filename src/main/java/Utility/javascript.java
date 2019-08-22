package Utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://beta.docnu.com/");
		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.id("UserName")).sendKeys("8310181488");
		 Thread.sleep(2000);
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("qweasdzxc");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']")).click(); // clcik my referrals ubmneu 

	driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0_paginate\"]/ul/li[5]/a")).click();
	
	// fetch data from webtabe
	// Grab the table
	WebElement table= driver.findElement(By.xpath("//table[@id='DataTables_Table_0']"));
	
	// Now get all the TR elements from the table
	List<WebElement> allrows=table.findElements(By.tagName("tr"));
	
	for(WebElement row :allrows ) {
		
		System.out.println(row.getText());
		// And iterate over them, getting the cells
		List<WebElement> column=	table.findElements(By.tagName("td"));
		
		for(WebElement cell:column) {
			System.out.println(cell.getText());
		}
	}
	}

	public static void scroll(){
	
	JavascriptExecutor jse = ((JavascriptExecutor)driver);
	
	jse.executeScript("window.scrollBy(0,800");
	
	}

	
}
