package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo extends ReusableSeleniumScript {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		launchbrowser("chrome");
		openurl("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		
		
		
//		driver.switchTo().frame(0);
//		driver.switchTo().alert().accept();
		
		
		WebElement draggable=driver.findElement(By.xpath("//*[@id='todrag']/span[1]"));
		WebElement droppable=driver.findElement(By.xpath("//*[@id='mydropzone']"));
		Actions action=new Actions(driver);
		
		//action.clickAndHold(draggable).moveToElement(droppable).build().perform();
		action.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();

		Thread.sleep(50000);
		driver.close();
		
		

	}

}
