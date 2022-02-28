Feature: download document
  Scenario: login to kpfu site
    Given an open browser with main_url
    When click login button
    And enter a login in login input field
    And enter a password in password input field
    Then site link must starts with shelly_url

  Scenario: to service page
    Given site link is shelly_url
    When click service button
    Then site link must starts with document_url

  Scenario: download document
    Given site link starts with document_url
    When click documents button
    And click pattern button
    And download document
    Then document should contains string "З А Я В Л Е Н И Е"