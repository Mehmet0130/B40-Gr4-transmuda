@wip_bakhrom2
Feature: Vehicles Odometers Page Access
  User Story: As a user, I want to view car odometer info on the Vehicles Odometers page.
  So that I can verify permissions and default settings


  Scenario Outline: Store and Sales managers should see permission error
    Given user is on the login page
    When the user logged in as "<userType>"
    And user should be able to login
    And user clicks on the Vehicle Odometer module
    Then user should see the error message "You do not have permission to perform this action."
    Examples:
      | userType      |
      | sales manager |
      | store manager |

  Scenario: Drivers should see default page view as 1
    Given user is on the login page
    When the user logged in as "driver"
    And user should be able to login
    And user clicks on the Vehicle Odometer module
    Then default page number should be 1


  Scenario:  Drivers should see default View Per Page as 25
    Given user is on the login page
    When the user logged in as "driver"
    And user should be able to login
    And user clicks on the Vehicle Odometer module
    Then default View Per Page value should be 25





