package com.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class BaseTest {


    public TestSessionInitiator test;

    @BeforeClass
    public void startSession() throws MalformedURLException {
        test = new TestSessionInitiator();
        test.launchApplication();

    }

    @AfterClass
    public void closeSession(){
        test.closeApplication();
    }
}
