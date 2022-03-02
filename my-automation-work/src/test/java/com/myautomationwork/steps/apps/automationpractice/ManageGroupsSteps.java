package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.ManageGroupsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ManageGroupsSteps {
    ManageGroupsPage manageGroup;

    @When("Click on the Groups button")
    public void clickGroupsButton()throws InterruptedException
    {
        manageGroup.clickGroups();
    }

    @And("click on Add Group and Enter Group Details")
    public void clickAddGroupDetails()throws InterruptedException
    {
        manageGroup.clickAddGroup();
        manageGroup.enterGroupDetails();
    }

    @Then("Verify that Group is added successfully")
    public void validateGroups() throws InterruptedException
    {
        Assert.assertTrue(manageGroup.verifyGroupName());
    }

    @When("Click on the Edit Groups button")
    public void clickEditGroupsButton()throws InterruptedException
    {
        manageGroup.clickEditGroup();

    }

    @And("Edit the Groups Details")
    public void editTheGroupsDetails() throws InterruptedException
    {
        manageGroup.editGroupDetails();
    }

    @Then("Verify that Group is updated successfully")
    public void validateUpdatedGroup() throws InterruptedException
    {
        Assert.assertTrue(manageGroup.validateUpdatedGroupName());

    }
    @When("Click on the Delete Group button")
    public void clickDeleteGroupButton() throws InterruptedException
    {
        manageGroup.deleteGroup();
    }

    @Then("Verify that Group is Deleted successfully")
    public void validateDeletedGroup() throws InterruptedException
    {
        Assert.assertFalse(manageGroup.validateDeletedGroupName());

    }
}