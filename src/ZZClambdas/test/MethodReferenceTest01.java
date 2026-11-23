package ZZClambdas.test;

import ZZClambdas.domain.Anime;
import ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));// Crio o arrays List
        Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));//lambda comparando title 1 e 2
        Collections.sort(animeList, (a1,a2) -> AnimeComparators.compareByTitle(a1,a2));// Crie um pacote service e dentro dele esta o metodo compareByTitle que recebeu Anime a1 e Anime a2
        Collections.sort(animeList, AnimeComparators::compareByTitle);// Isso seria um method reference ou parametrizacao?
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);// a mesma coisa de cima comparando por episodios
        System.out.println(animeList);
    }
}
