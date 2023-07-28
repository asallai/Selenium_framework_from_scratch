package com.organization.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WebDriverWrapper {

    public WebDriver driver;
    private static final int TIMEOUT = 20;

    public WebDriverWrapper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementByClickAbility(By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(TIMEOUT))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public WebElement findElementByVisibility(By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(TIMEOUT))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }

    public Boolean findElementByInvisibility(By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(TIMEOUT))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        Boolean isInVisibility = wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        return isInVisibility;
    }

    public Boolean checkTitle(String title) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(TIMEOUT))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        Boolean isTitleCorrect = wait.until(ExpectedConditions.titleIs(title));
        return isTitleCorrect;
    }

    public void click(WebElement element) {
        element.click();
    }

    public void click(By locator) {
        WebElement element = findElementByClickAbility(locator);
        element.click();
    }

    public void fill(By locator, String text) {
        WebElement element = findElementByClickAbility(locator);
        element.sendKeys(text);
    }

}
