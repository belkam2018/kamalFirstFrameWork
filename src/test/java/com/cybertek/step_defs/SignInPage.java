package com.cybertek.step_defs;

import com.cybertek.pages.SignIn;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SignInPage {

    SignIn signIn = new SignIn();

    @Given("user on the home page")
    public void user_on_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @When("user click to sign in")
    public void user_click_to_sign_in() throws Exception {

        signIn.signinLoc.click();
        Thread.sleep(6000);



    }

    @Then("sign in page should displayed")
    public void sign_in_page_should_displayed() {

    }

    @When("user logs in using email")
    public void user_logs_in_using_email() {
       signIn.email.sendKeys(ConfigurationReader.getProperty("user_email"));
    }

    @Then("user logs in using password")
    public void user_logs_in_using_password() {
        signIn.password.sendKeys(ConfigurationReader.getProperty("user_password"));
        signIn.clickSign.click();
    }

    @Then("home page should displayed")
    public void home_page_should_displayed() {


    }


}
