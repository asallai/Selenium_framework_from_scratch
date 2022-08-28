package com.organization.ui.test;

import org.junit.jupiter.api.Test;

public class FirstTest extends UiBaseTest {

    @Test
    public void firstTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        Thread.sleep(4000);
    }
}
