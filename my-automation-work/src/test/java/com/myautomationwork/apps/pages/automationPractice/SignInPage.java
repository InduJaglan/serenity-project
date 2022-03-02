package com.myautomationwork.apps.pages.automationPractice;

import io.cucumber.datatable.DataTable;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class SignInPage extends PageObject {

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "next")
    WebElement loginButton;

    @FindBy(xpath = "//*[contains(@class,'error pageLevel')]//p")
    WebElement errorMessage;

    private void switchOnLoginPage() {
        waitForCondition().withTimeoutOf(100).seconds().until(ExpectedConditions.visibilityOf(emailField));
        waitForCondition().withTimeoutOf(100).seconds().until(ExpectedConditions.elementToBeClickable(emailField));
    }

    public Boolean validateErrorMessage(String message)
    {
        if(errorMessage.getText().equals(message))
            return true;
        else
            return false;
    }
    public void loginWithCredential(DataTable dataTable) {
        this.switchOnLoginPage();
        String email = dataTable.asMaps(String.class, String.class).get(0).get("emailId").toString();
        String password = dataTable.asMaps(String.class, String.class).get(0).get("password").toString();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();

    }

}
