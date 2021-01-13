package seleniumprogramms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableCount extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		launchbrowser("chrome");
		openurl("http://demo.automationtesting.in/WebTable.html");
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		List<WebElement> table_body=driver.findElements(By.xpath("//*[@role='grid']/div[2]/div/div"));
		System.out.println(table_body.size());
		driver.close();

	}

}
