package Zgenerics.test;

import Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;


public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Mydoria");
        lista.add("Gsutavo");

        for (String o : lista){
            System.out.println(o);
        }
        adicionar(lista, new Consumidor("Midorya"));
        for (Object o : lista){
            System.out.println(o);
        }
    }
    private static void adicionar(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
