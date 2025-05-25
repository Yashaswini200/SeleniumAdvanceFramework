package org.example.tests;

import org.assertj.core.api.Assertions;
import org.example.pages.pageObjectModel.appvwo.normal_POM.DashbordPage;
import org.example.pages.pageObjectModel.appvwo.normal_POM.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Testvwologin_01_NormalScript {
    @Test
    public void test_negative_login() throws Exception{
        WebDriver driver =new EdgeDriver();
        LoginPage loginPage=new LoginPage(driver);

        String error=loginPage.loginToVWOLoginInvalidCreds("admin","123");

        assertThat(error).isNotBlank().isNotEmpty();
        Assert.assertEquals(error,"Your email,password,IP address or location did not match");

        driver.quit();
    }
   @Test
   public void testLoginPositive() throws InterruptedException {
       WebDriver driver = new EdgeDriver();


       LoginPage loginPage_VWO = new LoginPage(driver);
       loginPage_VWO.loginToVWOLoginInvalidCreds("contact+aug@thetestingacademy.com","TtxkgQ!s$rJBk85");
       DashbordPage dashBoardPage  = new DashbordPage(driver);
       String usernameLoggedIn = dashBoardPage.loggedinusername();

       Assertions.assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
       Assert.assertEquals(usernameLoggedIn,"Aman");
       driver.quit();
   }
}
