package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prg10_pom {

    @Test
    public void searchTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        LoginPage page = new LoginPage(driver);

        page.searchProduct("Laptop");
        page.clickSearch();

        System.out.println("Product Search Successful");

        driver.quit();
    }
}