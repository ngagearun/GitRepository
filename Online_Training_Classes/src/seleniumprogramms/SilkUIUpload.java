package seleniumprogramms;



import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SilkUIUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(3000);
		Screen sc=new Screen();
		
		Pattern filepath=new Pattern("C:\\Users\\Lenovo\\Desktop\\filepath.PNG");
		Pattern openbutton=new Pattern("C:\\Users\\Lenovo\\Desktop\\openbutton.PNG");
		
		sc.type(filepath, "C:\\Users\\Lenovo\\Documents\\NareshClasses\\configuration.properties");
		Thread.sleep(4000);
		sc.click(openbutton);
		Thread.sleep(4000);
		
		Scanner sc1=new Scanner(System.in);
		driver.close();
	}

}
