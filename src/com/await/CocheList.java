package com.await;

public class CocheList {
    String name = "nombre de coche";
    public CocheList(){}
    public CocheList (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CocheList{" +
                "name='" + name + '\'' +
                '}';
    }
}
