Feature: Verify the Currency values on Page1

  Scenario: Verify Values & Total balance on the screen
    Given User able to navigate to required URL
    Then User verifies values on the screen are greater than "0"
    And User verifies total balance is current
    And User verifies Currency is "$" for all the values

