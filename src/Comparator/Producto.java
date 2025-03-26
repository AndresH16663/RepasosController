package Comparator;

/**
 * Ejercicio 2: Orden personalizado usando Comparator
 * Utilizando la misma clase Producto, implementa la lógica para ordenar de
 * manera personalizada:
 * 
 * Ordena los productos alfabéticamente por el atributo nombre.
 * Ordena los productos en orden descendente por el atributo precio.
 * Pista: Usa lambdas o crea clases que implementen Comparator.
 * 
 * @author: Andres Hernandez
 */

public class Producto {

    private String nombre;
    private Double precio;
    private Integer cantidad;

    public Producto(String nombre, Double precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto nombre:" + nombre + ", precio:" + precio + ", Cantidad:" + cantidad + "]";
    }

}
