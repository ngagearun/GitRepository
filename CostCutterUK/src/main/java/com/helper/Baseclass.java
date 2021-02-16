package com.helper;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;







import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;



public class Baseclass {
	public static WebDriver driver;
	
	public static Actions action;	
	
	public static String  browsername="chrome";
	
	@BeforeTest
	public static void launchbrowser() throws InterruptedException{
		if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.costcutter.co.uk/");
		
		
	}
	
	@AfterSuite()
	public void teardown(){
		driver.quit();
	}
	
	
	public static void sendText(By locatorname,String textvalue){
		driver.findElement(locatorname).clear();
		driver.findElement(locatorname).sendKeys(textvalue);
	}
	
	public static void click(WebElement ele){
		try{
		ele.click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	 public static void mouseHover(By locatorname){
		try{
		action=new Actions(driver);
		action.moveToElement(driver.findElement(locatorname)).perform();
		}catch(Exception e){
			
		}
		
		
	}
	
	public static void dropdown(By locatorname,String text){
		
		Select sel=new Select(driver.findElement(locatorname));
		sel.selectByVisibleText(text);
	}
	
	
	public static String readtext(By locatorname){
	
		String value=driver.findElement(locatorname).getText();
		return value;
	}
	
	public static void takeScreenShotofpage(String path) throws IOException{		
		
		TakesScreenshot tc=(TakesScreenshot) driver;
		File fi=tc.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(fi, new File(path));
		
	}
	
	public static boolean isDisplayed(WebElement ele){
		
		boolean status=false;
		try{
			status=ele.isDisplayed();
			return status;
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
		
	}
}
