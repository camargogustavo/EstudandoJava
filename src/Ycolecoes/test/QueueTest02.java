package Ycolecoes.test;

import Ycolecoes.domain.Consumidor;
import Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Vanitas no Carte", 19.10, 0));
        mangas.add(new Manga(3L,"Black Clover", 9.5, 5));
        mangas.add(new Manga(4L,"Kimetsu no Yaba", 3.2, 0));
        mangas.add(new Manga(1L,"Gustavo",11.20, 2));
        mangas.add(new Manga(2L,"Alana",2.99, 2));


        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
