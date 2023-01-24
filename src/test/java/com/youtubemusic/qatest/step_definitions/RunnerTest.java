package com.youtubemusic.qatest.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/features/01.Url.feature",
               "src/main/resources/features/02.Search.feature",
                "src/main/resources/features/03.Explore.feature"},
        glue = "com.youtubemusic.qatest.step_definitions",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
