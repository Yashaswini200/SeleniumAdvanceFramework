package org.example.tests;

import org.example.pages.pageObjectModel.appvwo.normal_POM.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Testvwologin_pf {
    @Test
    public void test_negative_login() throws Exception{
        WebDriver driver =new EdgeDriver();
        LoginPage loginPage=new LoginPage(driver);

        String error=loginPage.loginToVWOLoginInvalidCreds("admin","123");

        assertThat(error).isNotBlank().isNotEmpty();
        Assert.assertEquals(error,"Your email,password,IP address or location did not match");

        driver.quit();
    }
}
