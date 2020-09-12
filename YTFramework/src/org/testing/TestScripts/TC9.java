package org.testing.TestScripts;
import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC9 extends Base  {
	
	
	@Test
	public void LoginPlayVideoComment() throws InterruptedException
	{		
			WebElement signin =driver.findElement(By.xpath("//yt-formatted-string[text() ='Sign in']"));
			signin.click();			
			Thread.sleep(2000);		
			WebElement username = driver.findElement(By.xpath("//input[@autocomplete='username']"));		
			Thread.sleep(2000);		
			username.sendKeys("deepautomationtesting@gmail.com");		
			WebElement nxtbtn = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
			nxtbtn.click();		
			Thread.sleep(5000);		
			WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
			passwd.sendKeys("Deep@123");		
			WebElement nextbn1 = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb'][1]"));
			nextbn1.click();
			Thread.sleep(5000);				
			List<WebElement> li = driver.findElements(By.xpath("//yt-formatted-string[@id='video-title']"));
			li.get(0).click();
			Thread.sleep(5000);
		
			System.out.println("Video Played");	
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			System.out.println("Window Scrolled");
			
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='contenteditable-root]")));
			WebElement comment = driver.findElement(By.xpath("//div[@id='contenteditable-root']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(comment).click().sendKeys("Interesting").build().perform();
			//comment.click();
			//Thread.sleep(2000);
			
			//comment.sendKeys("Interesting");
			
			WebElement cmtbtn = driver.findElement(By.xpath("//paper-button[@aria-label='Comment']"));
			
			cmtbtn.click();
			
			
			
			Thread.sleep(5000);
		    
		    WebElement profile = driver.findElement(By.xpath("//img[@alt='Avatar image']"));
		    profile.click();
		    
		    Thread.sleep(5000);
		    
		    WebElement signoutbtn = driver.findElement(By.xpath("//yt-formatted-string[text() ='Sign out']"));
		    
		    signoutbtn.click();
	}	
	
	
	
	

}
