package com.test.selenium_test_04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    WebDriver driver;

    @Given("User opens Google")
    public void openGoogle() {

        driver = new ChromeDriver();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
    }

    @When("User searches Laptop")
    public void searchLaptop() {

        driver.findElement(By.name("q"))
              .sendKeys("Laptop");
    }

    @Then("Search is successful")
    public void verifySearch() {

        System.out.println("Search Successful");

        driver.quit();
    }
}