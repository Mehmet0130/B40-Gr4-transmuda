package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US163_VehicleCostsStepDefs {

    LoginPage loginPage = new LoginPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(3);
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
        BrowserUtils.waitFor(5);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }


    @Then("user selects Vehicle Cost option from Fleet menu")
    public void userSelectsVehicleCostOptionFromFleetMenu() {
        BrowserUtils.waitFor(5);
        BrowserUtils.hover(vehicleCostsPage.fleetButton);
        vehicleCostsPage.vehicleCostsButton.click();

        BrowserUtils.sleep(3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Vehicle Costs"));
    }



    @Then("user sees expected list of columns")
    public void userSeesExpectedColumns(DataTable dataTable) {
        List<String> expectedColumns = dataTable.asList();
        List<String> actualColumns = vehicleCostsPage.getColumnNames();
        Assert.assertEquals(actualColumns, expectedColumns);
    }

    @Then("user should select checkbox to select All vehicle Costs")
    public void userShouldSelectCheckboxToSelectAllVehicleCosts() {
        vehicleCostsPage.checkbox.click();
        boolean checked = vehicleCostsPage.checkbox.isSelected();

        Assert.assertTrue(checked);
    }
}
