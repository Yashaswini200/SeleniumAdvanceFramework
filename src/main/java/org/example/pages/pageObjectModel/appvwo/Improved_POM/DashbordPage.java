package org.example.pages.pageObjectModel.appvwo.Improved_POM;

import org.example.base.Basepage;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashbordPage extends Basepage {
    WebDriver driver;
    public DashbordPage(WebDriver driver){
        this.driver=driver;
    }
    private By usernameonDashboard= By.cssSelector("[data-qa='lufexuloga']");
    public String loggedInUserName() throws InterruptedException {
        WaitHelpers.visibilityOfElement(usernameonDashboard);
    return driver.findElement(usernameonDashboard).getText();
    }
}
