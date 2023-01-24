package com.youtubemusic.qatest.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.youtubemusic.test2.pages.Url;
import com.youtubemusic.test2.utils.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestUrl {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Url url = new Url();

    public TestUrl() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //Test Case Open URL
    @When("TC.001 Open youtube music URL")
    public void user_enter_valid_url() {
        driver.get(Constants.VALID_URL);
        extentTest.log(LogStatus.PASS, "TC.001 Open youtube music URL");
    }

    @Then("TC.001 Showing home page")
    public void user_berhasil_mengakses_web() {
        Assert.assertEquals(url.getTxtValidUrl(), "Home");
        extentTest.log(LogStatus.PASS, "TC.001 Showing home page");
    }

}
