package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 categoria infantil
        // age >= 15 && age < 18 categoria juvenil
        // age >= 18 categoria adulto
        int age = 17;
        if(age < 15) {
            System.out.println("Categoria infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
            // sout
        }
    }
}
