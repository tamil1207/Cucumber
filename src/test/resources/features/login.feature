
Feature: Login

  Background:
	    Given Visit the site
	    
  @login
  Scenario: Login my Id
    And Click login to login
		And Enter the valid user mail
		Then Click continue
		And Eneter Valid Password
		And Click continuess

  @Negative
  Scenario Outline: mutliple logins negavtive and positive
  
  	And Click login to login
		And Enter the valid user "<mail>"
		Then Click continue
		And Eneter Valid "<pass>"
		And Click continue

    Examples: 
      | mail  | pass |
      | anirudhms2912@gmail.com |    @nirudhmS58 |
      | anirudhmsan2912@gmail.com |     andjudem |
