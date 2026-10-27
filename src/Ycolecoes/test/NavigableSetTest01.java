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

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco()) ;
    }
}

public class  NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        SmartPhone smartPhone = new SmartPhone("123", "Samsung");
        set.add(smartPhone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Vanitas no Carte", 19.10, 0));
        mangas.add(new Manga(3L,"Black Clover", 9.5, 5));
        mangas.add(new Manga(4L,"Kimetsu no Yaba", 3.2, 0));
        mangas.add(new Manga(1L,"Gustavo",11.20, 2));
        mangas.add(new Manga(2L,"Alana",2.99, 2));


        Manga yuyu = new Manga(21L, "yuyu Hukusho", 3.2, 5);

        //lower < que é menor
        //floor => vai trazer o mesmo valor ou mesmo valor, caso nao existe imediato abaixo dele
        //higher > primeiro maior
        //ceiling leva em consideracao o valor passado

        System.out.println("----------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast()  );
        System.out.println(mangas.size());

    }
}
