package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[position() <= 3]")
    public List<WebElement> columnHeaders;

    public List<String> getColumnNames() {
        List<String> columnNames = new ArrayList<>();
        for (WebElement header : columnHeaders) {
            columnNames.add(header.getText().trim());
        }
        return columnNames;
    }

}
