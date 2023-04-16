import com.sanvalero.Buscar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscarTest {

    private static WebDriver driver;
    static Buscar buscar;

    @BeforeAll
    public static void SetUp() {
        buscar = new Buscar(driver);
        driver = buscar.setUp();
        buscar.paginaWeb("https://www.decathlon.es/es/");
    }

    @Test
    public void buscarFutbol() {
        buscar.buscarFutbol();
        assertEquals("Tienda de fútbol | Decathlon", buscar.busquedaCorrecta()); }

}
