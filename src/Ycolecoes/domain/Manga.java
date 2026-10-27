package Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nomeManga;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nomeManga, double preco) {
        Objects.requireNonNull(id, "ID nao podef ser nulo");
        Objects.requireNonNull(nomeManga, "O nome do manga nao pode nulo   ");
        this.id = id;
        this.nomeManga = nomeManga;
        this.preco = preco;
    }

    public Manga(Long id, String nomeManga, double preco, int quantidade) {
        this(id, nomeManga, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nomeManga, manga.nomeManga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeManga);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeManga() {
        return nomeManga;
    }

    public void setNomeManga(String nomeManga) {
        this.nomeManga = nomeManga;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this fopr menor que O
        // se this == a outroManga retorna 0
        // voce retorna positivo se o this for maior que o outroManga
//        if (this.id < outroManga.getId()) {
//            return -1;
//        } else if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
//        return this.nomeManga.compareTo(outroManga.getNomeManga());
//        return Double.valueOf(preco).compareTo(outroManga.getPreco());
//        return Double.compare(preco, outroManga.getPreco());
       return this.id.compareTo(outroManga.getId());
    }
}
