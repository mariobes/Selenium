package com.sanvalero;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Decathlon {

    private static WebDriver driver;

    public static void SetUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOption);
        driver.get("https://www.decathlon.es/es/");

        WebElement aceptarCookies = driver.findElement(By.id("didomi-notice-agree-button"));
        aceptarCookies.click();
    }

    public String listarZapatillas() {

        SetUp();

        return null;
    }

    public String buscarFutbol() {

        SetUp();

        return null;
    }

    public String anadirProductoCarrito() {

        SetUp();

        return null;
    }

}