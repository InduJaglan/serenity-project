package com.myautomationwork.apps.pages.automationPractice;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends PageObject {
    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    WebElement loginButton;


    public void clickOnLoginButton() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }
}
