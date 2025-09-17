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

#
#  Scenario: Fleet options verification
#    Given user is on the login page
#    When user enters the sales manager information
#    When user should be able to login
#    And user clicks Fleet option from top menu
#    Then user selects Vehicle Cost option from Fleet menu
#
#  Scenario: Fleet options verification
#    Given user is on the login page
#    When user enters the store manager information
#    When user should be able to login
#    And user clicks Fleet option from top menu
#    Then user selects Vehicle Cost option from Fleet menu



  Scenario Outline: Fleet options verification
    Given user is on the login page
    When user enters the managers "<username>" and "<password>" information
    And user should be able to login
    Then user selects Vehicle Cost option from Fleet menu
    Examples:
      | username        | password    |
      | salesmanager111 | UserUser123 |
      | storemanager75  | UserUser123 |


  @wip_bakhrom
  Scenario Outline: Select All Vehicle Costs verification
    Given user is on the login page
    When the user logged in as "<userType>"
#    When user enters the managers "<username>" and "<password>" information
    And user should be able to login
    And user selects Vehicle Cost option from Fleet menu
    Then user sees expected list of columns
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Then user should select checkbox to select All vehicle Costs
    Examples:
      | userType      |
      | sales manager |
      | store manager |

#    Examples:
#      | username        | password    |
#      | salesmanager111 | UserUser123 |
#      | storemanager75  | UserUser123 |