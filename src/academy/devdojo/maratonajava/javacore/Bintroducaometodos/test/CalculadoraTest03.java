package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println("Resultado da divisão (20 / 0): " + result);
        System.out.println("Resultado da divisão (20 / 2): " + calculadora.divideDoisNumeros(20, 2));
        System.out.println("-------------");
        calculadora.impremeDivisaoDeDoisNumeros(86, 5);
        calculadora.impremeDivisaoDeDoisNumeros(10, 0); // Divisão por zero
    }
}