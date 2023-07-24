package com.organization.ui.test;

import org.junit.jupiter.api.Test;

public class FirstTest extends UiBaseTest {

    @Test
    public void firstTest() throws InterruptedException {
        homePage
                .validateTitle()
                .clickAgreeButton()
                .fillFromCity("Budapest")
                .chooseCity("BUD")
                .fillToCity("Copenhagen")
                .chooseCity("CPH")
                .chooseDate("2023-08-28")
                .chooseDate("2023-08-30")
                .clickSearchButton();
        Thread.sleep(5000);

    }
}
