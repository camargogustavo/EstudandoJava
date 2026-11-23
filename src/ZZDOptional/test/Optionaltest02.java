package ZZDOptional.test;

import ZZDOptional.dominio.Manga;
import ZZDOptional.repositorio.MangaRepository;

import java.util.Optional;

public class Optionaltest02 {
    public static void main(String[] args) {
        Optional<Manga> bokuNoHero = MangaRepository.findByTitle("Boku no hero");
        bokuNoHero.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(bokuNoHero);

       Manga mangaId = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaId);

        MangaRepository.findByTitle("Drifters").orElse(new Manga(3, "Driffters", 100));
        Manga newManga = MangaRepository.findByTitle("Drifters").orElseGet(() -> new Manga(3, "Driffters", 100));
        System.out.println(newManga);
    }
}
