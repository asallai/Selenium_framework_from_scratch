package com.organization.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

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
     */

    private static final By AGREE_BUTTON = By.xpath("//button[contains(text(), 'Yes, I agree')]");

    public void clickAgreeButton() {
        WebElement element = driver.findElement(AGREE_BUTTON);
        element.click();
    }

}
