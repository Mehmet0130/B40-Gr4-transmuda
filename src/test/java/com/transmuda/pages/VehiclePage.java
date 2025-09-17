package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclePage extends BasePage {

    @FindBy(xpath = "//thead//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    public List<WebElement> allCheckBoxes;

    @FindBy(xpath = "(//tbody//input[@type='checkbox'])[3]")
    public WebElement randomCarSelected;
}
