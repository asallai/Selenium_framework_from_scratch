package com.organization.ui.test;

import com.organization.ui.page.HomePage;
import com.organization.ui.page.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class UiBaseTest {
    static WebDriver driver;
    static HomePage homePage;
    static SearchPage searchPage;

    // JUnit5 BeforeAll method must be static
    @BeforeEach
    void setupAll() {
       WebDriverFactory factory = new WebDriverFactory();
       driver = factory.getWebDriver("chrome");

       // Pages
       homePage = new HomePage(driver);
       searchPage = new SearchPage(driver);

       driver.manage().window().maximize();
       driver.navigate().to(homePage.homePageUrl);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
