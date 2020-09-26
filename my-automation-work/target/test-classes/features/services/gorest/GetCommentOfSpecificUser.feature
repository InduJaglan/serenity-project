Feature: Get comment of specific user

  @api
  Scenario: Get specific user comment
    When I send request to get comment
    Then I can see all comment of specific user