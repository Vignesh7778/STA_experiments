package com.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = "com.test"
)

public class TestRunner extends AbstractTestNGCucumberTests {

}