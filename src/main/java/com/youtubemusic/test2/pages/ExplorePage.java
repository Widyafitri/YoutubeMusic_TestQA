package com.youtubemusic.test2.pages;

import com.youtubemusic.test2.driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorePage {

    private WebDriver driver;

    public ExplorePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]/yt-formatted-string")
    WebElement explorePage;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[1]/button")
    WebElement btnNewReleases;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-header-renderer/h2/yt-formatted-string")
    WebElement txtNewReleases;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[2]/button")
    WebElement btnCharts;

    @FindBy(xpath = "//*[@id=\"button\"]/yt-formatted-string")
    WebElement btnChartsCategory;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-multi-select-menu-item-renderer[2]/button")
    WebElement globlChartBtn;

    @FindBy(xpath = "//*[@id=\"details\"]/yt-formatted-string/a\n")
    WebElement showTopMusicVideo;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-detail-header-renderer/div/div[2]/h2/yt-formatted-string")
    WebElement txtTopGloblMusicVideo;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[3]/button/yt-formatted-string")
    WebElement btnMoodGendre;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[7]/button")
    WebElement btnRomance;

    @FindBy(xpath = "//*[@id=\"details\"]/yt-formatted-string/a")
    WebElement clickSweetRomance;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-grid-header-renderer/yt-formatted-string")
    WebElement txtSpotlight;

    public void clickExplorePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", explorePage);
    }

    public void clickBtnNewReleases() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnNewReleases);
    }

    public void clickBtnCharts() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnCharts);
    }

    public void clickChartsCategory() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnChartsCategory);
    }

    public void clickGloblChart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", globlChartBtn);
    }

    public void clickTopMusicVideo() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", showTopMusicVideo);
    }

    public void clickBtnMoodGenre() {btnMoodGendre.click();}

    public void clickBtnRomance() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnRomance);
    }

    public void clickSweetRomance() {clickSweetRomance.click();}

    public String getTxtNewReleases() {return txtNewReleases.getText();}

    public String getTxtTopGloblMusicVideo() {return txtTopGloblMusicVideo.getText();}

    public String getTxtSweetRomance() {return txtSpotlight.getText();}

}
