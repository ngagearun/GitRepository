import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");		
		
		
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(f));
		XSSFSheet sh=wb.getSheet("Sheet");
		System.out.println(sh.getRow(3).getCell(2).getStringCellValue());
		
		

	}

}
