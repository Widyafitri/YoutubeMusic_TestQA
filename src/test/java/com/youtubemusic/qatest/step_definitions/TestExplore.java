package com.youtubemusic.qatest.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.youtubemusic.test2.pages.ExplorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestExplore {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ExplorePage explorePage = new ExplorePage();

    public TestExplore() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TC.004 User goes to explore page")
    public void user_goes_to_explore_page_new_release() {
        explorePage.clickExplorePage();
        extentTest.log(LogStatus.PASS, "TC.004 User goes to explore page");
    }

    @And("TC.004 Click the new release button")
    public void click_the_new_release_button() {
        explorePage.clickBtnNewReleases();
        extentTest.log(LogStatus.PASS, "TC.004 Click the new release button");
    }

    @Then("TC.004 New releases are shown")
    public void new_releases_are_shown() {
        Assert.assertEquals(explorePage.getTxtNewReleases(), "New releases");
        extentTest.log(LogStatus.PASS, "TC.004 New releases are shown");
    }

    //charts

    @When("TC.005 User goes to explore page")
    public void user_goes_to_explore_page_chart() {
        explorePage.clickExplorePage();
        extentTest.log(LogStatus.PASS, "TC.005 User goes to explore page");
    }

    @And("TC.005 Click chart button")
    public void type_the_song_title() {
        explorePage.clickBtnCharts();
        extentTest.log(LogStatus.PASS, "TC.005 Click chart button");
    }

    @And("TC.005 User selects a chart category")
    public void user_selects_a_chart_category() {
        Hooks.delay(2);
        explorePage.clickChartsCategory();
        extentTest.log(LogStatus.PASS, "TC.005 User selects a chart categor");
    }

    @And("TC.005 select the global category")
    public void select_global_category() {
        Hooks.delay(2);
        explorePage.clickGloblChart();
        extentTest.log(LogStatus.PASS, "TC.005 select the global category");
    }

    @And("TC.005 Click top music video")
    public void click_top_music_video() {
        Hooks.delay(2);
        explorePage.clickTopMusicVideo();
        extentTest.log(LogStatus.PASS, "TC.005 Click top music vide");
    }

    @Then("TC.005 Top 100 Music Videos Global are shown")
    public void top_music_video_global_shown() {
        Assert.assertEquals(explorePage.getTxtTopGloblMusicVideo(), "Top 100 Music Videos Global");
        extentTest.log(LogStatus.PASS, "TC.005 Top 100 Music Videos Global are shown");
    }

    //Romance genre

    @When("TC.006 User goes to explore page")
    public void user_goes_to_explore_page_moods_genre() {
        explorePage.clickExplorePage();
        extentTest.log(LogStatus.PASS, "TC.006 User goes to explore page");
    }

    @And("TC.006 Click moods and genres button")
    public void click_moods_and_genres() {
        Hooks.delay(2);
        explorePage.clickBtnMoodGenre();
        extentTest.log(LogStatus.PASS, "TC.006 Click moods and genres button");
    }

    @And("TC.006 Click romance button")
    public void click_romance_button() {
        Hooks.delay(2);
        explorePage.clickBtnRomance();
        extentTest.log(LogStatus.PASS, "TC.006 Click romance button");
    }

    @And("TC.006 Click sweethearts and romance")
    public void click_sweetharts_and_romance() {
        explorePage.clickSweetRomance();
        extentTest.log(LogStatus.PASS, "TC.006 Click sweethearts and romance");
    }

    @Then("TC.006 Sweethearts and romance shown")
    public void sweethart_and_romance_shown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        Assert.assertEquals(explorePage.getTxtSweetRomance(), "Spotlight");
        extentTest.log(LogStatus.PASS, "TC.006 Sweethearts and romance shown");
    }


}
