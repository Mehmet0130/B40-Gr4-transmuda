package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[normalize-space()='Vehicle Odometer']")
    public WebElement odometerButton;

    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement errorMessage;


    @FindBy(xpath = "//input[@value='1']")
    public WebElement pageNumber;
    public int getPageNumber() {
        String text = pageNumber.getAttribute("value");
        if(text == (null) || text.trim().isEmpty()){
            text = pageNumber.getText();
        }
        return Integer.parseInt(text.trim());
    }

    @FindBy(xpath = "//button[normalize-space()='25']")
    public WebElement viewPageNumber;
    public int getViewPageNumber() {
        String text = viewPageNumber.getText().trim();
        return Integer.parseInt(text);
    }


}
