Feature: Get cart
  As a user
  I want to get my cart
  So I can manage my cart

  Scenario: get all cart
    Given I set url get all cart
    When I request with valid url get all
    Then I get status code 200

