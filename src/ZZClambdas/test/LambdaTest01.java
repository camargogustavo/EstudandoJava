package ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Alana");
        nomes.add("Fumaca");
        nomes.add("Faisca");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        foreach(nomes, (String s) -> System.out.println(s));
        foreach(integers, i -> System.out.println(i));
        foreach(nomes, s -> System.out.println(s.toUpperCase()));



    }

    private static <T> void foreach(List<T> lista, Consumer<T> consumer){
        for (T e : lista) {
            consumer.accept(e);
        }

    }
}
