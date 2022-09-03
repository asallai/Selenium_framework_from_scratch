package com.organization.ui.test;

import org.junit.jupiter.api.Test;

public class FirstTest extends UiBaseTest {

    @Test
    public void firstTest() {
        driver.navigate().to("https://www.ryanair.com/us/en");
        homePage.clickAgreeButton();
    }
}
