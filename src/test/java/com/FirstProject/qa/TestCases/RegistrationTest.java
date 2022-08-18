package com.FirstProject.qa.TestCases;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import com.FirstProject.qa.Base.TestBase;
import com.FirstProject.qa.pages.RegistrationPage;

	public class RegistrationTest extends TestBase {
		 // test case ==> navigational steps.
			// Open browser ==> Test Registration page ==> close the browser.
			
			@BeforeClass
			public void setup() {
				InitializeBrowser("chrome");
				
//				System.setProperty("webdriver.chrome.driver","C:\\JavaLibrary\\Chromedriverfiles\\chromedriver.exe");
//				driver = new ChromeDriver();
//				driver.get("https://www.facebook.com/");
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			@AfterClass
			public void teardown() {
				driver.close();
			}

			@Test
			public void FacebookRegistrationPageTest() {
				
				RegistrationPage rgpage = new RegistrationPage(driver);   // POM Class object create ==> constructor invoked
				rgpage.clickFacebookLoginPageSignupLink();
				rgpage.verifyFacebookRegistrationPageFblogo();
				rgpage.verifyFacebookRegistrationPageAlreadyAccount();
				rgpage.setFacebookRegistrationPageFirstName("Eshani");
				rgpage.setFacebookRegistrationPageLastName("Dolas");
				rgpage.setFacebookRegistrationPageMobileEmail();
				rgpage.setFacebookRegistrationPagePassword();
				rgpage.setFacebookRegistrationPageBirthDay();
				rgpage.setFacebookRegistrationPageBirthMonth();
				rgpage.setFacebookRegistrationPageBirthYear();
				rgpage.setFacebookRegistrationPageGender("female");
				rgpage.clickFacebookRegistrationPageSubmitBtn();
			}
			
			
			
		}
	 


