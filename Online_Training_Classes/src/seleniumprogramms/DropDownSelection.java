package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection extends ReusableSeleniumScript{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		launchbrowser("chrome");
		driver.get("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		Thread.sleep(3000);
		
		Select sponsorname=new Select(driver.findElement(By.id("c0")));
		sponsorname.selectByIndex(4);
		Thread.sleep(3000);
		sponsorname.selectByValue("372^-99");
		Thread.sleep(3000);
		sponsorname.selectByVisibleText("ATI TEAS");
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
