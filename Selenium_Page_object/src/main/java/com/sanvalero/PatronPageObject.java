package com.sanvalero;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class PatronPageObject {

    private WebDriver driver;

    public PatronPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOption);
        driver.get("https://www.decathlon.es/es/");

        WebElement aceptarCookies = driver.findElement(By.id("didomi-notice-agree-button"));
        aceptarCookies.click();

        return driver;
    }

    public List<WebElement> findElements(By localizador) {
        return driver.findElements(localizador);
    }

    public String getText(By localizador) {
        return driver.findElement(localizador).getText();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void sendKeys(String introducirTexto, By localizador) {
        driver.findElement(localizador).sendKeys(introducirTexto);
    }

    public void click(By localizador) {
        driver.findElement(localizador).click();
    }

    public void paginaWeb(String url) {
        driver.get(url);
    }

}
