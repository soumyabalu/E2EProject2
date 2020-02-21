Feature: Booking Flight


Scenario: langing on the homepage
Given initialize chromeDriver
And the user hit the "http://www.spicejet.com" website
When the user finish performing  all the actions
Then verify the navigation
