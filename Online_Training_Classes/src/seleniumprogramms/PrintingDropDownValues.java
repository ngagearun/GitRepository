package seleniumprogramms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintingDropDownValues extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");		
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.createSheet("PrintingValues");
		
		
		launchbrowser("chrome");
		openurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		
		List<WebElement> sponsorname=driver.findElements(By.xpath("//*[@id='c0']/option"));
		
		for(int i=0;i<sponsorname.size();i++){
			
			sh.createRow(i).createCell(2).setCellValue(sponsorname.get(i).getText());
		}
		
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		
		fo.close();
		wb.close();
		fi.close();
		driver.close();

	}

}
