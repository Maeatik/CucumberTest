Feature: to personal cabinet
  Scenario: login to kpfu site
    Given an open browser with main_url
    When click login button
    And enter a login in login input field
    And enter a password in password input field
    Then site link must starts with shelly_url

  Scenario: to personal cabinet
    Given site link is shelly_url
    When click personal cabinet button
    Then site link is stud_anketa_url