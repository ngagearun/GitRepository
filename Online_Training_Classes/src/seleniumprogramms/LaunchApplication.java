package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class LaunchApplication {

	public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("homeval")).sendKeys("4566770");
		driver.findElement(By.name("cal")).click();
		driver.close();
	}

}
