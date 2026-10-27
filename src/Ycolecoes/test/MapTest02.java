package Ycolecoes.test;

import Ycolecoes.domain.Consumidor;
import Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Gustavo");
        Consumidor c2 = new Consumidor("Alana");
        Manga mg1 = new Manga(5L, "Vanitas no Carte", 19.10);
        Manga mg2 = new Manga(3L, "Black Clover", 11.20);
        Manga mg3 = new Manga(4L, "Kimetsu no Yaba", 21.21);
        Manga mg4 = new Manga(1L, "Dragon Ball", 21.21);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(c1,mg1);
        consumidorManga.put(c2,mg4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+ " - "+ entry.getValue().getNomeManga());
        }

    }
}
