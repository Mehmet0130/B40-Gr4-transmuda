Feature: Access to main modules of the application

  As a user,
  I should be able to access all the main modules of the app
  So that I can perform my role-based tasks

  @Store_Modules
  Scenario: Store Manager should see 8 modules
    Given the user is logged in as a Store manager
    When the user views the main menu
    Then the user should see "8" modules
    And the modules should be displayed as: "Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System"


  @Sales_Modules
  Scenario: Sales Manager should see 8 modules
    Given the user is logged in as a Sales manager
    When the user views the main menu
    Then the user should see "8" modules
    And the modules should be displayed as: "Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System"


  @Driver_Modules
  Scenario: Driver should see 4 modules
    Given the user is logged in as a Driver
    When the user views the main menu
    Then the user should see "4" modules
    And the modules should be displayed as: "Fleet, Customers, Activities, System"
