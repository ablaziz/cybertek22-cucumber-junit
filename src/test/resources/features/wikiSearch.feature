Feature: Wikipedia search functionality
  As a user, I should be able to search terms and see relevant information
  Case: Search for "Steve Jobs", the title, the header, and the image header
  should be displayed as "Steve Jobs".

  Scenario: : Wikipedia Search Functionality Title Verification
    Given user is on Wikipedia home page
    When user types "Lionel Messi" in the wiki search box
    And user clicks wiki search button
    Then user sees "Lionel Messi" is in the wiki title

    Scenario: Wikipedia Search Functionality Header Verification
      Given user is on Wikipedia home page
      When user types "Steve Jobs" in the wiki search box
      And user clicks wiki search button
      Then User sees "Steve Jobs" is in the main header
  @wip
    Scenario: Wikipedia Search Functionality Image Header Verification
      Given user is on Wikipedia home page
      When user types "Steve Jobs" in the wiki search box
      And user clicks wiki search button
      Then User sees "Steve Jobs" is in the image header
