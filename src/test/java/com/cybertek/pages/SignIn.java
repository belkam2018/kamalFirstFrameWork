package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignIn {

    public SignIn(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    public WebElement signinLoc;

    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    public WebElement SignIn;

    @FindBy(id = "ap_email")
    public WebElement email;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(id = "signInSubmit")
    public WebElement clickSign;



    public void login()  {
        email.sendKeys(ConfigurationReader.getProperty("user_email"));
        password.sendKeys(ConfigurationReader.getProperty("user_password"));
        clickSign.click();


    }




}
