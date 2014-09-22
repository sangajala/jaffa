
 Feature: Admin can log into the portal
 As A Admin
 I want to Login
 So that I can see the dashboard



Scenario: Admin can login and see welcome message.-Happy path
 

Given Admin is in login page
When  Admin enters 'testlabadmin' as username
And   Admin enters 'Admin1' as password
And   Admin clicks on 'login' button
Then  Admin should login successfully
And   Admin should see 'Welcome Admin' text message,dashboard
