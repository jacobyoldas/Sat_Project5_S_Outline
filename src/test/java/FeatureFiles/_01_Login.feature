Feature: Login Functionality

  Scenario Outline: Login with valid username and password as positive test
    Given User navigate to website
    When User enter valid "<username>" and "<password>"
    Then User should login successfully

    Examples:
      | username | password |
      | username | password |

  Scenario Outline: Login with invalid username or password as negative test
    Given User navigate to website
    When User enter valid "<username>" or invalid "<password>"
    Then User should NOT login and receive error message

    Examples:
      | username | password   |
      | username | #1234hello |
      | apple    | password   |
      | bee      | chelsea    |

