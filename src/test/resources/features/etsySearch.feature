Feature: Etsy search feature


  Scenario: Etsy default title verification
    Given user is on the Etsy lending page
    Then user should see Etsy title as expected

    # Expected title : Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
  @wip
  Scenario: Etsy Search Functionality Title Verification
    Given user is on the Etsy lending page
    When user types Wooden Spoon in the search box
    And user clicks to search button
    Then use sees title is Wooden spoon | Etsy