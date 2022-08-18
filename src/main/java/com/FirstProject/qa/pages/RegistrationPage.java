package com.FirstProject.qa.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;

import com.FirstProject.qa.Base.TestBase;

	public class RegistrationPage extends TestBase{
	  //POM Class
	  //Declaration
		//WebElement variable= driver.findelement(by.Xpath("path"));
		@FindBy (xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;
		@FindBy (xpath="//a[text()='Already have an account?']") private WebElement already_acc;
		@FindBy (xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
		@FindBy (name="firstname") private WebElement firstname;
		@FindBy (name="lastname") private WebElement surname;
		@FindBy (xpath="//input[@name='reg_email__']") private WebElement mobile_email;
		@FindBy (xpath="//input[@name='reg_passwd__']") private WebElement password;
		@FindBy (xpath="//select[@name='birthday_day']") private WebElement birthday;
		@FindBy (xpath="//select[@name='birthday_month']") private WebElement birthmonth;
		@FindBy (xpath="//select[@name='birthday_year']") private WebElement birthyear;
		@FindBy (xpath="//label[text()='Male']") private WebElement gender_male;
		@FindBy (xpath="//label[text()='Female']") private WebElement gender_female;
		@FindBy (name="websubmit") private WebElement submitbtn;
		
		//Initialization
		public RegistrationPage (WebDriver driver){
			PageFactory.initElements(driver,this);
			}
		
		//Usage
		public void clickFacebookLoginPageSignupLink() {
			signuplink.click();
		}
		public void verifyFacebookRegistrationPageFblogo() {
		  Assert.assertTrue(reg_fblogo.isDisplayed(), "Facebook logo is not displayed on registration page");
	    }
		public void verifyFacebookRegistrationPageAlreadyAccount() {
		  Assert.assertTrue(already_acc.isDisplayed(), "Facebook already have an account option is not displayed on registration page");
		  Assert.assertTrue(already_acc.isEnabled(), "Facebook already have an account option is not Enabled on registration page");
		  Assert.assertEquals(already_acc.getText(), "Already have an account?");
		}
		public void setFacebookRegistrationPageFirstName(String fn) {
			firstname.sendKeys(fn);
		}
		public void setFacebookRegistrationPageLastName(String sn) {
			surname.sendKeys(sn);
		}
		public void setFacebookRegistrationPageMobileEmail() {
			password.sendKeys("eshanidolas86");
		}
		public void setFacebookRegistrationPagePassword() {
			mobile_email.sendKeys("1234567890");
		}
		public void setFacebookRegistrationPageBirthDay() {
		 Select bday = new Select(birthday) ;
		 Assert.assertTrue(birthday.isDisplayed(),"Birthday option is not displayed");	
		 Assert.assertFalse(birthday.isSelected(),"Birthday option is not selected");
		 bday.selectByVisibleText("29");	
		}
		public void setFacebookRegistrationPageBirthMonth() {
			Select bmonth = new Select(birthmonth);
			Assert.assertTrue(birthmonth.isDisplayed(),"birthmonth option is not displayed");
			Assert.assertFalse(birthmonth.isSelected());
			bmonth.selectByVisibleText("Mar");
		}
		public void setFacebookRegistrationPageBirthYear() {
			Select byear = new Select(birthyear);
			Assert.assertTrue(birthyear.isDisplayed(),"birthyear option is not displayed");
			Assert.assertFalse(birthyear.isSelected());
			byear.selectByVisibleText("1994");
		}
		public void setFacebookRegistrationPageGender(String gender) {
			if(gender.equalsIgnoreCase("male")) {
				gender_male.click();
			}else if(gender.equalsIgnoreCase("female")) {
				gender_female.click();
			}else {
				System.out.println("The wrong input selected by user");
			}
		}
		
		public void clickFacebookRegistrationPageSubmitBtn() {
			submitbtn.click();
		}
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



