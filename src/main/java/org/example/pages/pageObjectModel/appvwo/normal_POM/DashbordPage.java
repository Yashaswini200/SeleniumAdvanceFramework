package org.example.pages.pageObjectModel.appvwo.normal_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashbordPage {
    WebDriver driver;
    public DashbordPage(WebDriver driver){
        this.driver=driver;
    }
    private By usernameonDashboard= By.cssSelector("[data-qa='lufexuloga']");
    public String loggedinusername() throws InterruptedException {
        Thread.sleep(10000);
        return driver.findElement(usernameonDashboard).getText();
    }

}
