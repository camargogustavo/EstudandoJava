package Ycolecoes.test;

import Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class setTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();//permite apenas elementos unicos pelo hash
        mangas.add(new Manga(5L, "Vanitas no Carte", 19.10, 0));
        mangas.add(new Manga(3L,"Black Clover", 11.20, 5));
        mangas.add(new Manga(4L,"Kimetsu no Yaba", 21.21, 0));
        mangas.add(new Manga(1L,"Gustavo",21.21, 2));
        mangas.add(new Manga(1L,"ALana",21.21, 0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
