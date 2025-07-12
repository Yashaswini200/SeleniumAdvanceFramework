package org.example.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class RetryAnalyser implements IRetryAnalyzer {
    private  int retrycounter=0;
    private static final int maxRetryCount=3;
    @Override
    public boolean retry(ITestResult iTestResult){
        if(retrycounter<maxRetryCount){
            retrycounter++;
            return true;
        }return false;
    }

//
}
