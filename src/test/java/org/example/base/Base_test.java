package org.example.base;

import org.example.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test { @BeforeMethod
public void setUp(){
    DriverManager.init();
}
//
    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }
}
