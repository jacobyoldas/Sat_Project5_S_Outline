Feature: Login Functionality

  Scenario : Login with valid username and password as positive test
    Given User navigate to website
    When User enter valid username and password
      | username | username |
      | password | password |
    Then User should login successfully

  Scenario : Login with invalid username or password as negative test
    Given User navigate to website
    When User enter invalid username or invalid password
      | username | aliVeli |
      | password | password |
      | username | username |
      | password | 3424Ali |
      | username | cerDwu |
      | password | 34wAli |
    Then User should NOT login and receive error message


