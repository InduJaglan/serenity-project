package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.SignInPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class LoginSteps {
    SignInPage loginPage;

    @And("user enters credential to login")
    public void userEntersCredentialToLogin(DataTable dataTable) {
        loginPage.loginWithCredential(dataTable);
    }
}
