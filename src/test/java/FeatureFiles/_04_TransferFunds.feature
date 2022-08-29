Feature: Transfer Funds Functionality Test

  Background:
    Given User navigate to website
    When User enter valid "username" and "password"
    Then User should login successfully
    And User navigate to online banking page
    When Click pay bills module
    Then Click transfer funds

  Scenario Outline: Transfer Money & Make Payments as positive test

    When User select from account
    When User select to account
    When User enter the amount "<amount>"
    Then User should add description
    Then Click the continue button
    And  User should verify the transfer
    And  Transfer success message should be displayed

    Examples:
      | amount |
      | 13     |

  Scenario Outline: Transfer Money & Make Payments as negative tests

    Then Click the continue button
    Then User should be on still the same page

    When User did not enter the amount "<amount>"
    Then Click the continue button
    Then User should be on still the same page

    Examples:
      | amount |
      |        |
      | asd    |
      | $12    |



