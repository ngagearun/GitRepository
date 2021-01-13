package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Documentation")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String curl=driver.getCurrentUrl();
		driver.get(curl);
		Thread.sleep(3000);
		driver.navigate().to(curl);
		Thread.sleep(3000);
		driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
