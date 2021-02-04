package com.psiexams.businessscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.psiexams.reusableseleniumscripts.ReusableTestNGSelenium;

public class Registration extends ReusableTestNGSelenium {
	
	@BeforeClass(groups={"regression","sanity"})
	public void clickonregisterlink(){
		click(By.linkText("Register"),"Clicking on Registration link");
	}
	
	@Test(priority=6,groups="sanity")
	public void printorganisationvalues(){	
		List<String> str=printingdropdownvalues(By.xpath("//*[@id='c0']/option"));
		Assert.assertTrue(str.contains("FDNY"));
	}
	
	@Test(priority=7,groups="regression")
	public void verifytestcenterpopupscreens() throws InterruptedException{
		dropdown(By.id("c0"), "Certification/Professional Associations");
		Thread.sleep(2000);
		dropdown(By.id("c1"),"American Board of Pain Medicine (ABPM)");
		click(By.linkText("American Board of Pain Medicine Certification Part 2"),"");
		click(By.linkText("Test Centers"),"");
		switchtowindow();
		
	//	driver.switchTo().window("PSI Online - One stop Solution for Test Takers");
		
	}
	@Test(priority=8,groups="sanity")	
	public void registerforexam() throws InterruptedException{
		click(By.name("Submit3"),"");
		sendText(By.name("emailid"), "ramesh122@gmail.com","");
		sendText(By.name("password"), "123456789Aa!","");
		click(By.name("loginbtn"),"");
		click(By.linkText("Find test date"),"");
		dropdown(By.id("c0"), "Certification/Professional Associations");
		Thread.sleep(2000);
		dropdown(By.id("c1"),"American Board of Pain Medicine (ABPM)");
		Thread.sleep(2000);
		click(By.xpath("//*[@id='radio1']"),"");
		Thread.sleep(3000);
		click(By.id("Continue"),"");
		Thread.sleep(3000);
		sendText(By.name("autoSuggestField"),"15003","");
		driver.findElement(By.name("autoSuggestField")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		click(By.id("Searchbtn"),"");
		Thread.sleep(5000);
		click(By.id("TestCenterCB_1"),"");
		Thread.sleep(3000);
		click(By.name("Submit4"),"");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='TCSessionsTbl']/tbody/tr[2]/td")).isDisplayed());
		
		
	}
	
	

}
