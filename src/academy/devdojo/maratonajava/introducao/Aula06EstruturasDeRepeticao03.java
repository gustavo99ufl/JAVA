package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int number = 0;
        int valorMax = 50;
        while(number <= valorMax) {
            number += 1;
            if(number > 25 ) {
                break;
            }
            System.out.println("number = "+number);
        }
    }
}
