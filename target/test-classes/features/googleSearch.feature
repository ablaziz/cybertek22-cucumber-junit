Feature: Google search functionality
  Agile Story: As a use, when i am on the google search page, i should be able
  to search whatever i want, and see relevant information.


  Scenario: Search page title verification
    Given user is on Google hom page
    Then user should see title is Google



  Scenario: User search title verification
    Given user is on Google hom page
    When user searches foe mango
    Then User should see apple in the title

  Scenario: User search title verification
    Given user is on Google hom page
    When user searches foe "mango"
    Then User should see "mango" in the title