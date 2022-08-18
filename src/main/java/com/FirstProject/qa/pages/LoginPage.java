package com.FirstProject.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.FirstProject.qa.Base.TestBase;


	public class LoginPage extends TestBase {
	@FindBy (xpath="//img[@class='fb_logo _8ilh img']") private WebElement fb_logo;
	@FindBy (xpath="//h2[contains(text(),'Facebook helps you ')]") private WebElement caption;
	@FindBy (xpath="//input[@name='email']") private WebElement mail;
	@FindBy (xpath="//input[@name='pass']") private WebElement pass;
	@FindBy (xpath="//button[@name='login']") private WebElement log_btn;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgotten_pass;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement newAccount_btn;
	@FindBys({@FindBy (xpath="//div[@id='pageFooterChildren']//a")}) private List<WebElement> footerLinks;
	//initiolization
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
	//usage
	public void verifyFacebookLoginPageLogo(){
		Assert.assertTrue(fb_logo.isDisplayed());
		System.out.println("logo varified");
		Reporter.log("logo is displayed");
	}
	
	public void verifyFbCaption(){
		Assert.assertTrue(caption.isDisplayed());
		Assert.assertEquals(caption.getText(), "Facebook helps you connect and share with the people in your life.");
		System.out.println("varifyFbCaption ");
		Reporter.log("Caption is displayed");
	}
	
	public void verifyFacebookLoginPageForgottenPass(){
		Assert.assertTrue(forgotten_pass.isDisplayed());
		Assert.assertEquals(forgotten_pass.getText(), "Forgotten password?");
		Reporter.log("Forgotten password? is displayed");
	}
	
	public void verifyFacebookLoginPageCreateNewAccount(){
		Assert.assertTrue(newAccount_btn.isDisplayed());
		Reporter.log("Button is displayed");
	}
	
	public void verifyFacebookLoginPageMail(){
		Assert.assertTrue(mail.isDisplayed());
		Assert.assertTrue(mail.isEnabled());
		mail.sendKeys("shubham");
		Reporter.log("Mail is displayed");

	}
	
	public void verifyFacebookLoginPagePass(){
		Assert.assertTrue(pass.isDisplayed());
		Assert.assertTrue(pass.isEnabled());
		mail.sendKeys("shubham");
		Reporter.log("pass is displayed");

	}
	
	public void verifyFooterLinksSize(){
		Assert.assertEquals(footerLinks.size(), 31);
		Reporter.log("Fotter links is displayed");

	}
	
}
