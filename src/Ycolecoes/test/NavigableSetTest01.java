package Ycolecoes.test;

import Ycolecoes.domain.Manga;
import Ycolecoes.domain.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        SmartPhone smartPhone = new SmartPhone("123", "Samsung");
        set.add(smartPhone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Vanitas no Carte", 19.10, 0));
        mangas.add(new Manga(3L,"Black Clover", 11.20, 5));
        mangas.add(new Manga(4L,"Kimetsu no Yaba", 21.21, 0));
        mangas.add(new Manga(1L,"Gustavo",21.21, 2));
        mangas.add(new Manga(1L,"ALana",21.21, 0));
        for (Manga manga : mangas) {b
            System.out.println(manga);
        }

    }
}
