package com.utility;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Utility {
	

	private static Logger log = Utility.getLog(Utility.class);

	public static void verifyPages(WebDriver dr, String exceptedvalue) {
		String actualvalue = dr.getTitle();

		if (exceptedvalue.equals(actualvalue)) {
			System.out.println("Verify test is passed..");
		} else {
			System.out.println("XXX The Test is fail XXX");
			System.out.println("The Excepted Value is: " + exceptedvalue);
			System.out.println("The Actual value is: " + actualvalue);
		}
			Assert.assertEquals(actualvalue, exceptedvalue);
	}
	
	public static String getText(WebDriver dr,By by) {
		String name=dr.findElement(by).getText();
	//log.info(dr.findElement(by).getText());	
		return name;
	}


	public static void verifyPages(WebDriver dr, By by) throws InterruptedException {
		boolean b = dr.findElement(by).isDisplayed();
		Assert.assertTrue(b);
		log.info("You enterd :" + b + " when it will pass then it must be it's true ");
		Thread.sleep(2000);
		String pagename=dr.findElement(by).getText();
		log.info("Sucessfully verifyed: "+pagename);

	}
	
	// Logger
		public static Logger getLog(Class clazz) {
			Logger log = Logger.getLogger(clazz);
			PropertyConfigurator.configure("src/test/resources/log4j.properties");
			return log;
		}
	
	
	/*
	
	//Scrollpage
public static void scrollPage(WebDriver dr,String pixel) {
	JavascriptExecutor se=(JavascriptExecutor)dr;
	se.executeScript("window.scrollBy(0,"+pixel+")");
	
}	
	
	
	

	// screenshot
	public static String takeScreenShot(WebDriver dr, String failurmethodname) {
		TakesScreenshot ts = (TakesScreenshot) dr;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshot\\" + System.currentTimeMillis()
				+ failurmethodname + ".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {
			log.info("ScreenShot not possible" + e.getMessage());
		}
		return destination;
	}
*/
}
