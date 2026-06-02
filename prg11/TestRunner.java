package com.test.selenium_test_04;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/com/test/selenium_test_04/login.feature",
    glue = "com.test.selenium_test_04"
)

public class TestRunner extends AbstractTestNGCucumberTests {

}