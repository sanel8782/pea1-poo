package com.lideratec;

//Bodega “Don Pepe”
public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("Arroz", 5, 10);

        producto.mostrarInformacion();
        producto.aumentarStock(20);
        producto.reducirStock(40);

    }
}