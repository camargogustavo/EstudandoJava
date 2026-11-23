package ZZClambdas.test;

import ZZClambdas.domain.Anime;
import ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));

        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animes = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer, Anime> animes2 = Anime::new;
        System.out.println(animes2.apply("Super Campeoes",100));

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

    }
}
