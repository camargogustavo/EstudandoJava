package Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Vanitas");
        mangas.add("Black Clover");
        mangas.add("Kimetsu no Yaba");
        mangas.add("Guistavo");
        Collections.sort(mangas);
        for (String manga : mangas){
            System.out.println(manga);
        }
    }
}
