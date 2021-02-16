package com.costcutter.businesscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.helper.Baseclass;
import com.pageobjects.HomePage;
import com.pageobjects.StoreFinderPage;

public class TestingSearchStoreLocation extends Baseclass {
	
	HomePage hp;
	StoreFinderPage sp;
	
	@Test
	public void searchstorewithpincode(){
		
		hp=PageFactory.initElements(driver, HomePage.class);
		sp=PageFactory.initElements(driver, StoreFinderPage.class);
		HomePage.verifyhomepagetabs();
		HomePage.clickonstorefinder("Location Finder");		
		StoreFinderPage.searchstorewithpincode("500045");
		
	}

}
