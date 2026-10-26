package Ycolecoes.test;

import Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Vanitas no Carte", 19.10));
        mangas.add(new Manga(3L,"Black Clover", 11.20));
        mangas.add(new Manga(4L,"Kimetsu no Yaba", 21.21));
        mangas.add(new Manga(1L,"Gustavo",21.21));
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(1L, "Gustavo", 21.21);
        System.out.println(Collections.binarySearch(mangas, mangaSearch));

    }
}
