package com.myautomationwork.apps.pages.automationPractice;

import io.cucumber.datatable.DataTable;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends PageObject {

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "passwd")
    WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    WebElement loginButton;

    private void switchOnLoginPage() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(emailField));
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.elementToBeClickable(emailField));
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
