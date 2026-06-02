package prg11;

public package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    WebDriver driver;

    @Given("User opens Amazon")
    public void openAmazon() {

        driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
    }

    @When("User searches Laptop")
    public void searchLaptop() {

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("Laptop");

        driver.findElement(By.id("nav-search-submit-button"))
              .click();
    }

    @Then("Search is successful")
    public void verifySearch() {

        System.out.println("Search Successful");

        driver.quit();
    }
} {
    
}
