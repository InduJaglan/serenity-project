package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.ManageMySubscriptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ManageMySubscriptionSteps {
    ManageMySubscriptionPage manageSubscription;

    @When("Click on the My Subscription button")
    public void clickMySubscriptionButton() throws InterruptedException {
        manageSubscription.clickMySubscription();
    }


    @And("click on Update Plan and Enter Details")
    public void clickPlanEnterDetails()throws InterruptedException
    {
        manageSubscription.enterSubscriptionDetails();
    }

    @Then("Verify that Subscription is updated successfully")
    public void verifySubscriptionUpdated()throws InterruptedException
    {
        Assert.assertTrue(manageSubscription.verifySubscription());

    }
}