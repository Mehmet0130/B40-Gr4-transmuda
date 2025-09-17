package com.transmuda.step_definitions;

import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US161_VehicleOdometerStepDefs {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();


    @When("user clicks on the Vehicle Odometer module")
    public void user_clicks_on_the_vehicle_odometer_module() {
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.hover(vehicleOdometerPage.fleetButton);
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.odometerButton.click();
    }

    @Then("user should see the error message {string}")
    public void user_should_see_the_error_message(String expectedErrorMessage) {
        String actualMessage = vehicleOdometerPage.errorMessage.getText();
        Assert.assertEquals("You do not have permission to perform this action.", expectedErrorMessage, actualMessage);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {
        BrowserUtils.waitForPageToLoad(5);
        int actualPageNumber = vehicleOdometerPage.getPageNumber();
        Assert.assertEquals(expectedPageNumber.intValue(), actualPageNumber);
    }


    @Then("default View Per Page value should be {int}")
    public void defaultViewPerPageValueShouldBe(int expectedPageValue) {
        BrowserUtils.waitForPageToLoad(5);
        int actualValue = vehicleOdometerPage.getViewPageNumber();
        Assert.assertEquals(expectedPageValue, actualValue);
    }
}
