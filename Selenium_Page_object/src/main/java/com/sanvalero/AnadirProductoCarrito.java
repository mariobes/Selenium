package com.sanvalero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnadirProductoCarrito extends PatronPageObject {

    By buscarProducto = By.name("Ntt");
    By clickBuscar = By.id("search-button");
    By entrarEnProducto = By.className("svelte-pnzgdi");
    By anadirCesta = By.className("cta--block");
    By verCesta = By.className("svelte-1l7i9qw");
    By verProductosCesta = By.className("fulfiller-link");
    public AnadirProductoCarrito(WebDriver driver) {
        super(driver);
    }

    public void anadirProductoCarrito() {
        sendKeys("Mancuernas", buscarProducto);
        click(clickBuscar);
        click(entrarEnProducto);
        click(anadirCesta);
        click(verCesta);
    }

    public String productoAnadidoCorrectamente() {
        return getText(verProductosCesta);
    }

}
