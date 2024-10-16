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

Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
	 Given I open toolsa portal

  @toolsqa
  Scenario Outline: Textbox feature verification
   
    And I navigate to textbox verification page
    When I enter fullname as "<name>" email as "<email>" current address as "<currAddress>" and permanent address as "permAddress"
    Then I validate text verification
  #  And I close application
    
      Examples: 
      | name  			| email 					 | currAddress  | permAddress |
      | Raj Trpathi | raj123@gmail.com | Bhopal 			|Pune					|	
     # | Rahul Dubey | rahul@gmail.com |  Gwalior 			|Pune					|	

 @toolsqa
  Scenario Outline: Edit Webtable verification
  
    And I navigate to webtable page
    And I click on Edit action button
    And I validate edit screen page
  #  When I enter fullname as "<name>" email as "<email>" current address as "<currAddress>" and permanent address as "permAddress"
    And I close application
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
