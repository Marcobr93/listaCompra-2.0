package org.company.Model;

import java.util.ArrayList;

/**
 * Created by marco on 20/4/17.
 */
public class ListaCompra {

    private ArrayList<Articulo> articulos;

    // Accesores

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }


    // Constructor

    public ListaCompra() {
        articulos = new ArrayList<Articulo>();
    }

    public void añadirArticulo(Articulo articulo){
        if (articulo != null){
            articulos.add(articulo);
        }
    }

    public void showArticulos(){
        for(Articulo articulo: articulos){
            System.out.println(articulo);
        }
    }

    public void eliminarArticulo(Articulo articulo){
        articulos.remove(articulo);
    }

}
