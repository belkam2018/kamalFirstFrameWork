package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckAllD  {

     public CheckAllD(){
         PageFactory.initElements(Driver.getDriver(), this);

     }

    @FindBy(xpath = "//*[@id=\"searchDropdownBox\"]")
    public WebElement checkAllButton;

     @FindBy(xpath = "//option[@value='search-alias=computers']")
    public List<WebElement> checkBox;










}
