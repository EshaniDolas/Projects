package com.FirstProject.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	@Parameters("browser")
	@Test(priority = 1)
	public void InitializeBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\JavaLibrary\\Chromedriverfiles\\chromedriver.exe");
			 driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\JavaLibrary\\Microsoftdriverfiles\\msedgedriver.exe");
			 driver = new EdgeDriver ();
		}else {
			System.out.println("Wrong browser selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
