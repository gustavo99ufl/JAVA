package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyAlcooholicBeverage = age >= 18;
        // negation operator: !
        if (isAuthorizedBuyAlcooholicBeverage) {
            System.out.println("Authorized to buy alcoholic beverage");
        } else {
            System.out.println("You are not authorized to purchase alcoholic beverages");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Inside something that should never be done");
        }

    }
}
