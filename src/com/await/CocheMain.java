package com.await;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa ";
        Coche cocheObj = new Coche();
        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 1430.45, 5.4);
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);
        cocheObj2.peso = 1350.8;
        System.out.println(cocheObj2);
    }
}
