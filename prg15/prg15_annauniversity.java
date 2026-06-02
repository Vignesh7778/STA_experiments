package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg15_annauniversity {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open Anna University Website
        driver.get("https://www.annauniv.edu");

        // Display Title
        System.out.println("Page Title : " + driver.getTitle());

        // Display Current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        System.out.println("Anna University Website Opened Successfully");

        driver.quit();
    }
}