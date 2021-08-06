Feature: Wikipedia search functionality
  As a user, I should be able to search terms and see relevant information
  Case: Search for "Steve Jobs", the title, the header, and the image header
  should be displayed as "Steve Jobs".

  Scenario: : Wikipedia Search Functionality Title Verification
    Given is on Wikipedia home page
    When types Steve Jobs in the wiki search box
    And clicks wiki search button
    Then sees Steve Jobs is in the wiki title