package com.sanvalero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListarProductos extends PatronPageObject {

    By buscarProductos = By.name("Ntt");
    By clickBuscar = By.id("search-button");
    By productoEncontrado = By.className("svelte-bcstxf");

    public ListarProductos(WebDriver driver) {
        super(driver);
    }

    public void listarZapatillas() {
        sendKeys("Zapatillas", buscarProductos);
        click(clickBuscar);
    }

    public String listadoCorrecto() {

        List<WebElement> productos = findElements(productoEncontrado);
        int numeroProductos = productos.size();
        return String.valueOf(numeroProductos);
    }

}
