import java.util.Scanner;

class TaxiService {
    int calculate(int dist) {
        int cost;
        if (checkDistance(dist)) {
                cost = Constants.LANDING_AMOUNT_IN_RUBLES + dist * Constants.COST_OF_1_KM;
                cost -= calculateDiscount(cost);
            }else {
                cost = 0;
            }
            return cost;
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
