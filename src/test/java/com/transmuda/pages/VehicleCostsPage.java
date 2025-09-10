package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage {

    public VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[normalize-space()='Vehicle Costs']")
    public WebElement vehicleCostsButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement checkbox;

}
