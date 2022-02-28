Feature: to personal cabinet
  Scenario: login to kpfu site
    Given an open browser with main_url
    When click login button
    And enter a login in login input field
    And enter a password in password input field
    Then site link must starts with shelly_url

  Scenario: to personal cabinet
    Given site link is shelly_url
    When click academic performance button
    Then site link is academic_performance_url