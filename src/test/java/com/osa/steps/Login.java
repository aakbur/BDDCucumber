package com.osa.steps;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.browser.Browser;
import com.osa.pages.ForumLoginPage;
import com.osa.pages.HomePage;
import com.osa.pages.StudentPage;
import com.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class Login {
	
	public WebDriver dr;
	public HomePage hp;
	public ForumLoginPage fp;
	public StudentPage st;
	
	@Given("^i am initialing the Chrome Browser$")
	public void i_am_initialing_the_Chrome_Browser() throws Throwable {
		dr=Browser.openBrowser("chrome");  
	}

	@And("^i am open URL OSA Homepage from \"([^\"]*)\"$")
	public void i_am_open_URL_OSA_Homepage_from(String url) throws Throwable {
	    dr.get(url);
	}

	@And("^i am clicking on froum button$")
	public void i_am_clicking_on_froum_button() throws Throwable {
	     hp=new HomePage(dr);
	      fp=hp.clickForumButton();
	}

	@And("^i am entered my UserName$")
	public void i_am_entered_my_UserName() throws Throwable {
	
		Thread.sleep(2000);
			fp.enterUserName("aakbur@gmail.com");
	}

	@And("^i am Entered my password$")
	public void i_am_Entered_my_password() throws Throwable {
			
		fp.EnterPassword("password");
	
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		st	=fp.clickLoginButton();
	}

	@Then("^Successfully Login verified$")
	public void successfully_Login_verified() throws Throwable {
		

		Utility.verifyPages(dr, "Student Page");
	
	}

	@And("^user full name displayed on console\\.$")
	public void user_full_name_displayed_on_console() throws Throwable {
		Thread.sleep(5000);
		st.printNameOnConsole();
		
		dr.close();
	
	}


	


}
