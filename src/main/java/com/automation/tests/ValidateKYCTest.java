package com.automation.tests;

import com.automation.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ValidateKYCTest extends BaseTest{

    @Test
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
}
