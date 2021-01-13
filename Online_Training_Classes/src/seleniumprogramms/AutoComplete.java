package seleniumprogramms;

import java.io.IOException;
import java.util.List;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.property.ReadingDataFromPropertyFile;

public class AutoComplete extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		launchbrowser(ReadingDataFromPropertyFile.readingdata("browsername"));
		openurl("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("a");
		
		List<WebElement> tags=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		for(int i=0;i<tags.size();i++){
			
			String values=tags.get(i).getText();
			if(values.equalsIgnoreCase("BASIC")){
				tags.get(i).click();
				break;
			}
		}
		driver.close();

	}

}
