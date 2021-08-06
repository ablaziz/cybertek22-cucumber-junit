package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinition {
WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }
    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
    wikiSearchPage.searchBox.sendKeys("Steve Jobs");
    }
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
    wikiSearchPage.searchButton.click();
    }
    @Then("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
    String actualTitle = Driver.getDriver().getTitle();
    String expectedTitle = "Steve Jobs - Wikipedia";

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
    }
}
