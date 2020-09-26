package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage;

    @Given("I open url")
    public void iOpenUrl() {
        homePage.open();
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        homePage.clickOnLoginButton();
    }
}
