package ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Gu  sta  vo", "Ala  a", "Fum  aca", "Fa  isca");
        List<Integer> inteiros = map(strings, String::length);
        List<String> map = map(strings, String::toUpperCase);
        System.out.println(inteiros);
        System.out.println(map);

        Consumer<String> consumer = (List<String> list, )
        strings.forEach(String::trim);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }

    private static <T> void filterByTitle(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }

    }



}
