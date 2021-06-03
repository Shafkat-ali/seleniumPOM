Feature: google search


Background: Search for TechCircle
			Given user is on google site
			
		
Scenario: Search for TechCirlce
			When user searchs for TechCircle in a search bar
			Then search should yield techcircle site as one of the results
			And Blah
			
Scenario: Search for iphone
			When user searchs for iPhone in a search bar
			Then search should yield list of iphones in the results
			
			
