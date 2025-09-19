package com.transmuda.step_definitions;

import com.transmuda.pages.CalendarEventPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US158_CalendarEventStepDefs {

    CalendarEventPage calendarEventPage = new CalendarEventPage();

    @Given("the user is on the Calendar Event creation page")
    public void the_user_is_on_the_calendar_event_creation_page() {
        BrowserUtils.waitFor(5);
        BrowserUtils.hover(calendarEventPage.activitiesMenu);
        BrowserUtils.waitFor(1);
        calendarEventPage.calendarEventsButton.click();
        BrowserUtils.waitFor(5);
        calendarEventPage.createEventsButton.click();
    }

    @When("the user opens the Repeat options")
    public void the_user_opens_the_repeat_options() {
        BrowserUtils.waitFor(3);
        calendarEventPage.repeatCheckbox.click(); // example
    }

    @Then("the Repeat Every field should have the default value {string}")
    public void theRepeatEveryFieldShouldHaveTheDefaultValue(String expectedValue) {
        BrowserUtils.waitFor(3);
        String actualValue = calendarEventPage.repeatInputBox.getAttribute("value").trim();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @When("the user clears the Repeat Every field")
    public void theUserClearsTheRepeatEveryField() {
        BrowserUtils.waitFor(3);
        calendarEventPage.repeatInputBox.clear();
    }

    @Then("the user should see an error message {string}")
    public void the_user_should_see_an_error_message(String expectedMessage) {
        BrowserUtils.waitFor(3);
        String actualMessage = calendarEventPage.errorMessage.getText().trim();
        Assert.assertEquals("Error message mismatch!", expectedMessage, actualMessage);
    }



}
