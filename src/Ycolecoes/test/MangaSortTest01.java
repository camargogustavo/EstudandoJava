package Ycolecoes.test;

import Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MangaByIDComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Vanitas no Carte", 19.10));
        mangas.add(new Manga(3L,"Black Clover", 11.20));
        mangas.add(new Manga(4L,"Kimetsu no Yaba", 21.21));
        mangas.add(new Manga(1L,"Guistavo",21.21));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("_______________");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIDComparator());
        mangas.sort(new MangaByIDComparator());
        System.out.println("_______________");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
