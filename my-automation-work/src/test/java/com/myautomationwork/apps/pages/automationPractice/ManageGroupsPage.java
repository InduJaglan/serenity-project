package com.myautomationwork.apps.pages.automationPractice;

import com.myautomationwork.utilities.CommonMethods;
import com.myautomationwork.utilities.RandomGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ManageGroupsPage extends ManageMediaPage {

    @FindBy(xpath = "(//*[@class='list-item'])[3]")
    WebElement groupsOption;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement addGroup;

    @FindBy(xpath = "//input[@name='groupName']")
    WebElement groupName;

    @FindBy(xpath = "(//*[@class='dropdown-btn'])[1]")
    WebElement selectGroupScreen;

    @FindBy(xpath = "(//*[@class='item2'])[1]")
    WebElement selectGroupScreenType;

    @FindBy(xpath = "(//*[@class='dropdown-btn'])[2]")
    WebElement selectPlaylistScreen;

    @FindBy(xpath = "(//*[@class='item2'])[2]")
    WebElement selectPlaylistScreenType;

    @FindBy(xpath = "(//*[@class='dropdown-btn'])[3]")
    WebElement selectGroupMedia;

    @FindBy(xpath = "(//*[@class='item2'])[3]")
    WebElement selectGroupMediaType;

    @FindBy(xpath = "(//*[@class='dropdown-btn'])[4]")
    WebElement selectGroupBroadcast;

    @FindBy(xpath = "(//*[@class='item2'])[4]")
    WebElement selectGroupBroadcastType;

    @FindBy(xpath = "//*[@type='submit'][1]")
    WebElement addGroups;

    @FindBy(xpath = "(//*[@class='item-name item-name-secondary'])[1]")
    WebElement viewAllGroup;

    @FindBy(xpath = "//*[contains(@class,'table-wrapper')]//table//tr//td[1]")
    List<WebElement> newAddedPlayList;

    @FindBy(xpath = "(//button[contains(@class,'table-btn')])[2]")
    WebElement editGroup;

    @FindBy(xpath = "(//button[contains(@class,'table-btn')])[3]")
    WebElement deleteGroup;

    @FindBy(xpath = "//button[contains(@class,'delete')]")
    WebElement deleteGroupConfirmation;

    public CommonMethods _commonMethods;
    public String updatedPlaylistName = null;
    public String newWebPageName = null;
    String toBedeletedPlaylistName = null;


    public ManageGroupsPage() {

        _commonMethods = new CommonMethods();
    }

    private void switchOnDisplayManagePage() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(addFolder));
    }

    public void clickGroups() throws InterruptedException {
        waitABit(2000);
        this.switchOnDisplayManagePage();
        groupsOption.click();
    }

    public void clickAddGroup() throws InterruptedException {
        waitABit(4000);
        addGroup.click();
    }

    public void enterGroupDetails() throws InterruptedException {
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        groupName.click();
        groupName.clear();
        waitABit(5000);
        groupName.sendKeys(newWebPageName);
        waitABit(2000);
        groupName.click();
        waitABit(3000);
        addGroups.click();
    }

    public boolean verifyGroupName() throws InterruptedException {
        Boolean match = false;
        waitABit(20000);
        for (WebElement newpage : newAddedPlayList) {

            if (newWebPageName.equals(newpage.getText()))

                match = true;
        }
        return match;

    }

    public void clickEditGroup() {
        waitABit(6000);
        editGroup.click();
    }

    public void editGroupDetails() {
        waitABit(4000);
        updatedPlaylistName = RandomGenerator.generateString(5);
        groupName.click();
        groupName.clear();
        waitABit(5000);
        groupName.sendKeys(updatedPlaylistName);
        waitABit(2000);
        groupName.click();
        waitABit(3000);
        addGroups.click();
    }

    public boolean validateUpdatedGroupName() {
        Boolean match = false;
        waitABit(20000);
        for (WebElement newpage : newAddedPlayList) {

            if (updatedPlaylistName.equals(newpage.getText()))

                match = true;
        }
        return match;

    }

    public void deleteGroup() {
        waitABit(10000);
        toBedeletedPlaylistName = newAddedPlayList.get(0).getText();
        deleteGroup.click();
        deleteGroupConfirmation.click();
    }

    public boolean validateDeletedGroupName() {
        Boolean match = false;
        {
            waitABit(20000);
            for (WebElement newpage : newAddedPlayList) {

                if (toBedeletedPlaylistName.equals(newpage.getText()))

                    match = true;
            }
            return match;
        }
    }
}