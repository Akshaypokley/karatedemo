#Feature: Login Action
#
#Scenario: Successful Login with Valid Credentials
# Given User is on Home Page
# When User Navigate to LogIn Page
#  And User enters UserName and Password
#Then Message displayed Login Successfully
#
#  * User is on Home Page
#  * User Navigate to LogIn Page
#* User enters UserName and Password
#  * Message displayed Login Successfully
#


#\\1.Parameterizing the UserName and Password.
#
#Feature: Login Action
#
#  Scenario: Successful Login with Valid Credentials
#    Given User is on Home Page
#    When User Navigate to LogIn Page
#    And User enters "Akshay85" and "Akshay85@gmail.co"
#    Then Message displayed Login Successfully
#


#  *******Data Driven Testing Using Examples Keyword


#
#Feature: Login Action
#
#  Scenario Outline: Successful Login with Valid Credentials
#    Given User is on Home Page
#    When User Navigate to LogIn Page
#    And User enters "<username>" and "<password>"
#    Then Message displayed Login Successfully
#    Examples:
#      | username   | password |
#      | Akshay85 | Akshay85@gmail.co |
#      | Aks | Test@153 |
#
#   **** Data table in cucuber


#Feature: Login Action
#
#  Scenario: Successful Login with Valid Credentials
#    Given User is on Home Page
#    When User Navigate to LogIn Page
#    And User enters Credentials to LogIn
#      | Akshay85 | Akshay85@gmail.co |
#    Then Message displayed Login Successfully

#----------------Maps in Data Tables & Maps in Data Tables with Header
#Feature: Login Action
#Scenario: Successful Login with Valid Credentials
#Given User is on Home Page
#When User Navigate to LogIn Page
#And User enters Credentials to LogIn
#| Username   | Password |
#| Akshay85 | Akshay85@gmail.co |
#| Akshay85 | Akshay85@gmil.co |
#
#Then Message displayed Login Successfully




  @FunctionalTest
  Feature: ECommerce Application

  @SmokeTest @RegressionTest
  Scenario: Successful Login
    Given This is a blank test

  @RegressionTest
  Scenario: UnSuccessful Login
    Given This is a blank test

  @SmokeTest
  Scenario: Add a product to bag
    Given This is a blank test

  Scenario: Add multiple product to bag
    Given This is a blank test

  @SmokeTest @RegressionTest
  Scenario: Remove a product from bag
    Given This is a blank test

  @RegressionTest
  Scenario: Remove all products from bag
    Given This is a blank test

  @SmokeTest
  Scenario: Increase product quantity from bag page
    Given This is a blank test

  Scenario: Decrease product quantity from bag page
    Given This is a blank test

  @SmokeTest @End2End
  Scenario: Buy a product with cash payment
    Given This is a blank test

  @SmokeTest @End2End
  Scenario: Buy a product with CC payment
    Given This is a blank test

  @End2End
  Scenario Outline: Payment declined
    Given This is a blank test
    Examples:
      |PaymentMethod|
      |CC Card|
      |DD Card|
      |Bank Transfer|
      |PayPal|
      |Cash|