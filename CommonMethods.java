package com.myautomationwork.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

public class CommonMethods extends PageObject {
	WebDriver driver;
	
	public void scrollToViewElement(WebElement element) {
		driver=getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}

}
