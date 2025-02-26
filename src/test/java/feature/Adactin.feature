Feature: Adactin Hotel Booking

  Scenario: User successfully books a hotel
    Given  launch the Adactin application
   
    When  enter username and password 
    And  search for a hotel 
    And  select a hotel and proceed
    And  enter booking details 
    Then  should see the booking confirmation
