package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions extends ReusableSeleniumScript{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		launchbrowser("chrome");
		openurl("https://www.flipkart.com/");
		
		Thread.sleep(8000);
		mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
		
		driver.findElement(By.linkText("Mi")).click();
		Thread.sleep(3000);
		String text=driver.findElement(By.className("_10Ermr")).getText();
		System.out.println(text);
		driver.close();
		
		

	}

}
