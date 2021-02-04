package com.psiexams.reusableseleniumscripts;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.psiexams.utilities.Property;



public class ReusableTestNGSelenium {

	
public static WebDriver driver;
Property prop;

@Parameters({"browser","appurl"})
@BeforeTest(groups={"regression","sanity","smoke"})
public void launchapp(String browsername,String appurl) throws InterruptedException{
	
	//prop=new Property(System.getProperty("user.dir")+"\\configuration.properties");
//	launchbrowser(prop.getProperty("browsername"));
//	openurl(prop.getProperty("appurl"));
	
	launchbrowser(browsername);
	openurl(appurl);
}




@AfterTest(groups={"regression","sanity","smoke"})
public void closeapp(){
	driver.quit();
}
	
	
	public static void launchbrowser(String browsername) throws InterruptedException{
		
	if(browsername.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	}else if(browsername.equalsIgnoreCase("firefox")){
	    WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void openurl(String url){
		driver.get(url);
	}
	
	public static void click(By locatorname,String stepname){
		try{
		driver.findElement(locatorname).click();
		Reporter.log(stepname);
		}catch(Exception e){
			e.printStackTrace();
			Reporter.log(stepname);
		}
		
		
		
	}
	static Actions action;
	public static void mouseHover(By locatorname){
		WebElement ele=driver.findElement(locatorname);
	action=new Actions(driver);
		action.moveToElement(ele).perform();
	}
	
	public static void draganddrop(By locatorname){
		
	 action=new Actions(driver);
		
	}
	
	public static void sendText(By locatorname,String text,String stepname){
		try{
			driver.findElement(locatorname).clear();
			driver.findElement(locatorname).sendKeys(text);
			Reporter.log(stepname+ text);
		}catch(Exception e){
			e.printStackTrace();
			Reporter.log(stepname+text);
		}
	}
	
	public static String getText(By locatorname){
		String text=null;
		try{
		text=driver.findElement(locatorname).getText();
		}catch(Exception e){
			e.printStackTrace();
		}
		return text;
	}
	
	public static String read_alert_message(){
		String alertmessage = null;
		try{
			alertmessage=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
		}catch(Exception e){
			e.printStackTrace();
		}
		return alertmessage;
	}
	
	public static void dropdown(By Locatorname,String  text){
		
		try{
			//Select dropdown = new Select(driver.findElement(By.name("hintquestion")));
			Select objname=new Select(driver.findElement(Locatorname));
			objname.selectByVisibleText(text);
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	 public static List<String> printingdropdownvalues(By locatorname){
			List<WebElement> ele= driver.findElements(locatorname);
			List<String> list=new ArrayList<String>();
			for(int i=0;i<ele.size();i++){
				   list.add(ele.get(i).getText());
			}		
			return list;
		  }
	 
	 public void switchtowindow(){
		 String parent_window =driver.getWindowHandle();
			
			Set<String> childwindows =driver.getWindowHandles();
			
			for(String windownames:childwindows){
				System.out.println(windownames);
				
				if(!windownames.equals(parent_window)){
					driver.switchTo().window(windownames);
					dropdown(By.id("country"),"Canada");
					dropdown(By.id("testcenterstate"),"British Columbia - BC");
					click(By.name("Submit"),"close button");
					
				}		
				
			}	
			
			//driver.close();
			driver.switchTo().window(parent_window);
	 }

}
