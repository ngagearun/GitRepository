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

public class WebTableDemo extends ReusableSeleniumScript{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		launchbrowser("chrome");
		openurl("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement table_body=driver.findElement(By.xpath("//*[@id='post-body-5867683659713562481']/div/div[1]/table/tbody"));
		System.out.println(table_body);
	    List<WebElement> table_row=table_body.findElements(By.tagName("tr"));
	    File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx"); // Create an object of File class to open xlsx file
	    FileInputStream fi=new FileInputStream(f); //Create an object of FileInputStream class to read excel file // or enter excel file path instead of (f)
	    XSSFWorkbook wb=new XSSFWorkbook(fi); // creating object for workbook
	    XSSFSheet sh=wb.getSheet("Sheet2"); // reading sheet
	    for(int row=0;row<table_row.size();row++){
	    	
	    	List<WebElement> table_cols=table_row.get(row).findElements(By.tagName("td"));
	    	
	    	  for(int col=0;col<table_cols.size()-1;col++){
	    		  
	    		  if(sh.getRow(row)!=null) {
	    			  sh.getRow(row).createCell(col).setCellValue(table_cols.get(col).getText());

	    			  }
	    			  else {
	    			  sh.createRow(row).createCell(col).setCellValue(table_cols.get(col).getText());
	    			  }
	    		
	    	  }
	    	
	    }
	    
	    FileOutputStream fos=new FileOutputStream(f);
	    wb.write(fos);

	    fos.close();
	    wb.close();
	    fi.close();
		driver.close();
		
		
	}

}
