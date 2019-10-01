import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    private static int distance;
    public static void main(String[] args) {
        TaxiService service = new TaxiService();
        enterDistance();
        int answer = service.calculate(distance);
        show(answer);
    }

    private static void enterDistance() {
        System.out.println("Enter a distance in kilometers");
        try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)){
            distance = scanner.nextInt();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void show(int answer) {
        System.out.println(answer);
    }
}
