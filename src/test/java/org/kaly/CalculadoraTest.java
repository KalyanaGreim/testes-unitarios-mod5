package org.kaly;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.adicionar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(5, 3);
        assertEquals(15, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(6, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(6, 0));
    }
}