package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpadPage {
   public QuickLaunchpadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement FleetModule;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesLink;


}
