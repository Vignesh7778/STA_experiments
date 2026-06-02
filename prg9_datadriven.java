package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class prg9_datadriven {

    @DataProvider(name = "productData")
    public Object[][] getData() {

        return new Object[][] {
            {"Pen"},
            {"Laptop"},
            {"Mobile"}
        };
    }

    @Test(dataProvider = "productData")
    public void searchProduct(String product) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys(product);

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        System.out.println("Searching : " + product);

        driver.quit();
    }
}