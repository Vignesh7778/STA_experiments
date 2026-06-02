package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg12_navigation {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        Thread.sleep(2000);

        // Navigate to Amazon
        driver.navigate().to("https://www.amazon.in");

        Thread.sleep(2000);

        // Navigate to Spotify
        driver.navigate().to("https://open.spotify.com");

        Thread.sleep(2000);

        // Back
        driver.navigate().back();

        Thread.sleep(2000);

        // Forward
        driver.navigate().forward();

        Thread.sleep(2000);

        // Refresh
        driver.navigate().refresh();

        System.out.println("Navigation Successful");

        driver.quit();
    }
}