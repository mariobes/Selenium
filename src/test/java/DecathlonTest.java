import com.sanvalero.Decathlon;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecathlonTest {

    private static Decathlon decathlon;

    @BeforeAll
    public static void SetUp() {
        decathlon = new Decathlon();
    }

    @Test
    public void listarZapatillas() { assertEquals("40", decathlon.listarZapatillas()); }

    @Test
    public void buscarFutbol() { assertEquals("Tienda de fútbol | Decathlon", decathlon.buscarFutbol()); }

    @Test
    public void anadirProductoCarrito() { assertEquals("Guardar producto de este vendedor para más tarde", decathlon.anadirProductoCarrito()); }

}
