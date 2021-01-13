package seleniumprogramms;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommands extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		launchbrowser("chrome");
		openurl("http://only-testing-blog.blogspot.com/2014/06/alert_6.html");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
         driver.close();
	}

}
