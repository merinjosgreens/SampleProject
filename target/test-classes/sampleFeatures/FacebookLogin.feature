Feature: Validation of login page in Facebook Web Application


Scenario: TC01_Validation of error message in Facebooklogin Page when user enters invalid credentials
Given user launch facebook Web Application
When user enters invalid username and invalid password
And user clicks login button
Then user verify error message is displayed or not.



Scenario: TC02_Validation of create new account Block
Given user launch facebook Web Application
When user clicks Create New account button
Then user verify sign up text is displayed 



