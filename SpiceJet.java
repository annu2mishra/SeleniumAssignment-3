package com.ibm.SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.internal.joptsimple.internal.Rows;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.manage().window().maximize();
       //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       
       driver.get("http://www.spicejet.com");// It will open the browser 
       
       WebElement roundTripEle = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
       roundTripEle.click();// Performed click operation on round trip
       
      
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//a[@value='MAA']")).click();//  selected the source 
       
       driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();//  seleted the destination 
       driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
       
       driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[2]/td[4]")).click();// selected the start date 
       driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[2]/td[6]")).click();// selected the returned date
       driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
       
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
       driver.findElement(By.xpath("//input[@value='Done']")).click();
       driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
       driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']/option[4]")).click();
       driver.findElement(By.xpath("//input[@type='submit']")).click();  
           
       
       
     
    	    	  	   
    	   
       }
       
       }

 				
		
	


