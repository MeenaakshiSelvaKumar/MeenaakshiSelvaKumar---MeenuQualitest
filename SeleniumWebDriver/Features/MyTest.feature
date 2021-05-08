#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


  @loginToordertshirt
  Scenario: SignIn
    Given I want to login into automation practice website
    When I login select women link
    And order 2 L size tshirts
    And select color
    And add to cart
    Then Make payment
    And confirm the success message
    And verify the complete purchase
    

    Examples: 
      | bs.meenaakshi@gmail.com  | Meenaakshi31 | success  |
