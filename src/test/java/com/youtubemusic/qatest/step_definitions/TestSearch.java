package com.youtubemusic.qatest.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.youtubemusic.test2.pages.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.youtubemusic.qatest.step_definitions.Hooks.delay;

public class TestSearch {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Search search = new Search();

    public TestSearch() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Search a Song
    @When("TC.002 Click on search")
    public void click_on_search_song() {
        search.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "TC.002 Click on search");
    }

    @And("TC.002 Type the title of the song or singer you want to search for")
    public void type_the_song_title() {
        search.searchInput("until i found you");
        extentTest.log(LogStatus.PASS, "TC.002 Type the title of the song or singer you want to search for");
    }

    @And("TC.002 User press enter")
    public void admin_klik_button_simpan_status_no_active() {
        delay(2);
        search.pressEnter();
        extentTest.log(LogStatus.PASS, "TC.002 User press enter");
    }

    @Then("TC.002 shows song selection")
    public void user_berhasil_mengakses_web() {
        Assert.assertEquals(search.getTxtSong(), "Until I Found You (Em Beihold Version)");
        extentTest.log(LogStatus.PASS, "TC.002 shows song selection");
    }

    // Play a song
    @When("TC.003 Click song to play")
    public void click_song_to_play() {
        search.setPlaySong();
        extentTest.log(LogStatus.PASS, "TC.003 Click song to play");
    }

    @And("TC.003 Click the lyrics button to display it")
    public void click_to_display_lyrics() {
        search.showLyrics();
        extentTest.log(LogStatus.PASS, "TC.003 Click the lyrics button to display it");
    }

    @Then("TC.003 the lyrics are displayed")
    public void the_lyrics_are_displayed() {
        Assert.assertEquals(search.getTxtSong(), "");
        extentTest.log(LogStatus.PASS, "TC.003 the lyrics are displayed");
    }


}
