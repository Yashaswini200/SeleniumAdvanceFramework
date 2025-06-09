package org.example.tests;

import org.apache.logging.log4j.Logger;
import org.example.base.Base_test;
import org.example.listeners.RetryAnalyser;
import org.example.listeners.ScreenshotListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import static org.example.driver.DriverManager.getDriver;

@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyser.class)
public class TestVWOLogin_retry  extends Base_test {
    private static final Logger logger = LogManager.getLogger(TestVWOLogin_retry.class);
    @Test
    public void testnegative(){
        getDriver().get("https://app.vwo.com");
        logger.info("starting the testcase");
        Assert.assertTrue(false);
    }
    @Test
    public void testpositive(){
        getDriver().get("https://app.vwo.com");

        logger.info("starting test pom");
        Assert.assertTrue(true);
    }


}
