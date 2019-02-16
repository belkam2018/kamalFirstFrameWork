package com.cybertek.step_defs;

import com.cybertek.pages.CheckAllD;
import com.cybertek.pages.SignIn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckAllDep {

    SignIn signIn = new SignIn();
    CheckAllD checkAllDep = new CheckAllD();


    @Then("check all Departments")
    public void checkAllDepartments() throws Exception  {

        checkAllDep.checkAllButton.click();
        Thread.sleep(6000);

    }
    @And("print all Departments")
    public void printAllDepartments() {

       String printAllD = checkAllDep.checkAllButton.getText();
        //System.out.println(printAllD);

       }
    @Then("select computer option")
    public void select_computer_option() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        checkAllDep.checkAllButton.click();

        for (int idx = 0; idx < checkAllDep.checkBox.size(); idx++){

            if (checkAllDep.checkBox.get(idx).getText().equals("Computers")){
                checkAllDep.checkBox.get(idx).click();
            }
            System.out.println(checkAllDep.checkBox.get(idx).getText());
        }
//        new  (checkAllDep.checkBox).selectByVisibleText("Computers");
//        checkAllDep.checkBox.click();
//        String exp = "Computers";
//        boolean act = checkAllDep.checkBox.isSelected();
            //System.out.println(driver.findElements(By.xpath("//*[@id=searchDropdownBox]/option[21]")).get(i).getAttribute("Computers"));
    }

    @Then("computer page should displayed")
    public void computer_page_should_displayed() {


    }

    }



