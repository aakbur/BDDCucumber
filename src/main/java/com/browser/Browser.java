package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver dr = null;
	static String basepath = System.getProperty("user.dir");
	
	public static WebDriver openBrowser(String browser) {
		
		//String browser=Apps.BROWSER;
		if(System.getProperty("os.name").toLowerCase().contains("windows")){
			driverForWindows(browser);
		}else {
			driverForMac(browser);
		}
		dr.manage().window().maximize();
		//dr.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//dr.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		return dr;
	}
	
	
	public static void driverForWindows(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/win/chromedriver.exe");
			dr = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/win/geckodriver.exe");
			dr = new FirefoxDriver();
		} else {
			System.out.println("You entered " + browser + " this is wrong.Please enter Browser name Chrome or firefox.");
		}
	}

	public static void driverForMac(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/aakbur/Desktop/Selenium/chromedriver");
			dr = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gicko.driver",
					basepath + "\\src\\test\\resources\\drivers\\mac\\gickodriver");
			dr = new ChromeDriver();
		} else {
			System.out.println("You entered " + browser + " this is wrong.Please enter Browser name Chrome or firefox ");
		}

	}
}
