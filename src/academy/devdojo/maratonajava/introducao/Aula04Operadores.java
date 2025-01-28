package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number02 + number01;
        System.out.println(result);

        // %
        int rest = 21 % 7;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        System.out.println("isTenGreaterThanTwenty "+ isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty "+ isTenLessThanTwenty);

        /* Operadores lógicos
        && (AND) || (OR) */
        int age = 29;
        float salary = 3500F;
        boolean isInsideOfLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isInsideOfLawLessThanThirty = age < 30 && salary >= 3381;

        double TotalCurrentAccountValue = 200;
        double TotalValueSavingsAccount = 10000;
        float ValuePlaystation = 5000F;
        boolean isPlaystationFivePurchasable = TotalCurrentAccountValue > ValuePlaystation || TotalValueSavingsAccount > ValuePlaystation;
        System.out.println("isPlaystationFivePurchasable "+isPlaystationFivePurchasable );
        /* Operadores de atribuição
        = += -= /= %=
         */
        double bonus = 1000;
        bonus += 1000;
        bonus -= 260;
        bonus *= 5;
        bonus /= 2;
        System.out.println(bonus);
        // ++ --
        int cont = 0;
        cont += 1;
        cont++;
        cont--;
        ++cont;
        int cont2 = 0;
        System.out.println(cont2++);
    }
}
