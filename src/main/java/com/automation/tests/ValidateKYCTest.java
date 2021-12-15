package com.automation.tests;

import com.automation.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class ValidateKYCTest extends BaseTest{

    @Parameters({"deviceName","udid"})
    @Test
    public void launchApplication(String deviName,String udid) throws MalformedURLException {
        test.launchApplication(deviName,udid);
    }

    @Test(dependsOnMethods = "launchApplication")
    public void verifyKYCProcessWithIdentityCard(){
        test.kycPage.clickOnAuthenticationButton();
        test.kycPage.clickOnStartButton();
        test.kycPage.selectIdentityCardForKYCProcess();
        test.kycPage.selectCounty();
        test.kycPage.clickFrontPositionOfDocument();
        test.kycPage.validatePicture();
        test.kycPage.clickBackPositionOfDocument();
        test.kycPage.sendDocuments();
        test.kycPage.takeSelfie();
        test.kycPage.sendPicture();
        Assert.assertTrue(test.kycPage.isCongratulationsMegDisplayed());
        test.kycPage.clickOnExitButton();
    }

    @Test(dependsOnMethods = "launchApplication")
    public void verifyKYCProcessWithIdentityCardByTakingNewPicture(){
        test.kycPage.clickOnAuthenticationButton();
        test.kycPage.clickOnStartButton();
        test.kycPage.selectIdentityCardForKYCProcess();
        test.kycPage.selectCounty();
        test.kycPage.clickFrontPositionOfDocument();
        test.kycPage.takeNewPicture();
        test.kycPage.clickFrontPositionOfDocument();
        test.kycPage.validatePicture();
        test.kycPage.clickBackPositionOfDocument();
        test.kycPage.takeNewPicture();
        test.kycPage.clickBackPositionOfDocument();
        test.kycPage.sendDocuments();
        test.kycPage.takeSelfie();
        test.kycPage.sendPicture();
        Assert.assertTrue(test.kycPage.isCongratulationsMegDisplayed());
        test.kycPage.clickOnExitButton();
    }

    @Test(dependsOnMethods = "launchApplication")
    public void discardAllKCYProcess(){
        test.kycPage.clickOnAuthenticationButton();
        test.kycPage.clickOnStartButton();
        test.kycPage.selectIdentityCardForKYCProcess();
        test.kycPage.selectCounty();
        test.kycPage.clickFrontPositionOfDocument();
        test.kycPage.takeNewPicture();
        test.kycPage.clickFrontPositionOfDocument();
        test.kycPage.validatePicture();
        test.kycPage.navigateBack();
        test.kycPage.discardAllSavedChanges();
        Assert.assertTrue(test.kycPage.isStartButtonDisplayed());
    }
}
