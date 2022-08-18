package com.FirstProject.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.swing.border.Border;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.FirstProject.qa.Base.TestBase;

public class Utility extends TestBase {
	//Drawing the border around webelement.
		public static void Border(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		   js.executeScript("arguments[0].style.border='5px solid purple'", element);	}
		 
	//Takescreenshot utility
public static void getscreenshot(WebDriver driver,String Testname) throws IOException {
		
		Date d = new Date();   // object creation
		System.out.println(d);
		
		String filename = Testname+" "+d.toString().replace(" ", "").replace(":", "")+".png";
		System.out.println(filename);
		
		 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File Destination = new File("C:\\Screenshots\\FbScreen_"+filename);
       	 FileUtils.copyFile(Source,Destination);
	     }
  //fetch excelsheet data
public static void main(String[] args) throws IOException {
	 FileInputStream FetchFile = new FileInputStream("/FirstProject/src/main/java/com/ProjectName/qa/TestData/Basics.xlsx");
	   String value = WorkbookFactory.create(FetchFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(value);
	     
	   for(int i=0;i<5;i++) {
	     FileInputStream File = new FileInputStream("/FirstProject/src/main/java/com/ProjectName/qa/TestData/Basics.xlsx");
		   String Text = WorkbookFactory.create(File).getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
		   System.out.println(i+" "+Text+" ");
	    }	


}}