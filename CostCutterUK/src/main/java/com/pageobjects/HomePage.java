package com.pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.helper.Baseclass;

public class HomePage extends Baseclass {
	public int a=100;
	
	@FindBy(xpath="//*[@id='logo']/img")
	public static WebElement costcutterlogoimage;
	
	@FindBy(xpath="//a[text()='Get offers']")
	public static WebElement Offerslink;
	
    @FindBy(xpath="//a[@class='recipes ']")
    public static WebElement recipeslink;
    
    @FindBy(xpath="//ul/li[4]//a[text()='Blog']")
    public static WebElement bloglink;
    
    @FindBy(xpath="//ul/li[5]//a[text()='Careers']")
    public static WebElement careerslink;
    
    @FindBy(xpath="//a[@title='store finder']")
    public static WebElement storefinderlink;
    
    public static void verifyhomepagetabs(){
    	
    	
    	isDisplayed(costcutterlogoimage);
    	isDisplayed(Offerslink);
    	isDisplayed(recipeslink);
    	isDisplayed(bloglink);
    	isDisplayed(careerslink);
    }
    
    public static void clickonstorefinder(String expected){
      click(storefinderlink);	
      Assert.assertEquals(driver.getTitle(),expected);
    }
}
