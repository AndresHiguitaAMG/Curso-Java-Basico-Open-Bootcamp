package com.await.interfaces;

import com.await.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service = new CocheServiceSportImpl();
        Coche coche = service.crearCocheDemo();
    }
}
