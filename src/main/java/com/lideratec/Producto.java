package com.lideratec;

public class Producto {

    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: "+ precio);
        System.out.println("Stock: "+ stock);

    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
            System.out.println("Nuevo stock: " + stock);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Nuevo stock reducido "+ stock);
        } else {
            System.out.println("Cantidad inválida o stock insuficiente.");
        }
    }


}
