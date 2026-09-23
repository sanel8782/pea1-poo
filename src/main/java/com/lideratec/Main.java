package com.lideratec;

import java.util.Scanner;

// Bodega "Don Pepe"
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Producto producto = new Producto("Arroz", 5.00, 10);

        int opcion;

        do {
            System.out.println("\n===== BODEGA DON PEPE =====");
            System.out.println("1. Mostrar información del producto");
            System.out.println("2. Aumentar stock");
            System.out.println("3. Reducir stock");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    producto.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("Ingrese cantidad a aumentar: ");
                    int aumento = scanner.nextInt();
                    producto.aumentarStock(aumento);
                    break;

                case 3:
                    System.out.print("Ingrese cantidad a reducir: ");
                    int reduccion = scanner.nextInt();
                    producto.reducirStock(reduccion);
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}