package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13_VehicleCostsStepDefs {

    LoginPage loginPage = new LoginPage();;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);
        //Assert.assertTrue(Driver.getDriver().getTitle().contains("Login"));
    }
    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        BrowserUtils.sleep(10);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));
    }





}
