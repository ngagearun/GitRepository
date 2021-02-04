package com.psiexams.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.psiexams.objectrepositories.TestObjectRepositories;
import com.psiexams.reusableseleniumscripts.ReusableTestNGSelenium;
import com.psiexams.utilities.Property;

public class CreateAnAccount extends ReusableTestNGSelenium {


	@BeforeMethod(groups={"regression","sanity","smoke"})
	public void clickoncreateaccountlink(){
		click(TestObjectRepositories.create_link,"clicking on create link");
		//database connection
	}
	
	@Test(priority=0,groups="regression")
	public void validate_email_format() throws InterruptedException {
		
	sendText(By.name("emailid"), "new", "Entering the create account email id" );
	//send_keys(By.name("emailid"), Keys.TAB );
	driver.findElement(By.name("emailid")).sendKeys(Keys.TAB);
	String actualtext=getText(By.className("errorInline"));
	Assert.assertEquals(actualtext, "Please provide valid email address.");
	// Assert is an inbuilt class in TestNG which compares the actual text with expected text
	}

  
	@Test(priority=1,groups="sanity")
	public void verify_alert_message_password_blank() throws InterruptedException {
	sendText(By.name("emailid"), "test@gmail.com", "Entering the create account email id");
	sendText(By.name("firstname"), "Mallika", "Entering the firstname");
	sendText(By.name("lastname"), "test", "Entering the lastname");
	click(By.name("Submit"), "clicking on submit button");
	String actualtext=read_alert_message();
	Assert.assertEquals(actualtext, "Password field cannot be left blank");
	Thread.sleep(3000);
	}

	@Test(priority=2,groups={"regression","sanity"})
	public void verify_alert_password_mismatch() throws InterruptedException {
	sendText(By.name("password"), "Pswd@1234", "Entering the password");
	sendText(By.name("confirmpassword"), "Pswd@125", "Retyping the password");
	click(By.name("Submit"), "clicking on submit button");
	String actualtext=read_alert_message();
	Assert.assertEquals(actualtext, "The Password and Re-entered Password do not match");
	Thread.sleep(3000);
	}

	@Test(priority=3,groups="sanity")
	public void verify_alert_to_select_securityquestion() throws InterruptedException {
	sendText(By.name("emailid"), "test@gmail.com", "Entering the create account email id");
	sendText(By.name("firstname"), "Mallika", "Entering the firstname");
	sendText(By.name("lastname"), "test", "Entering the lastname");
	sendText(By.name("confirmpassword"), "Pswd@1234", "Retyping the password");
	click(By.name("Submit"), "clicking on submit button");
	String actualtext=read_alert_message();
	Assert.assertEquals(actualtext, "Select a security question");
	}

	@Test(priority=4,groups="sanity")
	public void validate_email_already_exists() throws InterruptedException {
		sendText(By.name("emailid"), "test@gmail.com", "Entering the create account email id");
		sendText(By.name("firstname"), "Mallika", "Entering the firstname");
		sendText(By.name("lastname"), "test", "Entering the lastname");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendText(By.name("hintanswer"), "India", "Entering security answer");
	click(By.name("Submit"), "clicking on submit button");
	String Errors=getText(By.xpath("//*[@id=\'instruction\']/table/tbody/tr/td/ul/li"));
	System.out.println(Errors);
	Assert.assertEquals(Errors, "Email already exists. Please enter another Email ID");
	}
	
	
	@Test(priority=5,groups="sanity",dataProvider="accountcreation")
	public void create_email_id(String emailid,String fname,String lname,String password,String retypepassword) throws InterruptedException {
		Random r=new Random();
		int num=r.nextInt(500);
		sendText(By.name("emailid"), emailid, "Entering the create account email id");
		sendText(By.name("firstname"), fname, "Entering the firstname");
		sendText(By.name("lastname"), lname, "Entering the lastname");
		sendText(By.name("password"), password, "Entering the password");
		sendText(By.name("confirmpassword"), retypepassword, "Retyping the password");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendText(By.name("hintanswer"), "India", "Entering security answer");
	     click(By.name("Submit"), "clicking on submit button");
	     click(By.linkText("Logout"),"clicking on logut link");
	
	}
	
	
	@DataProvider(name="accountcreation")
	public String[][] readdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		String [][] str=readingdatafromexcel("C:\\Users\\Lenovo\\Desktop\\test.xlsx","read");
		return str;		
	}	
	
	public  String[][] readingdatafromexcel(String excelpath, String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		String excelData[][] = null;
		FileInputStream fi=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet s=wb.getSheet(sheetname);
		
	
		int tot_rows=s.getLastRowNum();
		int tot_cols=s.getRow(0).getLastCellNum();
		excelData=new String[tot_rows-1][tot_cols];
		for(int i=1;i<tot_rows;i++){
			
			for(int j=0;j<tot_cols;j++){
			
				excelData[i-1][j] =s.getRow(i).getCell(j).getStringCellValue();
			}			
		}
		
		return excelData;
	}
	
	@AfterClass(groups={"regression","sanity"})
	public void execution_status(){
	//close database connection
		System.out.println("Create An Account testcases executed successfuly");
	}

	
	
	
	
	
}
