import java.util.Scanner;

class TaxiService {
    private int cost;

    void calculate() {
        System.out.println("Enter a distance in kilometers");
        try (Scanner scanner = new Scanner(System.in)) {
            int distance = scanner.nextInt();
            if (checkDistance(distance)) {
                cost = Constants.LANDING_AMOUNT_IN_RUBLES + distance * Constants.COST_OF_1_KM;
                cost -= calculateDiscount(cost);
            }else {
                errorMessage();
                System.exit(-1);
            }
        } catch (Exception e) {
            errorMessage();
            e.printStackTrace();
        }
    }

    void show() {
        System.out.println(cost);
    }

    private boolean checkDistance(int distance) {
        return distance >= 0;
    }

    private void errorMessage() {
        System.err.println("Enter correct int value >= 0");
    }

    private int calculateDiscount(int cost) {
        int discount = 0;
        if (cost > Constants.ORDER_LIMIT) {
            discount = cost * Constants.PERCENTAGE_DISCOUNT/ 100;
            if (discount > Constants.MAXIMUM_DISCOUNT_AMOUNT_IN_RUBLES) {
                discount = Constants.MAXIMUM_DISCOUNT_AMOUNT_IN_RUBLES;
            }
        }
        return discount;
    }
}
