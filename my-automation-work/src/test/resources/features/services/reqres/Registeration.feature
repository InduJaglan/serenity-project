Feature: Register

  Scenario: Do registration
    When I sends request to do registration
    Then I see response for successful registration