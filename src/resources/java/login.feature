Feature: Testing login
Scenario: valid login
Given user is in the login page
When user performs login by adding valid credentials
Then user must be in the home page