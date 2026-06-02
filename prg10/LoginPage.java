package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}