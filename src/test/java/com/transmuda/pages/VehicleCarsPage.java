package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCarsPage {

    public VehicleCarsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//table//tr//td[.='4WBC865']/following-sibling::td[19]")
    public WebElement threeDot;

 @FindBy(xpath = "//table//tr//td[.='4WBC865']/following-sibling::td[19]//li[@class='launcher-item']/a")
 public List<WebElement> icons;

}
