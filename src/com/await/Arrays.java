package com.await;

public class Arrays {
    public static void main(String[] args) {
        int [] notas = {8, 10, 5, 9, 8, 7, 5, 6};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        for (int item : notas) {
            System.out.println(item);
        }
        //notas.binarySearch(notas, 9);
        //notas.sort(notas);
        //equals(array1, array2);
    }
}
