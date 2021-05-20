package com.demo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.Testbase;

public class Signonpage extends Testbase
{
	     //Page Factory- OR
         @FindBy(name= "userName")
         WebElement userName;
         
         @FindBy(name= "password")
         WebElement password;
         
         @FindBy(name= "submit")
         WebElement submitbtn;
         
         @FindBy(linkText= "REGISTER")
         WebElement register;
         
         //initialize the page objects
         public Signonpage() {
         PageFactory.initElements(driver, this);
         }
         
         //Actions or features of signon screen
         
         public String validateSignonpagetitle(){
        	 return driver.getTitle(); // this method will return title
         }
         
         public Homepage Signon(String un, String pwd) {
        	 userName.sendKeys(un); // userName already defined in base class
        	 password.sendKeys(pwd);  // password already defined in base class
        	 submitbtn.click();
        	 return new Homepage();  // it will return homepage class object
         
         
}

			
		

			
		
}