import com.sanvalero.ListarProductos;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListarProductosTest {

    private static WebDriver driver;
    static ListarProductos listarZapatillas;

    @BeforeAll
    public static void SetUp() {
        listarZapatillas = new ListarProductos(driver);
        driver = listarZapatillas.setUp();
        listarZapatillas.paginaWeb("https://www.decathlon.es/es/");
    }

    @Test
    public void listarZapatillas() {
        listarZapatillas.listarZapatillas();
        assertEquals("40", listarZapatillas.listadoCorrecto()); }

}
