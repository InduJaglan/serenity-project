Feature: Create User

  Scenario: create user with valid date
    When I send request to create user with valid data
      | name          | job              |
      | Sandeep Kumar | Lead QA Engineer |
    Then I can see created user data in to response