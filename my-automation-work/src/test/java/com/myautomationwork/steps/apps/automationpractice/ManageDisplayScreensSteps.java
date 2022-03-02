package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.ManageDisplayScreensPage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageDisplayScreensSteps {
    ManageDisplayScreensPage managePage;

    @When("Click on Add Screen")
    public void addScreen()
    {
        managePage.clickAddScreen();
    }

    @And("Get Pair code")
    public void getPairCode() throws InterruptedException {
        managePage.getPairCode();
    }


    @And("Add Screen Name")
    public void addScreenDetails() throws InterruptedException {
        managePage.enterScreenDetails();
    }

    @When("Click on Add Folder")
    public void addFolder() throws InterruptedException {
        managePage.clickAddFolder();
    }

    @And("Add Folder Detail")
    public void addFolderDetails() throws InterruptedException {
        managePage.enterFolderDetails();
    }

    @When("Click on the Edit button")
    public void editFolder() throws InterruptedException {
        managePage.clickEditFolder();
    }

    @And("Edit the folder details")
    public void editFolderDetails() throws InterruptedException {
        managePage.editFolderDetails();
    }

    @When("Click on the Delete button")
    public void deleteFolder() throws InterruptedException {
        managePage.clickDeleteFolder();
    }

    @Then("Verify that screen is added successfully")
    public void validateScreen() throws InterruptedException {
        Assert.assertTrue(managePage.validateScreenName());
    }

    @Then("Verify that folder is added successfully")
    public void validateFolder() throws InterruptedException {
        Assert.assertTrue(managePage.validateFolderName());
    }

    @Then("Verify that folder is updated successfully")
    public void validateUpdatedFolder() throws InterruptedException {
        Assert.assertTrue(managePage.validateUpdatedFolderName());
    }

    @Then("Verify that folder is deleted successfully")
    public void validateDeletedFolder() throws InterruptedException {
        Assert.assertFalse(managePage.validateDeletedFolderName());
    }

    @When("Click on the Collapse all button")
    public void CollapseAll() throws InterruptedException {
        managePage.clickCollapseAll();
    }

    @When("Click on the Expand all button")
    public void clickOnTheExpandAllButton() throws InterruptedException {
        managePage.clickExpandAllButton();
    }

    @Then("Verify that all the folders Collapsed successfully")
    public void validateCollapseAll() throws InterruptedException {
        Assert.assertFalse(managePage.validateAllFolder());
    }

    @Then("Verify that all the folders Expand successfully")
    public void validateExpandAll() throws InterruptedException {
        Assert.assertTrue(managePage.validateAllFolder());
    }

    @When("Search Screen data by Search Parameters")
    public void searchScreenName(DataTable datatable) throws InterruptedException {
        managePage.enterSearchValue(datatable);
        managePage.clickSearchButton();
    }

    @Then("Verify that screen data Search successfully")
    public void ValidateScreenSearched() throws InterruptedException {
        Assert.assertTrue(managePage.ValidateSearchScreenData());
    }

    @Then("Verify that second data Search successfully")
    public void ValidateSearchSecondData() throws InterruptedException {
        Assert.assertTrue(managePage.ValidateSecondData());
    }
}