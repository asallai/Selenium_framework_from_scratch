package com.organization.ui.test;

import com.organization.ui.page.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class UiBaseTest {
    static WebDriver driver;
    static HomePage homePage;

    // JUnit5 BeforeAll method must be static
    @BeforeAll
    static void setupAll() {
       WebDriverFactory factory = new WebDriverFactory();
       driver = factory.getWebDriver("chrome");

       // Pages
       homePage = new HomePage(driver);

       driver.manage().window().maximize();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
