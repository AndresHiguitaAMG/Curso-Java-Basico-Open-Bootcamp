package com.await;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            count++; // Condición
            if (count == 6)
                break; // rompe el flujo de ejecución
                // continue; // salta el valor 6 y continúa a la siguiente iteración, es decir el 6 no lo imprime
            System.out.println("Hola mundo " + count);
        }
        System.out.println("Fin");
    }
}
