package com.organization.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends WebDriverWrapper {

    public WebDriver driver;

    private String cityLocator = "(//div[@data-ref='flight-segment.DIRECTION']//span[contains(@class, 'city')])[INDEX]";
    private String hourLocator = "(//div[@data-ref='flight-segment.DIRECTION']//span[contains(@class, 'hour')])[INDEX]";
    private String durationLocator = "(//div[@data-ref='flight_duration'])[INDEX]";

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean validateTitle() {
        return checkTitle("Ryanair");
    }

    public String getCity(String direction, String index) {
        return driver.findElement(By.xpath(cityLocator
                         .replace("DIRECTION", direction)
                         .replace("INDEX", index)))
                .getText();
    }

    public String getHour(String direction, String index) {
        return driver.findElement(By.xpath(hourLocator
                        .replace("DIRECTION", direction)
                        .replace("INDEX", index)))
                .getText();
    }

    public String getDuration(String index) {
        return driver.findElement(By.xpath(durationLocator
                        .replace("INDEX", index)))
                .getText();
    }

}
