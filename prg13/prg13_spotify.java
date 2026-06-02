package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg13_spotify {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open Spotify Web Player
        driver.get("https://open.spotify.com");

        System.out.println("Spotify Opened Successfully");

        driver.quit();
    }
}