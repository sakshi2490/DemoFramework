package com.demo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.qa.util.TestUtil;

public class Testbase {
	public static WebDriver driver; // initialize the webdriver
	public static Properties prop; // created global variable to
	
	/**
	 * 1. created base class costructor 
	 * 2. Read the properties from the congig.properties file
	 *  by providing the path of the file.
	 * 3. Created object of fileinputstream class and load all the properties 
	 * which are available in config.properties file
	 */
	public Testbase() { 
		try {
			String filePath = System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\demo\\qa\\config\\config.properties";
			System.out.println(filePath);
			prop = new Properties();
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 1. Get browser property to know the type of browser used,
	 * 2. Initialize ChromeDriver,
	 * 3. Define commonly performed actions like maximize window, delete cookies,
	 *    wait for page load time out and implicit wait, getting the URL to load.
	 */
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\NewChrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}
}