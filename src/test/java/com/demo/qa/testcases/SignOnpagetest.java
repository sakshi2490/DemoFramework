package com.demo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.qa.base.Testbase;
import com.demo.qa.pages.Homepage;
import com.demo.qa.pages.Signonpage;

public class SignOnpagetest extends Testbase {
	Signonpage signonpage;
	Homepage homepage;
	

	public SignOnpagetest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Testbase.initialization();
		signonpage = new Signonpage();

	}

	@Test(priority = 1)
	public void signonpagetitletest() {
		String title = (signonpage).validateSignonpagetitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test(priority = 2)
	public void logintest() {
		homepage = signonpage.Signon(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void Teardown() {
		driver.quit();

	}

}
