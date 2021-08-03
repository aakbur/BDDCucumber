package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;


public class ForumLoginPage {
	public WebDriver dr;
	private static Logger log=Utility.getLog(ForumLoginPage.class);

	public ForumLoginPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		//PageFactory.initElements(WebDriver driver, Object page);

	}
	/** 
	 * This is the way We use @FindBy Instead of Finding the WebElement
	 * 
	 * //WebElement p=dr.findElement(By.xpath("valueOfTheXpath"));
	 * 
	 */
	@FindBy(xpath = "//input[@id='username']")
	WebElement userid;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwd;
	@FindBy(id = "login_button")
	WebElement login;
	@FindBy(id="passwor")
	WebElement text;	
	By  printname=By.xpath("//div[@class=\"printName\"]//label");
	By gettext=By.xpath("//p[@id='message']");

	public void enterUserName(String username) {
		userid.sendKeys(username);
		log.info("You entered Username is: "+username);
	}

	public void EnterPassword(String password) {
		passwd.sendKeys(password);
		//log.info("You entered Username is: "+password);
		
	}
	public void wrongUsernamenPass() {
	String text=dr.findElement(gettext).getText();
	log.info("After clicking login button, massage is :"+text);
		
		
	}
	public void clickLoginButtonWUP() {
		login.click();
		log.info("click login button ");
		}

	public StudentPage clickLoginButton() throws InterruptedException {
		login.click();
		log.info("click login button ");
	 	Thread.sleep(2000);
		Utility.verifyPages(dr, printname);
		StudentPage sp=new StudentPage(dr);
		return sp;
	}

	

		
}
