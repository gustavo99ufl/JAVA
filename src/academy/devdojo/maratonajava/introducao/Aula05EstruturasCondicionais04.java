package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salaryYear = 45000;
        double firstLevel = 9.70 / 100;
        double secondLevel = 37.35 / 100;
        double thirdLevel = 49.50 / 100;
        double taxesValue;
        if (salaryYear <= 34712) {
            taxesValue = salaryYear * firstLevel;
        } else if (salaryYear > 34713 && salaryYear <= 68507) {
            taxesValue = salaryYear * secondLevel;
        } else {
            taxesValue = salaryYear * thirdLevel;
        }
        System.out.println(taxesValue);
    }
}
