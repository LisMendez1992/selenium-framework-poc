Feature: Client sign up

  @run
  Scenario: client sign up successfully
    Given Client wants to have an account
    When Client sends required information to get the account
    Then Client should be told that the account was created