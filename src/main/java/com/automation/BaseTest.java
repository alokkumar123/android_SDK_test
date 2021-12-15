package com.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {


    public TestSessionInitiator test;

    @BeforeClass
    public void startSession() {
        test = new TestSessionInitiator();
    }

    @AfterClass
    public void closeSession(){
        test.closeApplication();
    }
}
