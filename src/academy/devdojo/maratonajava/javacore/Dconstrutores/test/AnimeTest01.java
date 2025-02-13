package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG" );
        //Anime anime2 = new Anime("Haikyuu", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime1.imprime();
    }
}