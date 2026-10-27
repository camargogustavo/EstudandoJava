package Ycolecoes.test;

import Ycolecoes.domain.Consumidor;
import Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Gustavo");
        Consumidor c2 = new Consumidor("Alana");
        Manga mg1 = new Manga(5L, "Vanitas no Carte", 19.10);
        Manga mg2 = new Manga(3L, "Black Clover", 11.20);
        Manga mg3 = new Manga(4L, "Kimetsu no Yaba", 21.21);
        Manga mg4 = new Manga(1L, "Dragon Ball", 21.21);
        List<Manga> mangaConsumidorList = List.of(mg1, mg2, mg3);
        List<Manga> mangaConsumidorList2 = List.of(mg3, mg4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, mangaConsumidorList);
        consumidorMangaMap.put(c2, mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("----"+ entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("------" + manga.getNomeManga());
            }

        }


    }
}
