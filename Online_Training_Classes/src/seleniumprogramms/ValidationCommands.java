package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/?FORM=Z9FD1");
		Thread.sleep(3000);
		boolean status;
		status=driver.findElement(By.id("bLogo")).isDisplayed();
		if(status==true){
			System.out.println("Element present");
		}else{
			System.out.println("Element not present");
		}

		 status=driver.findElement(By.id("")).isEnabled();
		driver.close();
	}

}
