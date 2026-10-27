package Ycolecoes.test;

import Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Vanitas no Carte", 19.10, 0));
        mangas.add(new Manga(3L,"Black Clover", 11.20, 5));
        mangas.add(new Manga(4L,"Kimetsu no Yaba", 21.21, 0));
        mangas.add(new Manga(1L,"Gustavo",21.21, 2));
        mangas.add(new Manga(1L,"ALana",21.21, 0));

        //check antes de fazer alguma acao
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        //enquanto
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }


        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
