package ZZClambdas.test;

//Reference to an instance method of an arbitrary object of a particular type pode ser traduzido como Referencia a um metodo de instancia de qualquer objeto de um tipo especifico
//
//Esse tipo de referência por metodo é usado quando:
//Você não sabe qual objeto será usado
//Mas sabe o tipo do objeto
//E o metodo sera chamado em cada objeto individualmente

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Ou seja: Para cada objeto desse tipo, chame este metodo
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> aninmeList = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        aninmeList.sort(String::compareTo);
        System.out.println(aninmeList);
        Function<String, Integer> numStringInteger = s -> Integer.parseInt(s);
        Function<String, Integer> numStringInteger1 = Integer::parseInt;
        Integer num = numStringInteger1.apply("10");//comprova que passou para integer
//        System.out.println(numStringInteger1.apply("10"));
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(aninmeList, "Veldora"));
    }
}
