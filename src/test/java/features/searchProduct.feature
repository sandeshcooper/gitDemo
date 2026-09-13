Feature: Search and place the order for vegetables

  Scenario: Search experience for products in both home page and offers page
    Given User is on greencart landing page
    When  User searches with short name "Tom" and extract the product
    Then User go and search the short name "Tom" in offers page to check if the product exists