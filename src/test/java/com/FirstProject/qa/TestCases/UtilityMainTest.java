package com.FirstProject.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.FirstProject.qa.Base.TestBase;
import com.FirstProject.qa.Utility.Utility;

public class UtilityMainTest extends TestBase {
	public static void main(String[] args) {
	//1]draw border around webelement/dotted colour,solid coloure
  WebElement title = TestBase.driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
  Utility.Border(TestBase.driver,title);

}}
