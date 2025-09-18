package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.MainModulePages;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.Arrays;
import java.util.List;


public class US151_MainModules {
    LoginPage loginPage = new LoginPage();
    MainModulePages mainModulePage = new MainModulePages();

    @Given("the user is logged in as a Store manager")
    public void the_user_is_logged_in_as_a_store_manager() {
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));
        BrowserUtils.sleep(3);
        
    }

    @Given("the user is logged in as a Sales manager")
    public void the_user_is_logged_in_as_a_sales_manager() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.sleep(3);
       
    }

    @Given("the user is logged in as a Driver")
    public void the_user_is_logged_in_as_a_driver() {
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.sleep(3);
    }



    @When("the user views the main menu")
    public void the_user_views_the_main_menu() {
        BrowserUtils.waitFor(3); 
    }
    @Then("the user should see {string} modules")
    public void the_user_should_see_modules(String expectedCount) {
        int actualCount = mainModulePage.getAllModuleNames().size();
        System.out.println("Actual module count: " + actualCount);
        Assert.assertEquals("Module count mismatch!", Integer.parseInt(expectedCount), actualCount);
    }
    
    @Then("the user should see {int} modules")
    public void the_user_should_see_modules(Integer expectedCount) {
        int actualCount = mainModulePage.getAllModuleNames().size();
        Assert.assertEquals("Module count mismatch!", expectedCount.intValue(), actualCount);
    }

    @Then("the modules should be displayed as: {string}")
    public void the_modules_should_be_displayed_as(String expectedModules) {
        List<String> actualModules = mainModulePage.getAllModuleNames();
        System.out.println("Actual modules: " + actualModules);
        List<String> expectedList = Arrays.asList(expectedModules.split(", "));
        Assert.assertEquals("Module names mismatch!", expectedList, actualModules);
    }

}
