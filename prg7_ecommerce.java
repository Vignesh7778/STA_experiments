package com.test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg7_ecommerce {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.in");

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("Pen");

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        System.out.println("Product Search Successful");

        driver.quit();
    }
}