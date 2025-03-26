package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Amplía la clase Producto para incluir el atributo:

Integer cantidad
Crea un Comparator que:

Ordene los productos primero por cantidad (de mayor a menor).
En caso de empate, ordene los productos por precio (de menor a mayor).
Usa una lista de ejemplo y ordena los objetos utilizando el comparador.
 */

public class Main {

    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", 1200.99, 5),
                new Producto("Celular", 799.49, 10),
                new Producto("Teclado", 45.99, 50),
                new Producto("Monitor", 199.99, 7),
                new Producto("Ratón", 25.50, 50)
            );

        Collections.sort(productos, (p1, p2) -> {
            int compareCantidad = p2.getCantidad().compareTo(p1.getCantidad()); // Descendente
            if (compareCantidad == 0) {
                return p1.getPrecio().compareTo(p2.getPrecio()); // Ascendente
            }
            return compareCantidad;
        });

        System.out.println("Ordenados por nombre:");
        productos.forEach(System.out::println);

    }

}