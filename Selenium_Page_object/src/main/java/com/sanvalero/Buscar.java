package com.sanvalero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buscar extends PatronPageObject {

    By buscarFutbol = By.name("Ntt");
    By clickBuscar = By.id("search-button");

    public Buscar(WebDriver driver) {
        super(driver);
    }

    public void buscarFutbol() {
        sendKeys("Futbol", buscarFutbol);
        click(clickBuscar);
    }

    public String busquedaCorrecta() {
        return getTitle();
    }

}
