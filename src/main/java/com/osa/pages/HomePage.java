package com.osa.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;



public class HomePage {
	public WebDriver dr;
	public HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	private static Logger log=Utility.getLog(HomePage.class);
	
       @FindBy(xpath=("//a[text()='Forum']"))WebElement forum;
	

	public ForumLoginPage clickForumButton() {
		forum.click();
		log.info("Secesfully click on Furom Button ");
		
		return new ForumLoginPage(dr);
		
	}
	

}