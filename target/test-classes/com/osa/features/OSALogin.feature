Feature: OSA osaconsultingtech Forum Login Varification


 

Scenario: As a osa Student, i should be able to verify login with valid username and password
Given i am initialing the Chrome Browser
And i am open URL OSA Homepage from "https://osaconsultingtech.com/"
And i am clicking on froum button
And i am entered my UserName 
And i am Entered my password 
When I click on login button
Then Successfully Login verified
And user full name displayed on console. 

