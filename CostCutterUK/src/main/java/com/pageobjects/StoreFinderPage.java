package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.helper.Baseclass;

public class StoreFinderPage extends Baseclass{
	
	@FindBy(name="searchLocation")
	public static WebElement searchpincodetextbox;
	
	@FindBy(xpath="//*[@id='findOptions']/div[1]/form/fieldset/button")
	public static WebElement findMyStorebutton;
	
	public static void searchstorewithpincode(String pincode){
		
		searchpincodetextbox.sendKeys(pincode);
		click(findMyStorebutton);
		
	}

}
