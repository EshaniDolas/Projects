package com.FirstProject.qa.TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FirstProject.qa.Base.TestBase;
import com.FirstProject.qa.Utility.Utility;
import com.FirstProject.qa.pages.LoginPage;

public class LoginTest extends TestBase{	
		//WebDriver driver;
		// Open browser ==> Test Registration page ==> close the browser.
		
		@BeforeClass
		public void setup() {
			InitializeBrowser("chrome");
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\chromedriver_win32 (102)\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.get("https://www.facebook.com/");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterClass
		public void teardown() {
			driver.close();
		}
		
		@Test
		public void FacbookLoginPageTest() {
			LoginPage lp = new LoginPage(driver);
			lp.verifyFacebookLoginPageLogo();
			lp.verifyFbCaption();
			lp.verifyFacebookLoginPageForgottenPass();
			lp.verifyFacebookLoginPageCreateNewAccount();
			lp.verifyFacebookLoginPageMail();
			lp.verifyFacebookLoginPagePass();
			lp.verifyFooterLinksSize();
			
			
		}

	}


