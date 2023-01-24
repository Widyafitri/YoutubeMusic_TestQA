package com.youtubemusic.test2.utils;

public enum TestScenarios {

    //URL
    T1("TC.001 As a user I want to access URL"),
    T2("TCC.002 User wants to search for a song"),
    T3("TC.003 User want to create a playlist"),
    T4("TC.004 User wants to see new releases"),
    T5("TC.005 User want to see global top chart"),
    T6("TC.006 User want to see Sweethearts & Romance Genres");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}
