/*package com.psiexams.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	String excelFilePath;
	Workbook workbook;
	String gsheet;

	public ExcelReader() {

	}

	public ExcelReader(String excelFilePath) throws InvalidFormatException,
			FileNotFoundException, IOException {
		this.excelFilePath = excelFilePath;

		workbook = WorkbookFactory.create(new FileInputStream(excelFilePath));

	}

	public int getRowCount(String sheetName) {

		int rowCount = 0;
		try {
			gsheet = sheetName;
			rowCount = workbook.getSheet(sheetName).getLastRowNum() + 1;

		} catch (Exception e) {
			e.printStackTrace();

		}

		return rowCount;

	}

	public String getCellData(String sheetName, int rowNumber, int columnNumber) {

		String cellValue = "";
		try {

			if (workbook.getSheet(sheetName).getRow(rowNumber)
					.getCell(columnNumber).getCellType() == workbook
					.getSheet(sheetName).getRow(rowNumber)
					.getCell(columnNumber).) {

				cellValue = workbook.getSheet(sheetName).getRow(rowNumber)
						.getCell(columnNumber).getStringCellValue().trim();
			} else {

				cellValue = String.valueOf(
						(int) (workbook.getSheet(sheetName).getRow(rowNumber)
								.getCell(columnNumber).getNumericCellValue()))
						.trim();
			}
		} catch (Exception e) {

			return cellValue;
		}

		return cellValue;
	}

	public void setCellValue(String sheetName, int rowNumber, int columnNumber,
			String value) {

		try {
			Sheet s=workbook.getSheet(sheetName);
					s.createRow(rowNumber).createCell(columnNumber).setCellValue(value);
			OutputStream outputStream = new FileOutputStream(excelFilePath);
			workbook.write(outputStream);

			outputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
*/