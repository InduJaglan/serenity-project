package com.myautomationwork.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.Set;

public class CommonMethods extends PageObject {
    WebDriver driver;

    public void scrollToViewElement(WebElement element) {
        driver=getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public void scrollDown()
    {
        driver=getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }

    public void scrollUp() {
        driver=getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)");

    }
    public boolean isElementPresent(WebElement element)
    {
        try{
            element.isDisplayed();
            return true;
    }
        catch (Exception e)
        {
            return false;
        }
    }

    public void switchToTab(String tab)
    {
        ArrayList<String> newTab=new ArrayList<String>(getDriver().getWindowHandles());
        if(tab.equals("new"))
        getDriver().switchTo().window(newTab.get(1));
        if(tab.equals("old"))
            getDriver().switchTo().window(newTab.get(0));

    }

}