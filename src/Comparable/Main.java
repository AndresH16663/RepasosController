package Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
            new Producto("Laptop", 1200.99),
            new Producto("Celular", 799.49),
            new Producto("Teclado", 45.99),
            new Producto("Monitor", 199.99),
            new Producto("Ratón", 25.50)
        );

        Collections.sort(productos.reversed());
        productos.forEach(System.out::println);

    }


}
