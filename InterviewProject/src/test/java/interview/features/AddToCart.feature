Feature: Add to cart

  As a user I want to be able to add product to cart.

  Background: User is on Landing Page and can Login
    Given User site is loaded successfully
    And User enter username
    And User enter password
    And User is logged in

    @AddItemToCart
    Scenario: Add item to cart
      When User select two items
      And User is on cart
      Then Added items should show in the cart