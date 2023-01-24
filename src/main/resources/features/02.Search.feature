Feature: Search


  Scenario: TC.002 User wants to search for a song
    When TC.002 Click on search
    And TC.002 Type the title of the song or singer you want to search for
    And TC.002 User press enter
    Then TC.002 shows song selection

  Scenario: TC.003 User wants to play song and display lyrics
    When TC.003 Click song to play
    And TC.003 Click the lyrics button to display it
    Then TC.003 the lyrics are displayed
