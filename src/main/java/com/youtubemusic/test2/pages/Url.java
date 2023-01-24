package com.youtubemusic.test2.pages;

import com.youtubemusic.test2.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Url {
    private WebDriver driver;

    public Url() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[1]/yt-formatted-string")
    WebElement txtValidUrl;

    @FindBy(xpath = "//*[@id=\"main-message\"]/h1")
    WebElement txtInvalidUrl;


    public String getTxtValidUrl() {
        return txtValidUrl.getText();
    }

    public String getTxtInvalidUrl() {
        return txtInvalidUrl.getText();
    }



}


