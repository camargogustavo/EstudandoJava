package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoLIst = criarArrayComOjeto(new Barco("Canoa da mercedes"));
        System.out.println(barcoLIst);

    }

    private static <T> List<T> criarArrayComOjeto(T t) {
        // private static <T> void criarArrayComObjeto(t t)
//        List<T> lista = List.of(t);
//        System.out.println(lista);
        return List.of(t);
    }
}

