package com.youtubemusic.test2.pages;

import com.youtubemusic.test2.driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"placeholder\"]")
    WebElement btnSearch;

    @FindBy(xpath = "//input[@id='input']")
    WebElement inputSearch;

    @FindBy(xpath = "//*[@id=\"suggestion-cell-0x0\"]/span")
    WebElement enter;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-responsive-list-item-renderer[1]/div[2]/div[1]/yt-formatted-string/a")
    WebElement showSong;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-responsive-list-item-renderer[1]/div[2]/div[1]/yt-formatted-string/a")
    WebElement playSong;

    @FindBy(xpath = "//*[@id=\"tabsContent\"]/tp-yt-paper-tab[2]")
    WebElement btnLyrics;

    public void clickBtnSearch() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSearch);
    }

    public void searchInput(String searchInput) {this.inputSearch.sendKeys(searchInput);}

    public void pressEnter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", enter);
    }

    public String getTxtSong() {
        return showSong.getText();
    }

    public void setPlaySong(){ playSong.click();}

    public void showLyrics(){ btnLyrics.click();}


}
