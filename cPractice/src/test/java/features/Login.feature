Feature: Application Login

Scenario: Home page default login

Given user is on lading page
When user login into application with "venkat" and "venkat"
Then homepage will be displayed
And all the details are displayed
