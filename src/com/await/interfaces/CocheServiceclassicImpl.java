package com.await.interfaces;

import com.await.Coche;
import com.await.CocheElectrico;
import com.await.interfaces.CocheService;

public class CocheServiceclassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
