package Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(); //1.4
        List<String> nomes2 = new ArrayList(); //1.4
        nomes.add("William");
        nomes.add("Gustavo");
        nomes.add("Alana");
        nomes2.add("fumaca");
        nomes2.add("faisca");
//        System.out.println(nomes.remove("Alana"));
        nomes.addAll(nomes2);
        //Nao sabemos o objeto, e como temos como referencia uma variavel de objt
        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("------");
        int size = nomes.size();
        for (int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }
    }
}
