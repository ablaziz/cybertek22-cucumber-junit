package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
       String actualTitle = Driver.getDriver().getTitle();
       String exceptedTitle = "Google";

       Assert.assertTrue(actualTitle.equals(exceptedTitle));
    }

    @Given("user is on Google hom page")
    public void user_is_on_google_hom_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("user searches foe apple")
    public void user_searches_foe_apple() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);

    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

}
