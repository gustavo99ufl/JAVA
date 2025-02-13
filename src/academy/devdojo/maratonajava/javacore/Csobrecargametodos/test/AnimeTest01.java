package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.init("Akudama Drive", "TV", 12);

        Anime anime2 = new Anime();
        anime2.init("Akudama Drive", "TV", 12, "Ação");

        anime1.imprime();
        anime2.imprime();
    }
}