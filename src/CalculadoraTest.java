import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora c = new Calculadora();
        double res = c.somar(10, 50);
        assertEquals(60,res,0.1);
    }
    @Test
    public void testSubtrair() {
        Calculadora c = new Calculadora();
        double res = c.subtrair(10, -15);
        assertEquals(25,res,0.1);
    }
    @Test
    public void testDividir() {
        Calculadora c = new Calculadora();
        double res = c.dividir(10, 0);
        assertNotEquals(Double.isFinite(res), false);
    }
    @Test
    public void testMultiplicar() {
        Calculadora c = new Calculadora();
        double res = c.multiplicar(120.05, 12);
        assertEquals(1440.6,res,0.1);
    }
}