package org.kaly;

public class Calculadora {

    int adicionar(int a, int b) {
        return a + b;
    }

    int subtrair(int a, int b) {
        return a - b;
    }

    int multiplicar(int a, int b) {
        return a * b;
    }

    int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}


