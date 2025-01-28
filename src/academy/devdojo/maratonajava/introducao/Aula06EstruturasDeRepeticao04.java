package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valueCar = 30000;
        for (int parcela = 0; parcela <= valueCar; parcela++) {
            double valorParcela = valueCar / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for " +parcela);
        }
    }
}
