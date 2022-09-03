package com.organization.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    private static final By AGREE_BUTTON = By.xpath("//button[contains(text(), 'Yes, I agree')]");

    public void clickAgreeButton() {
        WebElement element = driver.findElement(AGREE_BUTTON);
        element.click();
    }

}
