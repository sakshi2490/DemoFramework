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
         
         public Signonpage() {
         PageFactory.initElements(driver, this);
         }
         //Actions
         
         public String validateSignonpagetitle(){
        	 return driver.getTitle();
         }
         
         public Homepage Signon(String un, String pwd) {
        	 userName.sendKeys(un);
        	 password.sendKeys(pwd);
        	 submitbtn.click();
        	 return new Homepage();
         
         
}

			
		

			
		
}