package org.aip;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteStatus;


public class project{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lorha\\eclipse-workspace\\iphoneSerach\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		driver.manage().window().maximize();
		
		
	
		
	WebElement cli = driver.findElement(By.xpath("//p[text()='Shop All']"));
		Actions a = new Actions(driver);
		
		 a.moveToElement(cli).perform();
   cli.click();
 
   Thread.sleep(3000);
    
    WebElement shopall = driver.findElement(By.xpath("(//div[@class='sui-flex-auto sui-my-1 sui-block'])[2]"));
  
    shopall.click();
    Thread.sleep(3000);
    
        
       WebElement clicks = driver.findElement(By.xpath("(//div[@class='sui-flex-auto sui-my-1 sui-block'])[11]"));
      
    
      clicks.click();
      
      Thread.sleep(3000);
      
      WebElement air = driver.findElement(By.xpath("(//div[@class='sui-flex-auto sui-my-1 sui-block'])[3]"));
    
      air.click();
      
      Thread.sleep(3000);
      
      
      WebElement pdair =  driver.findElement(By.xpath("(//div[@class='sui-flex-auto sui-my-1 sui-block'])[5]"));
      pdair.click();
	
		
		
		
		
		
		
		
	}

}
