Feature: Purchase Foreign Currency Functionality Test

  Background:
    Given User navigate to website
    When User enter valid "username" and "password"
    Then User should login successfully
    And User navigate to online banking page
    When Click pay bills module
    Then Click purchase foreign currency

  Scenario Outline: Purchase foreign currency cash as positive test

    When User select a currency
    When User enter amount "<currAmount>"
    Then User select a USD button
    Then Click calculate the cost
    And  Conversion Amount should be displayed
    When Click purchase button
    Then Success message should be displayed

    Examples:
      | currAmount |
      | 13         |

  Scenario Outline: Purchase foreign currency cash as negative tests

    When Click purchase button
    And  Alert message should be pop-up

    When User did not select a currency
    When User enter amount "<currAmount>"
    Then Click calculate the cost
    And  Alert message should be pop-up

    When Click purchase button
    And  Alert message should be pop-up

    When User select a currency
    When User did not enter amount "<currAmount>"
    Then Click calculate the cost
    And  Alert message should be pop-up

    When Click purchase button
    And  Alert message should be pop-up

    When User select a currency
    Then User did not select a USD button
    Then Click calculate the cost
    And  Alert message should be pop-up

    When Click purchase button
    And  Alert message should be pop-up

    Examples:
      | currAmount |
      |     aew    |
      |     $26    |
      |            |

