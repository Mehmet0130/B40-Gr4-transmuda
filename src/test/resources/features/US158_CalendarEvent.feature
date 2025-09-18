@wip_bakhrom4
Feature: Recurring Calendar Event
  As a user
  I want to create a recurring (repetitive) calendar event
  So that I can set events to repeat automatically


  Scenario Outline: Default value in Repeat Every input should be 1
    Given user is on the login page
    When the user logged in as "<userType>"
    And user should be able to login
    And the user is on the Calendar Event creation page
    When the user opens the Repeat options
    Then the Repeat Every field should have the default value "1"
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


  Scenario Outline: Error message when Repeat Every input is cleared
    Given user is on the login page
    When the user logged in as "<userType>"
    And user should be able to login
    And the user is on the Calendar Event creation page
    When the user opens the Repeat options
    When the user clears the Repeat Every field
    Then the user should see an error message "This value should not be blank."
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |