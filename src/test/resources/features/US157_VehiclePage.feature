@Aliya
Feature: Vehicle Selection on Vehicles Page

  As a Sales and Store Manager
  I want to be able to select vehicles using checkboxes
  So that I can manage and take actions on selected vehicles


  @US157AC01
  Scenario Outline: Verify that once the users launch on the Vehicles page
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" and to "Vehicles" module
    Then all vehicle checkboxes should be unchecked
    Examples:
      | userType      |
      | sales manager |
      | store manager |


  @US157AC02
  Scenario Outline: Verify that selecting the first checkbox selects all vehicles
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" and to "Vehicles" module
    Then the user checks the first checkbox
    Then all vehicle checkboxes should be checked

    Examples:
      | userType      |
      | sales manager |
      | store manager |


  @US157AC03
  Scenario Outline: Verify that the user can select an individual vehicle
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" and to "Vehicles" module
    Then the user checks the checkbox of a specific vehicle
    Then only that vehicle’s checkbox should be checked

    Examples:
      | userType      |
      | sales manager |
      | store manager |