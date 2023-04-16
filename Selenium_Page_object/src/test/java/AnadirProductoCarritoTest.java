import com.sanvalero.AnadirProductoCarrito;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class AnadirProductoCarritoTest {

    private static WebDriver driver;
    static AnadirProductoCarrito anadirProductoCarrito;

    @BeforeAll
    public static void SetUp() {
        anadirProductoCarrito = new AnadirProductoCarrito(driver);
        driver = anadirProductoCarrito.setUp();
        anadirProductoCarrito.paginaWeb("https://www.decathlon.es/es/");
    }

    @Test
    public void anadirProductoCarrito() {
        anadirProductoCarrito.anadirProductoCarrito();
        assertEquals("Guardar producto de este vendedor para más tarde", anadirProductoCarrito.productoAnadidoCorrectamente()); }

}
