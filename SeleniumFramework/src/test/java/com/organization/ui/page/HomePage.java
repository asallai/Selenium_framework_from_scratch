package com.organization.ui.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends WebDriverWrapper {

    public WebDriver driver;

     /*
      Some examples:
       xpath
        //input[@id="input-button__departure"]/ancestor::div[2]/fsw-input-button//input/ancestor::fsw-input-button
      css
        #input-button__departure
        .input-button__input.ng-star-inserted
        html > head > base
        html > body span._container.icon-ie-160-32
        html > body input[placeholder='Departure']
     */

    /*
        Departure field:
           //input[@id='input-button__departure']
           #input-button__departure
        Destination field:
           //input[@id='input-button__destination']
           #input-button__destination
        Search button:
           //button[@data-ref='flight-search-widget__cta']
           .flight-search-widget__start-search.ng-tns-c54-3.ry-button--gradient-yellow
           button[aria-label*='earch']
           //button[contains(@aria-label, 'earch')]
           //span[contains(text(), 'Search')]/ancestor::button[1]
     */

    public String homePageUrl = "https://www.ryanair.com/us/en";
    private String cityLocator = "//span[@data-id='CITY']";
    private String dateLocator = "//div[@data-id='DATE']";

    private static final By AGREE_BUTTON = By.xpath("//button[contains(text(), 'Yes, I agree')]");
    private static final By DEPARTURE_FIELD = By.id("input-button__departure");
    private static final By DESTINATION_FIELD = By.id("input-button__destination");
    private static final By SEARCH_BUTTON = By.cssSelector("button[aria-label*='earch']");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.driver = webDriver;
    }

    public HomePage validateTitle() {
        Assertions.assertEquals("Official Ryanair website | Cheap flights in Europe | Ryanair", driver.getTitle());
        return this;
    }

    public HomePage clickAgreeButton() {
        WebElement element = driver.findElement(AGREE_BUTTON);
        element.click();
        return this;
    }

    public HomePage fillFromCity(String city) {
        click(DEPARTURE_FIELD);
        WebElement element = driver.findElement(DEPARTURE_FIELD);
        element.clear();
        element.sendKeys(city);
        return this;
    }

    public HomePage fillToCity(String city) {
        click(DESTINATION_FIELD);
        WebElement element = driver.findElement(DESTINATION_FIELD);
        element.clear();
        element.sendKeys(city);
        return this;
    }

    public HomePage chooseCity(String city) {
        click(By.xpath(cityLocator.replace("CITY", city)));
        return this;
    }

    public HomePage chooseDate(String date) {
        click(By.xpath(dateLocator.replace("DATE", date)));
        return this;
    }

    public HomePage clickSearchButton() {
        click(SEARCH_BUTTON);
        return this;
    }

}
