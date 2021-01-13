package seleniumprogramms;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ReusableSeleniumScript  {
	
	static WebDriver driver;
	
	
	public static void launchbrowser(String browsername) throws InterruptedException{
	if(browsername.equalsIgnoreCase("chrome")){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	}else if(browsername.equalsIgnoreCase("firefox")){
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void openurl(String url){
		driver.get(url);
	}
	
	public static void click(By locatorname){
		driver.findElement(locatorname).click();
		
		
		
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

}
