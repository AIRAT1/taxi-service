import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {
    @Test
    @DisplayName("Should calculate cost with correct entered values")
    void calculate() {
        TaxiService service = new TaxiService();
        int calculateValue = service.calculate(100);
        assertEquals(1960, calculateValue);
    }

    @Test
    @DisplayName("Should calculate cost with correct entered values")
    void calculateMore1() {
        TaxiService service = new TaxiService();
        int calculateValue = service.calculate(50);
        assertEquals(1007, calculateValue);
    }

    @Test
    @DisplayName("Should calculate cost with correct entered values")
    void calculateMore2() {
        TaxiService service = new TaxiService();
        int calculateValue = service.calculate(10);
        assertEquals(260, calculateValue);
    }

    @Test
    @DisplayName("Should calculate cost with incorrect entered values")
    void calculateIncorrectValue() {
        TaxiService service = new TaxiService();
        int calculate = service.calculate(-5);
        assertEquals(0, calculate);
    }
}