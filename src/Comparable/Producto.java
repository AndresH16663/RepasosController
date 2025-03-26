package Comparable;

/*
 * Ejercicio 1: Orden natural usando Comparable
Crea una clase Producto con los siguientes atributos:

String nombre
Double precio
Implementa la interfaz Comparable para que los objetos Producto se puedan ordenar por el atributo precio (de menor a mayor).

Crea una lista de productos con precios variados.
Ordena la lista utilizando Collections.sort() y muestra los resultados.
 */

public class Producto implements Comparable<Producto>{

    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto e) {
        return Double.compare(this.precio, e.precio);
    }

    @Override
    public String toString() {
        return "Producto nombre:" + nombre + ", precio:" + precio + "]";
    } 

    

}
