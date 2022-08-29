Feature: Add New Payee Functionality

  Background:
    Given User navigate to website
    When User enter valid "username" and "password"
    Then User should login successfully
    And User navigate to online banking page
    When Click pay bills module
    Then Click add new payee module

  Scenario Outline: Add New Payee as positive test

    When User enter "<payeeName>" and "<payeeAddress>"and "<account>" and "<payeeDetails>"
    Then Success message should be displayed

    Examples:
      | payeeName | payeeAddress | account         | payeeDetails |
      | user1     | 1234 Blvd    | Bank of America | $Rich        |

  Scenario Outline: Add New Payee as negative test

    When User enter "<payeeName>" or "<payeeAddress>" or "<account>" or "<payeeDetails>"
    Then User should be on the same page

    Examples:
      | payeeName | payeeAddress | account         | payeeDetails |
      |           | 1234 Blvd    | Bank of America | $Rich        |
      | user1     |              | Bank of America | $Rich        |
      | user1     | 1234 Blvd    |                 | $Rich        |
