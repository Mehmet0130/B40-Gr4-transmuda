package com.transmuda.step_definitions;

import com.transmuda.pages.VehiclePage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US157_VehiclePageStepDefs {

    VehiclePage vehiclePage = new VehiclePage();

    @When("the user navigate to {string} and to {string} module")
    public void the_user_navigate_to_to(String tab, String module) {

        vehiclePage.waitUntilLoaderScreenDisappear();

        vehiclePage.navigateToModule(tab, module);
    }

    @Then("all vehicle checkboxes should be unchecked")
    public void all_vehicle_checkboxes_should_be_unchecked() {

        for (WebElement each : vehiclePage.allCheckBoxes) {

            Assert.assertFalse("Expected checkbox to be unchecked, but it was checked", each.isSelected());

        }
    }


    @Then("the user checks the first checkbox")
    public void the_user_checks_the_first_checkbox() {
        vehiclePage.checkBox.click();
    }

    @Then("all vehicle checkboxes should be checked")
    public void all_vehicle_checkboxes_should_be_checked() {
        vehiclePage.waitUntilLoaderScreenDisappear();

        for (WebElement each : vehiclePage.allCheckBoxes) {

            Assert.assertTrue(each.isSelected());
        }

    }


    @Then("the user checks the checkbox of a specific vehicle")
    public void the_user_checks_the_checkbox_of_a_specific_vehicle() {
        vehiclePage.waitUntilLoaderScreenDisappear();
        vehiclePage.randomCarSelected.click();
    }

    @Then("only that vehicle’s checkbox should be checked")
    public void only_that_vehicle_s_checkbox_should_be_checked() {
        vehiclePage.waitUntilLoaderScreenDisappear();

        int selectedCount = 0;
        for (WebElement each : vehiclePage.allCheckBoxes) {
            if (each.isSelected()) {
                selectedCount++;

            }
        }

        Assert.assertEquals("More than one or none selected", 1, selectedCount);
    }


}
