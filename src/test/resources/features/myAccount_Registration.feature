Feature: User Registration


Background: Search for TechCircle
			Given user is on practice automating testing site
			
		
Scenario: Registration SignIn
			When user enters new username and password
			And user click on register button
			Then user should be able to register
			
			
Scenario: Invalid Email
			When user enters invalid email and valid password
			And user click on register button
			Then user should see invalid error message
			
			
