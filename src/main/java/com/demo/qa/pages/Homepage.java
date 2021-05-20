package com.demo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.Testbase;

public class Homepage extends Testbase
{
  //Page factory 
	
	@FindBy(xpath="//h3[contains(text(), 'Login Successfully')]")
    WebElement welcometext;
    
    @FindBy(xpath="//a[contains(text(),'Home')]")
    WebElement Homelink;
    
    @FindBy(xpath="//a[contains(text(),'Flights')]")
    WebElement Flightslink;
    
    @FindBy(xpath="//a[contains(text(),'Hotels')]")
    WebElement Hotelslink;
    
    @FindBy(xpath="//a[contains(text(),'Car Rentals')]")
    WebElement carrentalslink;
    
    @FindBy(xpath="//a[contains(text(),'Cruises')]")
    WebElement Cruiseslink;
    
    @FindBy(xpath="//a[contains(text(),'Destinations')]")
    WebElement Destinationslink;
    
    @FindBy(xpath="//a[contains(text(),'Vacations')]") 
    WebElement Vacationslink;
    
    @FindBy(xpath="//a[contains(text(),'REGISTER')]")
    WebElement Registerlink;
    
    public Homepage() {
        PageFactory.initElements(driver, this);
        }

    
    public String validateHomepagetitle(){
   	 return driver.getTitle();
    
    
        }
    
    public Homepage clickonhomepagelink() {
   	 Homelink.click();
   	 return new Homepage();  // it will return homepage class object
    
    
}
    public Flightspage clickonflightspagelink() {
    	Flightslink.click();
    	return new Flightspage();
    }
    
    public Cruisespage clickoncruisespagelink() {
    	Cruiseslink.click();
    	return new Cruisespage();
    	}
    
    
    public Carrentalspage carrentalspagelink() {
    	carrentalslink.click();
    	return new Carrentalspage();
    	}
    
    
    public Destinationpage destinationpagelink() {
    	Destinationslink.click();
    	return new Destinationpage();
    	}
    
    public Vacationspage vacationspagelink() {
    	Vacationslink.click();
    	return new Vacationspage();
    	}
    
    public Registrationpage registrationpagelink() {
    	Registerlink.click();
    	return new Registrationpage();
    	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    	
    	
    	
    	
    	
    	
    	
    	
    
    