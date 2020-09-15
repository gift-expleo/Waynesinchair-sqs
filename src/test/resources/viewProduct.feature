Feature: View Product

  Scenario: View Product using Open Site URL

    Given I am a Visitor
    When  I navigate to Open Site URL
    And   I search for a product
    Then  The View product list page will be displayed
