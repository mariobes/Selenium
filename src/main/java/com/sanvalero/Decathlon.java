package com.sanvalero;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

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

        WebElement buscarProductos = driver.findElement(By.name("Ntt"));
        buscarProductos.sendKeys("Zapatillas");
        WebElement clickBuscar = driver.findElement(By.id("search-button"));
        clickBuscar.click();

        List<WebElement> productos = driver.findElements(By.className("svelte-bcstxf"));

        int numeroProductos = productos.size();

        return String.valueOf(numeroProductos);
    }

    public String buscarFutbol() {

        SetUp();

        WebElement buscarFutbol = driver.findElement(By.name("Ntt"));
        buscarFutbol.sendKeys("Futbol");
        WebElement clickBuscar = driver.findElement(By.id("search-button"));
        clickBuscar.click();

        return driver.getTitle();
    }

    public String anadirProductoCarrito() {

        SetUp();

        WebElement buscarProducto = driver.findElement(By.name("Ntt"));
        buscarProducto.sendKeys("Mancuernas");
        WebElement clickBuscar = driver.findElement(By.id("search-button"));
        clickBuscar.click();

        WebElement entrarEnProducto = driver.findElement(By.className("svelte-pnzgdi"));
        entrarEnProducto.click();

        WebElement anadirCesta = driver.findElement(By.className("cta--block"));
        anadirCesta.click();

        WebElement verCesta = driver.findElement(By.className("svelte-1l7i9qw"));
        verCesta.click();

        WebElement verProductosCesta = driver.findElement(By.className("fulfiller-link"));

        return verProductosCesta.getText();
    }

}