package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(value = "@login",order = 1)
    public void setUpLoginScenario() {
        System.out.println("Before--Setting up browser with further details---");
    }

    @Before
    public void setUpScenario() {
        System.out.println("Before--Setting up browser with further details---");
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        //if scenario fails, TAKE A SCREENSHOT
        //scenario.isFailed(); --> if scenario fails, return true
    if(scenario.isFailed()) {

        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
        System.out.println("After--teardown sets are being applied---");
        //Driver.closeDriver();
    }


    @BeforeStep
    public void setUpStep() {
        System.out.println("---setup applying for each step---");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("---teardown applying for each step---");
    }
}
