package com.organization.ui.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest extends UiBaseTest {

    private static final String FROM = "1";
    private static final String TO = "2";

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

        searchPage.validateTitle();

        System.out.printf("%s: %s - %s: %s  -  %s",
                searchPage.getCity("departure", FROM),
                searchPage.getHour("departure", FROM),
                searchPage.getCity("arrival", FROM),
                searchPage.getHour("arrival", FROM),
                searchPage.getDuration(FROM));

        System.out.println();

        System.out.printf("%s: %s - %s: %s  -  %s",
                searchPage.getCity("departure", TO),
                searchPage.getHour("departure", TO),
                searchPage.getCity("arrival", TO),
                searchPage.getHour("arrival", TO),
                searchPage.getDuration(TO));

        Assertions.assertEquals("Budapest", searchPage.getCity("departure", FROM), "Departure city is not correct");
        Assertions.assertEquals("Copenhagen", searchPage.getCity("arrival", FROM), "Destination city is not correct");
    }
}
