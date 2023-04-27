package com.await;

import java.util.List;
import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        System.out.println(nombres);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        List<CocheList> coches = new ArrayList<>();
        coches.add(new CocheList("honda civic"));
        coches.add(new CocheList("alfa romeo"));
        coches.add(new CocheList("ford mondeo"));
        System.out.println(coches);
        for (CocheList coche : coches) {
            System.out.println(coche);
        }
    }
}
