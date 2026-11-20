package ZZClambdas.test;

import ZZClambdas.domain.Anime;
import ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        animeList.sort(AnimeComparators::compareByEpisodes);

    }
}
