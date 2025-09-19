package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventPage {

    public CalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activitiesMenu;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventsButton;

    @FindBy(xpath = "//a[normalize-space()='Create Calendar event']")
    public WebElement createEventsButton;

//    @FindBy(id = "recurrence-repeat-view1298")
    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckbox;

//    @FindBy(name = "temp-validation-name-1322")
    @FindBy(xpath = "(//label[@data-role='control-section-switcher']//input[@data-related-field='interval'])[1]")
    public WebElement repeatInputBox;

    @FindBy(xpath = "//span[normalize-space(text())='This value should not be blank.']")
    public WebElement errorMessage;

}
