package org.kaly;

/**
 * Classe que representa uma calculadora simples.
 */
public class Calculadora {

    /**
     * Realiza a adição de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma de a e b.
     */
    int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     *
     * @param a O número do qual será subtraído.
     * @param b O número a ser subtraído.
     * @return A diferença entre a e b.
     */
    int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O produto de a e b.
     */
    int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param a O número que será dividido.
     * @param b O número pelo qual a divisão será realizada.
     * @return O resultado da divisão de a por b.
     * @throws ArithmeticException Se b for zero.
     */
    int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}


