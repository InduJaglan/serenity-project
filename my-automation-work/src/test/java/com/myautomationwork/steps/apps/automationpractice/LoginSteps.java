package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.SignInPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps
{
    SignInPage loginPage;

    @And("user enters credential to login")
    public void userEntersCredentialToLogin(DataTable dataTable)
    {
        loginPage.loginWithCredential(dataTable);
    }

    @Then("Verify that Incorrect Message should be displayed")
    public void validateIncorrectPasswordMessage() throws InterruptedException
    {
        Assert.assertTrue(loginPage.validateErrorMessage("Your password is incorrect"));
    }

}