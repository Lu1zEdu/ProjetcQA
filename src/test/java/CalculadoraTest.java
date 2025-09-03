import com.fiap.api.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    void deveSomarDoisNumeros() {
        assertEquals(10, calc.soma(5,5));
    }

    @Test
    void deveSubtrairDoisNumeros() {
        assertEquals(0,  calc.sub(5,5));
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        assertEquals(25, calc.mult(5,5));
    }

    @Test
    void deveDividirDoisNumeros() {
        assertEquals(1, calc.div(5,5));
    }
}
