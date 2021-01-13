package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollBarActions extends ReusableSeleniumScript{

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser("chrome");
		openurl("http://automationpractice.com/index.php?id_category=9&controller=category");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement checkbox=driver.findElement(By.xpath("//*[@id='layered_condition_new']"));
         js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
         js.executeScript("arguments[0].style.border='3px dotted blue'", checkbox);
         Thread.sleep(8000);
         checkbox.click();
         Thread.sleep(10000);
         driver.close();
         

		
	}

}
