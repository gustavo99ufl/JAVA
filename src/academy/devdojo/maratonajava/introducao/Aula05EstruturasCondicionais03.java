package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String messageDoar = "Eu vou doar 500 pro DevDojo";
        String messageNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // (condicao) ? verdadeiro : falso
        String resultado = salary > 5000 ? messageDoar : messageNaoDoar;

        System.out.println(resultado);
    }
}
