package seleniumprogramms;

import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindowHandling  extends ReusableSeleniumScript{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		launchbrowser("chrome");
		openurl("https://candidate.psiexams.com/");
		String parent_window =driver.getWindowHandle();
		click(By.linkText("PSI Bookstore"));
		Set<String> childwindows =driver.getWindowHandles();
		
		for(String windownames:childwindows){
			System.out.println(windownames);
			
			if(!windownames.equals(parent_window)){
				driver.switchTo().window(windownames);
				driver.findElement(By.id("search_queryispbxi_")).sendKeys("ARUNKUMAR");
			}		
			
		}
	
		
		driver.close();
		driver.switchTo().window(parent_window);
		click(By.linkText("Create"));
		driver.quit();
	}

}
