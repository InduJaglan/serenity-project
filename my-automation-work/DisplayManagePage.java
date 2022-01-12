package com.myautomationwork.apps.pages.automationPractice;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.myautomationwork.utilities.RandomGenerator;

import net.thucydides.core.pages.PageObject;

public class DisplayManagePage extends PageObject {
    @FindBy(xpath = "//*[@class='btn']")
    WebElement addScreen;

    @FindBy(xpath = "//*[@name='displayName']")
    WebElement screenName;

    @FindBy(xpath = "//*[@name='playerType']")
    WebElement selectPlayer;

    @FindBy(xpath = "//*[@value='ADD_DISPLAY_WEB_BROWSER_PLAYER']")
    WebElement selectPlayerType;

    @FindBy(xpath = "//*[contains(@class,'btn add')]")
    WebElement addNewScreen;

    @FindBy(xpath = "//*[@class='btn dark-btn']")
    WebElement addFolder;

    @FindBy(xpath = "//*[@name='folderName']")
    WebElement folderName;

    @FindBy(xpath = "//*[@class='dropdown-btn']")
    WebElement selectScreen;

    @FindBy(xpath = "//*[@class='item2']")
    WebElement screenType;

    @FindBy(xpath = "//*[@name='add']")
    WebElement addNewFolder;

    @FindBy(xpath = "//*[contains(@id,'custom-panel-')]//h5")
    List<WebElement> newAddedFolder;

    @FindBy(xpath = "//*[@id='custom-panel-0-header']//div/div//button[1]")
    WebElement editFolder;
    
    @FindBy(xpath = "//*[@id='custom-panel-0-header']//div/div//button[2]")
    WebElement deleteFolder;
    
    @FindBy(xpath = "//button[contains(@class,'delete')]")
    WebElement deleteFolderConfirmation;
    
    public String oldName=null;
  

    public String newFolderName=null;
    String toBedeletedFolderName=null;
    private void switchOnDisplayManagePage()
    {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(addFolder));
    }
    public void clickAddScreen()
    {
        this.switchOnDisplayManagePage();
        addScreen.click();

    }
    public void enterScreenDetails() throws InterruptedException {
        screenName.sendKeys(RandomGenerator.generateString(5));
        waitABit(5000);
        selectPlayer.click();
        selectPlayerType.click();
        addNewScreen.click();
    }

    public void clickAddFolder() throws InterruptedException {
        this.switchOnDisplayManagePage();
        waitABit(5000);
        addFolder.click();

    }
    public void enterFolderDetails() throws InterruptedException {

         newFolderName=RandomGenerator.generateString(5);
            folderName.sendKeys(newFolderName);
            selectScreen.click();
            screenType.click();

            waitABit(3000);
        folderName.click();

        waitABit(2000);
        addNewFolder.click();
        
    }

public Boolean validateFolderName() throws InterruptedException {
    Boolean match=false;

    waitABit(5000);
    for(WebElement newFolder:newAddedFolder){

        if(newFolderName.equals(newFolder.getText()))
            match=true;}
    return match;
}

    public void clickEditFolder() throws InterruptedException {
        this.switchOnDisplayManagePage();
        waitABit(2000);
        editFolder.click();

    }

    public void editFolderDetails() throws InterruptedException {
    	
        newFolderName = RandomGenerator.generateString(5);
        folderName.clear();
        folderName.sendKeys(newFolderName);
        waitABit(5000);
        addNewFolder.click();
       
    }
    
    public void clickDeleteFolder() throws InterruptedException {
        this.switchOnDisplayManagePage();
        waitABit(2000);
        toBedeletedFolderName=newAddedFolder.get(0).getText();
        deleteFolder.click();
        deleteFolderConfirmation.click();
        }
    
    public Boolean validateDeletedFolderName() throws InterruptedException {
        Boolean match=false;

        waitABit(5000);
       
        for(WebElement newFolder:newAddedFolder){

            if(toBedeletedFolderName.equals(newFolder.getText()))
            
                match=true;}
        return match;
        
    }

}
