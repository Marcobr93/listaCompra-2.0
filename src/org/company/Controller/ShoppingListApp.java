package org.company.Controller;

import org.company.Model.Articulo;
import org.company.Model.ListaCompra;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by marco on 20/4/17.
 */
public class ShoppingListApp {

    private ListaCompra listaCompra;

    // Constructor

    public ShoppingListApp() {
        listaCompra = new ListaCompra();
    }

    public void run(){
        int option;

        while ( (option = showMenu()) != 0){
            switch (option){
                case 1:
                    // Añadir compra
                    leerProducto();
                    break;

                case 2:
                    // Borrar compra

                    break;
                case 3:
                    // Mostar lista de la compra
                    listaCompra.showArticulos();
                    break;
                case 4:
                    // Consultar importe total

                    break;
                case 5:
                    // Salir
                    break;
                default:
            }
        }
    }
/*
    private void mostrarListaCompra() {
        for(Articulo articulo: listaCompra.getArticulos()){
            System.out.println(articulo);
        }
    }
*/
    private void leerProducto() {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double precio;
        Articulo articulo;

        do{
            System.out.println("Nombre del artículo: ");
            nombre = scanner.nextLine();
        }while (nombre.equals(""));


        System.out.println("Precio del artículo: ");
        precio = scanner.nextDouble();

        articulo = new Articulo(nombre, precio);
        listaCompra.añadirArticulo(articulo);
    }

    private int showMenu(){
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("***********************************");
        System.out.println("* 1 - Añadir producto             *");
        System.out.println("* 2 - Eliminar producto           *");
        System.out.println("* 3 - Mostrar lista de artículos  *");
        System.out.println("* 4 - Consultar importe total     *");
        System.out.println("* 0 - Salir                       *");
        System.out.println("***********************************");
        System.out.println("Opción: ");
        option = scanner.nextInt();

        return option;
    }

}
