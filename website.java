package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;




public class website {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1623261\\Downloads\\chromedriver\\chromedriver.exe");
	WebDriver wd=new ChromeDriver(options);
	wd.get("https://www.irctc.co.in/");
	wd.manage().window().maximize();
	//wd.findElement(By.id("loginText")).sendKeys("apple");
	//Select s=new Select();
	//pause(5);
	//Thread.sleep(1500);
	//WebElement link = wd.findElement(By.xpath("//*[@id=\'loginText\']"));
	//link.click();
	//Alert a=wd.switchTo().alert();
	//a.dismiss();
	
	//wd.findElement(By.id("loginText")).click();
	//Thread.sleep(2000);
	
	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	wd.findElement(By.xpath("//*[@id=\'origin\']/span/input")).sendKeys("MAS");
	//Thread.sleep(2000);
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	List<WebElement> option1= wd.findElements(By.cssSelector("#origin > span > div > ul > li:nth-child(1)"));
	option1.get(0).click();
	
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Select selectBox1 = new Select(wd.findElement(By.cssSelector("#origin > span > input")));
	//Thread.sleep(1000);
	//selectBox1.selectByIndex(0);
		
	wd.findElement(By.xpath("//*[@id=\'destination\']/span/input")).sendKeys("bza");
	Thread.sleep(1000);
	
	//Select selectBox2 = new Select(wd.findElement(By.cssSelector("#destination > span > input")));
//	Thread.sleep(1000);
	//selectBox2.selectByIndex(0);
	
	
	List<WebElement> option2= wd.findElements(By.cssSelector("#destination > span > div > ul > li"));
	option2.get(0).click();
	
	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	wd.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/button")).click();
	
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	wd.findElement(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr[4]/td[7]")).click();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	wd.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")).click();
	wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//wd.quit();
	
	//String bodyText = wd.findElement(By.xpath("//*[@id=\"trainlist1\"]/div/div/div[3]/div[1]")).getText();
	//Assert.assertTrue("Text not found!", bodyText.contains("trains found"));
	
	//System.out.println(wd.getPageSource().contains("Refine Results"));
	
	boolean status = wd.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[1]/img")).isDisplayed();
	if(status)
	{
		System.out.println("PASS");
		wd.quit();
	}
	else
	{
		System.out.println("Fail");
	}
	
	}
}
