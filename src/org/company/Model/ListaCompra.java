package org.company.Model;

import java.util.ArrayList;

/**
 * Created by marco on 20/4/17.
 */
public class ListaCompra extends ArrayList<Articulo> {

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

    public void mostrarArticulos(){
        int indice = 0;
        for(Articulo articulo: articulos){
            System.out.println(indice + " - " + articulo);
            indice++;
        }
    }

    public void eliminarArticulo(int articulo){
        articulos.remove(articulo);
    }

    public void consultarImporte(){
        double resultado = 0;

        for (Articulo articulo: articulos){
            resultado += articulo.getPrecio();
        }
        mostrarArticulos();
        System.out.println("El importe total es de: " + resultado);
    }

    public static boolean indiceCorrecto(int indice, ArrayList<Articulo> lista){
        if(indice >= 0 && indice < lista.size()){
            return true;
        }else{
            return false;
        }
    }

}
