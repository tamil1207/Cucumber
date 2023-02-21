
Feature: Sign Up 
  
  Background:
	    Given Visit the site
  @signup
  Scenario: Create an Account

    And Click Signup for free 
		And Enter the valid mail
		  And Click Submit
		Then Click Skip
  

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
