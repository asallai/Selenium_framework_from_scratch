package com.organization.ui.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class UiBaseTest {
    static WebDriver driver;

    // JUnit5 BeforeAll method must be static
    @BeforeAll
    static void setupAll() {
       WebDriverFactory factory = new WebDriverFactory();
       driver = factory.getWebDriver("chrome");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
