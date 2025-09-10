package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class US13_VehicleCostsStepDefs {

    LoginPage loginPage = new LoginPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);
//        Assert.assertTrue(Driver.getDriver().getTitle().contains("Login"));
    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));
        BrowserUtils.sleep(3);
    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.sleep(3);
    }

    @When("user enters the managers {string} and {string} information")
    public void userEntersTheManagersAndInformation(String username, String password) {
        loginPage.login(username, password);
        BrowserUtils.sleep(3);
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        BrowserUtils.sleep(10);
//        Alert alert = Driver.getDriver().switchTo().alert();
//        alert.accept();
//        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }


    @And("user clicks Fleet option from top menu")
    public void userClicksFleetOptionFromTopMenu() {
        vehicleCostsPage.fleetButton.click();
        BrowserUtils.sleep(3);

    }

    @Then("user selects Vehicle Cost option from Fleet menu")
    public void userSelectsVehicleCostOptionFromFleetMenu() {
        actions.moveToElement(vehicleCostsPage.fleetButton)
                .click(vehicleCostsPage.vehicleCostsButton)
                .build()
                .perform();

        BrowserUtils.sleep(3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Vehicle Costs"));
    }

}
