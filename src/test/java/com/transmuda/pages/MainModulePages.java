package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainModulePages {


    public MainModulePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li/a/span[@class='title title-level-1']")
    public List<WebElement> allModules;

    public List<String> getAllModuleNames() {
        List<String> moduleNames = new ArrayList<>();
        for (WebElement each : allModules) {
            moduleNames.add(each.getText().trim());
        }
        return moduleNames;
    }
}
