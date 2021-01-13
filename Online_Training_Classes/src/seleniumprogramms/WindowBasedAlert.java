package seleniumprogramms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\NareshUploadFile.exe");
		Thread.sleep(4000);
		driver.close();
		
	}

}
