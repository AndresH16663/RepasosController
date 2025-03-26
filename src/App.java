import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 2, 9, 7, 6, 1);
        Collections.sort(numeros, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        }); // Las clases anonimas siempre cierran en el punto y coma
        System.out.println(numeros);
        Collections.sort(numeros, (a, b) -> a - b); // Expresion lambda

    }

}
