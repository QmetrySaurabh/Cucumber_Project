Feature: Banking
  As a user
  I want to make an ATM Transaction
    
    @requirementEntityKey=NFS-RQ-11
    Scenario: Withdraw less money
    Given I have $1200 on my account
    When I withdraw $800
    Then I get $800 from the ATM
    
    @requirementEntityKey=NFS-RQ-11
    Scenario: Withdraw more money
 	Given I have $300 on my account
	When I withdraw $400
	Then I get $400 from the ATM
    
    @requirementEntityKey=NFS-RQ-11
	Scenario Outline: Withdraw money from the account
 	Given I have $<balance> on my account
	When I withdraw $<withdraw>
	Then I get $<received> from the ATM

 	Examples:
	| balance| withdraw | received |
	| 200 | 100 | 100 |
	| 400 | 50 | 35 |
	| 500 | 40 | 20 |