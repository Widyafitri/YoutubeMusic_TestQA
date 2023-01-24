package com.youtubemusic.test2.pages;

import com.youtubemusic.test2.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {
    private WebDriver driver;

    public LibraryPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[3]/yt-formatted-string")
    WebElement libraryPage;

    @FindBy(xpath = "//*[@id=\"chips\"]/ytmusic-chip-cloud-chip-renderer[1]/div/a")
    WebElement btnPlaylist;

    @FindBy(xpath = "//*[@id=\"img\"]")
    WebElement addNewPlaylist;

    @FindBy(xpath = "//*[@id=\"input-2\"]/input")
    WebElement playlistTitle;

    @FindBy(id = "textarea")
    WebElement playlistDesc;

    @FindBy(id = "button")
    WebElement btnCreate;

    @FindBy(id = "//*[@id=\"header\"]/ytmusic-editable-playlist-detail-header-renderer/ytmusic-detail-header-renderer/div/div[2]/h2/yt-formatted-string")
    WebElement txtMyPlaylist;


    public void clickLibraryPage() {
        libraryPage.click();
    }

    public void clickBtnPlaylist() {
        btnPlaylist.click();
    }

    public void addPlaylist() {
        addNewPlaylist.click();
    }

    public void createPlaylist(String playlistTitle, String playlistDesc){
        this.playlistTitle.sendKeys(playlistTitle);
        this.playlistDesc.sendKeys(playlistDesc);

    }

    public void btnCreateClick() {
        btnCreate.click();
    }

    public String getTxtMyPlaylist() {
        return txtMyPlaylist.getText();
    }

}
