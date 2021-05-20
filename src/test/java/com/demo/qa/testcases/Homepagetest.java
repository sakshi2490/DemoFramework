package com.demo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.demo.qa.base.Testbase;
import com.demo.qa.pages.Homepage;
import com.demo.qa.pages.Signonpage;
import com.demo.qa.pages.Vacationspage;

public class Homepagetest extends Testbase {
	
	Signonpage signonpage;
	Homepage  Homepage;
	Vacationspage vacationpage;
	
	public Homepagetest() {
	super();

}
	@BeforeSuite
	public void setUp() {
		Testbase.initialization(); 
		vacationpage= new Vacationspage();
		signonpage = new Signonpage(); 
		Homepage= signonpage.Signon(prop.getProperty("username"), prop.getProperty("password"));
	}

    @Test
    public void verifyhomepagetitletest() {
    String homepagetitle= Homepage.validateHomepagetitle();
    Assert.assertEquals(homepagetitle, "Login: Mercury Tours");
   }
    
    @Test
    public void verifyvacationlinktest() {
    vacationpage = Homepage.vacationspagelink();
    }
    
    
    
	@AfterSuite
	public void Teardown() {
		driver.quit();

    

}}
