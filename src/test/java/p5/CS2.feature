Feature: Test me application
Scenario: Register

			Given User navigates to URL
			And enter "<username>","<firstname>","<lastname>","<password>","<confirmpassword>","<gender>","<emailaddress>","<mobilenumber>","<dob>","<address>","<securityQuestion>","<answer>"
			Then user click on register
			Then click All-categories
			And click add to cart
			
  
   | username |firstname |lastname  |password |confirmpassword |gender  |emailaddress |mobilenumber |dob  |address |answer  |
  
   |Ashwini   |Subburaj  |Ashu      |1234     |1234            |female  |abc@gmail.com|9876543210   |09-12-1998|xyz|Ashu|   