Feature: Test Tendable Application

  Scenario: Test Contact us fuctionality
    When User click on the Contact Us link,
    And click on Marketing link User enter Full name , organisation Name ,phone Number, Email,Job role
    Then click on agree and click On submit button

    
    
    
    
    
   # Navigate to the "Contact Us" section,
   # choose "Marketing", 
   # and complete the form— excluding the "Message" field. On submission, 
   # an error should arise. Ensure your script confirms the error message's appearance. 
   # If the error is displayed, mark the test as PASS. If absent, it's a FAIL. 
    