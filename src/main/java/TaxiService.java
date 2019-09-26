import java.util.Scanner;

class TaxiService {
    private int distance;

    void initDistance() {
        System.out.println("Enter a distance in kilometers");
        try (Scanner scanner = new Scanner(System.in)){
            distance = scanner.nextInt();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int calculate() {
        int cost;
        if (checkDistance(distance)) {
                cost = Constants.LANDING_AMOUNT_IN_RUBLES + distance * Constants.COST_OF_1_KM;
                cost -= calculateDiscount(cost);
            }else {
                cost = 0;
            }
            return cost;
    }

    void show() {
        System.out.println(calculate());
    }

    private boolean checkDistance(int distance) {
        return distance >= 0;
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
