package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int number = 0;
        int par = 0;
        while (number <= 1000000) {
            number += 1;
            if (number % 2 == 0) {
                par = number;
                System.out.println(par);
            }
        }
    }
}
