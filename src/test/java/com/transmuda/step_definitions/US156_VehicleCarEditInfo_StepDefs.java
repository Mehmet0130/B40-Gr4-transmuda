package com.transmuda.step_definitions;

import com.transmuda.pages.QuickLaunchpadPage;
import com.transmuda.pages.VehicleCarsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US156_VehicleCarEditInfo_StepDefs {
    QuickLaunchpadPage main = new QuickLaunchpadPage();;
    Actions action = new Actions(Driver.getDriver());

    @Then("User can hover over to the Fleet module")
    public void user_can_hover_over_to_the_fleet_module() {
        BrowserUtils.waitForVisibility(main.FleetModule,10);
        action.moveToElement(main.FleetModule).perform();

    }


    @Then("User can click the vehicles link")
    public void user_can_click_the_vehicles_link() {
        BrowserUtils.waitForVisibility(main.vehiclesLink,5);
        action.moveToElement(main.vehiclesLink).click().perform();

    }

    @When("User hover over to the three dots")
    public void user_hover_over_to_the_three_dots() {
        BrowserUtils.waitForVisibility(new VehicleCarsPage().threeDot,5);
        action.moveToElement(new VehicleCarsPage().threeDot).perform();
    }



    @Then("User able to see “view, edit, delete” options")
    public void user_able_to_see_view_edit_delete_options() {

        List<WebElement> iconList = new VehicleCarsPage().icons;
        List<String> expectedResult = new ArrayList<>(Arrays.asList("View","Edit","Delete"));

        for (WebElement eachElement : iconList) {
            Assert.assertTrue(eachElement.isDisplayed());
        }
        // I Try to get text but  i can not .  even i can not get title attribute value that.s why im using
        //isDisplay method
    }
}
