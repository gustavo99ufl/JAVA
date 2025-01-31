package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gustavo");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[] {1000.4, 2000.90, 3000.56});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }

}
