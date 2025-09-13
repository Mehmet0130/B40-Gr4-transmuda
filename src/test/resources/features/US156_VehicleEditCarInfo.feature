@ablimit
Feature: Edit car info icons visibility on the Vehicles page
  User Story:  As a user, I want to see edit car info icons from the Vehicles page.


  Scenario: Login as a Truck Driver
    Given the user logged in as "driver"
    Then User can hover over to the Fleet module
    And  User can click the vehicles link
    When User hover over to the three dots
    Then User able to see “view, edit, delete” options

  Scenario: Login as a Store Manager
    Given the user logged in as "store manager"
    Then User can hover over to the Fleet module
    And  User can click the vehicles link
    When User hover over to the three dots
    Then User able to see “view, edit, delete” options

  Scenario: Login as a Sales Manager
    Given the user logged in as "sales manager"
    Then User can hover over to the Fleet module
    And  User can click the vehicles link
    When User hover over to the three dots
    Then User able to see “view, edit, delete” options