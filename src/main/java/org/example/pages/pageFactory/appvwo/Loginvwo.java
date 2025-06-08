package org.example.pages.pageFactory.appvwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginvwo {
    WebDriver driver;
    public Loginvwo(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="login-username")
    private WebElement username;
    @FindBy(id="login-password")
    private WebElement password;
    @FindBy(id="js-login-btn")
    private WebElement signbutton;
    @FindBy(id="js-notification-box-msg")
    private WebElement erromsg;
}
