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
	public static WebDriver driver;
	public static Properties prop;

	public Testbase() {
		try {
			String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\com\\demo\\qa\\config\\config.properties";
			System.out.println(filePath);
			prop = new Properties();
			FileInputStream ip = new FileInputStream(filePath);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

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