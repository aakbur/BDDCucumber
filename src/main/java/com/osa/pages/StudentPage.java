package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;



public class StudentPage {
	public WebDriver dr;
	private static Logger log=Utility.getLog(StudentPage.class);

	public StudentPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//a[text()='Interview Questiones']")
	WebElement interviewques;
	@FindBy(xpath = "//a[text()='Class Projects']")
	WebElement classproject;
	@FindBy(xpath = "//a[text()='Study Materials']")
	WebElement studymaterials;
	@FindBy(xpath = "//a[text()='Discussion Board']")
	WebElement discussionboard;
	@FindBy(xpath = "//a[text()='Profile']")
	WebElement profile;
	@FindBy(id = "btn_logout")
	WebElement logout;
	By  printname=By.xpath("//div[@class=\"printName\"]//label");
	
	public void printNameOnConsole(){
	log.info(Utility.getText(dr, printname));
	System.out.println("Login person :"+Utility.getText(dr, printname));
	}
	
/*
	public InterviewQuestions clickInterviewQuestions() throws InterruptedException {
		interviewques.click();
		log.info("sucessfully open InterviewQuestions page");
		Thread.sleep(2000);
		Utility.verifyPages(dr, By.xpath("//b//u[text()='Java Interview Questions']"));
		InterviewQuestions iq=new InterviewQuestions(dr);
		return iq;
		
	}

	public void clickClassProject() {
		classproject.click();
		log.info("sucessfully open InterviewQuestions page");
		
	}
	
	public void clickStudyMaterial() {
		studymaterials.click();
		log.info("sucessfully open InterviewQuestions page");

	}
	public void clickDiscussionBoard() {
		discussionboard.click();
		log.info("sucessfully open clickDiscussionBoard page");
	}
	public void clickProfile() {
		profile.click();
		log.info("sucessfully open clickProfile page");

	}
	public void clickLogOut() {
		logout.click();
		log.info("Log Out successfull ");
	
		//return HomePage();	
	}

*/
}