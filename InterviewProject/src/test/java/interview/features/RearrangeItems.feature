Feature: Online purchase

  As a user I want to be able to rearrange products from low to high price.

  Background: User is on Landing Page and can Login
    Given User site is loaded successfully
    And User enter username
    And User enter password
    And User is logged in

    @ArrangeItems
    Scenario Outline: User arrange items
      When User select order of arrangement as "<In_order>"
      Then Items are arranged according to the order selected

      Examples:
      | In_order |
      |Price (low to high)|

