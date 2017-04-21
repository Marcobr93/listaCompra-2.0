package org.company.Model;

/**
 * Created by marco on 20/4/17.
 */
public class Articulo {
    private  String nombre;
    private  double precio;


    // Constructores

    public Articulo() {
    }

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Accesores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.equals("")){
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0){
            this.precio = 0.0;
        }else{
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return  nombre + " (" + precio + " €)";
    }
}
