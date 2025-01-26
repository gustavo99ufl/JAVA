package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    /*
    primitive types
    int, double, float, char, byte, short, long, boolean
     */
        int age = (int) 20000000000L;
        long bignumber = 100000;
        double salaryDouble = 2000.0;
        float salaryFloat = (float) 2500.0F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean married = false;
        char characters = 'M';
        String phrase = "NO LIMIT OF TEXT. String is one object and no one primitive type.";

        System.out.println("The age is "+ age+" years");
        System.out.println(married);
        System.out.println("char "+ characters);
        System.out.println(age);
        System.out.println(salaryFloat);
        System.out.println(phrase);
    }
}
