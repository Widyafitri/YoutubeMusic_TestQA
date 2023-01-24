Feature: Explore


  Scenario: TC.004 User wants to see new releases
    When TC.004 User goes to explore page
    And TC.004 Click the new release button
    Then TC.004 New releases are shown

  Scenario: TC.005 User want to see global top chart
    When TC.005 User goes to explore page
    And TC.005 Click chart button
    And TC.005 User selects a chart category
    And TC.005 select the global category
    And TC.005 Click top music video
    Then TC.005 Top 100 Music Videos Global are shown

  Scenario: TC.006 User want to see Sweethearts & Romance Genres
    When TC.006 User goes to explore page
    And TC.006 Click moods and genres button
    And TC.006 Click romance button
    And TC.006 Click sweethearts and romance
    Then TC.006 Sweethearts and romance shown


