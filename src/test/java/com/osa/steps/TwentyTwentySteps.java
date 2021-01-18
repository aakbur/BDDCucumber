package com.osa.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.browser.Browser;
import com.osa.pages.ForumLoginPage;
import com.osa.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwentyTwentySteps {
	public WebDriver dr;
	HomePage hp;
	ForumLoginPage fp;

@Given("^Entering the osa url \"([^\"]*)\"$")
public void entering_the_osa_url(String url) throws Throwable {
dr=	Browser.openBrowser("chrome");
dr.get(url);


}

@And("^Clicking on forum button$")
public void clicking_on_forum_button() throws Throwable {
	hp=new HomePage(dr);
	Thread.sleep(4000);
   fp=hp.clickForumButton();
}

@And("^I Enter the email \"([^\"]*)\"$")
public void i_Enter_the_email(String email) throws Throwable {
	//fp=new ForumLoginPage(dr);
	fp.enterUserName(email);
}

@And("^I Enter the password \"([^\"]*)\"$")
public void i_Enter_the_password(String password) throws Throwable {
    fp.EnterPassword(password);
}

@When("^I click on LoginButton$")
public void i_click_on_LoginButton() throws Throwable {
	fp.clickLoginButton();
   
}

@Then("^I am on the OSA Student page$")
public void i_am_on_the_OSA_Student_page() throws Throwable {
   
}

@And("^I verify the Student page Title$")
public void i_verify_the_Student_page_Title() throws Throwable {
    
}
	

}
