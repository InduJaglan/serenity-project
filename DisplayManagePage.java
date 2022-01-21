package com.myautomationwork.apps.pages.automationPractice;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.myautomationwork.utilities.CommonMethods;
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
    
    @FindBy(xpath = "(//button[contains(@class,'btn view')])[3]")
    WebElement viewAllFolder;

    @FindBy(xpath = "//*[@id='custom-panel-0-header']//div/div//button[1]")
    WebElement editFolder;
    
    @FindBy(xpath = "//*[@id='custom-panel-0-header']//div/div//button[2]")
    WebElement deleteFolder;
    
    @FindBy(xpath = "//button[contains(@class,'delete')]")
    WebElement deleteFolderConfirmation;
    
    
    @FindBy(xpath = "(//*[@class='list-item'])[2]")
    WebElement mediaOption;
    
    @FindBy(xpath = "//button[@class='btn']")
    WebElement addMedia;
    
    @FindBy(xpath = "//*[@id='ngb-nav-1']")
    WebElement mediaApp;
    
    @FindBy(xpath = "//*[@id='ngb-nav-0']")
    WebElement myMediaApp;
    
    @FindBy(xpath = "(//button[contains(@class,'btn float')])[1]")
    WebElement addWebPage;
    
    @FindBy(xpath = "//input[@name='url']")
    WebElement newWebPageURL;
    
    @FindBy(xpath = "//input[@name='title']")
    WebElement webPageName;
    
    @FindBy(xpath = "//*[@type='submit']")
    WebElement addNewWebPage;
    
    @FindBy(xpath = "//*[contains(@class,'media-nav-tab-table')]//table//tr//td[1]")
    List<WebElement> newAddedWebPage;
    
    
    public CommonMethods _commonMethods;
    public String oldName=null;
  

    public String newFolderName=null;
    public String updatedFolderName=null;
    String toBedeletedFolderName=null;
    public String newWebPageName=null;
    public String newWebPageurl=null;
    public DisplayManagePage() {
    	
  _commonMethods=new CommonMethods();
    }
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
        waitABit(2000);
        selectPlayerType.click();
        waitABit(2000);
        addNewScreen.click();
    }

    public void clickAddFolder() throws InterruptedException {
        waitABit(10000);
        addFolder.click();

    }
    public void enterFolderDetails() throws InterruptedException {

         newFolderName=RandomGenerator.generateString(5);
            folderName.sendKeys(newFolderName);
            selectScreen.click();
            waitABit(2000);
            screenType.click();

            waitABit(3000);
        folderName.click();

        waitABit(2000);
        addNewFolder.click();
        
    }

public Boolean validateFolderName() throws InterruptedException {
    Boolean match=false;

    waitABit(5000);
  
   _commonMethods.scrollToViewElement(viewAllFolder);
    waitABit(2000);
    viewAllFolder.click();
    waitABit(2000);
    for(WebElement newFolder:newAddedFolder){

        if(newFolderName.equals(newFolder.getText())) {
            match=true;
        break;
        }
        }
    return match;
}

    public void clickEditFolder() throws InterruptedException {
        this.switchOnDisplayManagePage();
        waitABit(2000);
        editFolder.click();

    }

    public void editFolderDetails() throws InterruptedException {
    	
        updatedFolderName = RandomGenerator.generateString(5);
        waitABit(2000);
        folderName.clear();
        waitABit(2000);
        folderName.sendKeys(updatedFolderName);
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
    
    public Boolean validateUpdatedFolderName() throws InterruptedException {
        Boolean match=false;

        waitABit(5000);
        System.out.println("Element is visible"+_commonMethods.isElementPresent(viewAllFolder));
        _commonMethods.scrollToViewElement(viewAllFolder);
        waitABit(2000);
        viewAllFolder.click();
        waitABit(3000);
       
        for(WebElement newFolder:newAddedFolder){

            if(updatedFolderName.equals(newFolder.getText()))
            {
                match=true;
                break;
                }
            
        }
        return match;
        
    }
    
    
    public Boolean validateDeletedFolderName() throws InterruptedException {
    	Boolean match=false;

        waitABit(5000);
        _commonMethods.scrollToViewElement(viewAllFolder);
        waitABit(2000);
        viewAllFolder.click();
        waitABit(3000);
       for(WebElement newFolder:newAddedFolder){

            if(toBedeletedFolderName.equals(newFolder.getText()))
            
                match=true;}
        return match;
        
    }
    
    public void clickMediaOption() throws InterruptedException {
        this.switchOnDisplayManagePage();
        waitABit(2000);
        mediaOption.click();

    }
    
    public void clickMyMediatab() throws InterruptedException {
       
        waitABit(2000);
        addMedia.click();

    }
    
    public Boolean verifyMediaApp() throws InterruptedException {
        waitABit(5000);
        if(mediaApp.getAttribute("aria-selected").equals("true"))
        	return true;
        else
        	return false;
      
      
    }
    
    public void addWebPageDetails() throws InterruptedException {

    	waitABit(2000);
    	  addWebPage.click();
    	  waitABit(2000);
        newWebPageName=RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(2000);
           webPageName.sendKeys(newWebPageName);
           newWebPageurl="https://www."+RandomGenerator.generateString(10)+"@automation.com";
           newWebPageURL.sendKeys(newWebPageurl);
           waitABit(2000);
           selectScreen.click();
           waitABit(2000);
           screenType.click();
           waitABit(2000);
           webPageName.click();
       waitABit(2000);
       addNewWebPage.click();
       
   }
    
    public Boolean verifyWebPage() throws InterruptedException {
    	Boolean match=false;

        waitABit(5000);
        myMediaApp.click();
        waitABit(2000);
       for(WebElement newpage:newAddedWebPage){

            if(newWebPageName.equals(newpage.getText()))
            
                match=true;}
        return match;
        
    }

}
