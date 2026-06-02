package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prg8_testng {

    @Test
    public void searchProduct() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("Pen");

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        System.out.println("Product Search Successful");

        driver.quit();
    }
}