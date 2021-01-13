import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWritingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");		
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		int sheet_count=wb.getNumberOfSheets();
		for(int i=0;i<sheet_count;i++){
			 String sheetnames=wb.getSheetName(i);
			 System.out.println(sheetnames);
			 if(sheetnames.equalsIgnoreCase("TestingWriting")){
				 wb.getSheet("WritingData"); 
			 }else{
				 wb.createSheet("TestingWriting");
				 break;
			 }
		}
	
		XSSFSheet sh=wb.createSheet("WritingData");
		
		sh.createRow(4).createCell(2).setCellValue("Hello");;
		
		
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		
		fo.close();
		wb.close();
		fi.close();
		System.out.println("Programm completed");
		
		

	}

}
