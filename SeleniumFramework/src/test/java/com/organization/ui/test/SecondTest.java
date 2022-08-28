package com.organization.ui.test;

import org.junit.jupiter.api.Test;

public class SecondTest extends UiBaseTest {

    @Test
    public void secondTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        Thread.sleep(4000);
    }
}
