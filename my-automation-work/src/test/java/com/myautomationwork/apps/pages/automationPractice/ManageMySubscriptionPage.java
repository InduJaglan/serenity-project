package com.myautomationwork.apps.pages.automationPractice;

import com.myautomationwork.utilities.CommonMethods;
import com.myautomationwork.utilities.RandomGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ManageMySubscriptionPage extends ManageMediaPage {

    @FindBy(xpath = "(//*[@class='list-item'])[4]")
    WebElement mySubscriptionOption;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement updateSubscription;


    public CommonMethods _commonMethods;
    public String updatedGroupName = null;
    public String newWebPageName = null;
     String toBedeletedPlaylistName = null;


    public ManageMySubscriptionPage() {

        _commonMethods = new CommonMethods();
    }

    private void switchOnDisplayManagePage() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(addFolder));
    }

    public void clickMySubscription() throws InterruptedException {
        waitABit(3000);
        this.switchOnDisplayManagePage();
        mySubscriptionOption.click();
    }
    public void enterSubscriptionDetails() throws InterruptedException
    {
        waitABit(3000);
        updateSubscription.click();
    }


    public boolean verifySubscription() throws InterruptedException {
        return false;
    }
}