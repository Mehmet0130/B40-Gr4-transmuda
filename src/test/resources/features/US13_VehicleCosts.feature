Feature: Users should be able to login
  User Story:
  As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox)
  Accounts are: Store managers and Sales managers

  @loginAsStoreManager
  Scenario: Login as store manager
    Given user is on the login page
    When user enters the store manager information
    Then user should be able to login

  @loginAsSalesManager
  Scenario: Login as sales manager
    Given user is on the login page
    When user enters the sales manager information
    Then user should be able to login