package com.myautomationwork.apps.pages.automationPractice;


import com.myautomationwork.utilities.CommonMethods;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;


public class HomePage extends PageObject {
    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    WebElement loginButton;
    public CommonMethods _commonMethods;

    public HomePage() {

        _commonMethods = new CommonMethods();
    }
    public void clickOnLoginButton() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void openPairUrl()
    {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.open()");
        _commonMethods.switchToTab("new");
        getDriver().get("https://displaynow-webplayer-test.aspcore.net/pair");
    }
    public void closeBrowser()
    {
        this.getDriver().close();
    }
}