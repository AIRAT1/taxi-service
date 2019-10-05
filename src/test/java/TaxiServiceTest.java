import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {
    @Test
    @DisplayName("Must calculate the cost with the highest possible discount")
    void calculate() {
        TaxiService service = new TaxiService();
        int calculateValue = service.calculate(100);
        assertEquals(1960, calculateValue);
    }

    @Test
    @DisplayName("Must calculate discount price")
    void calculateMore1() {
        TaxiService service = new TaxiService();
        int calculateValue = service.calculate(50);
        assertEquals(1007, calculateValue);
    }

    @Test
    @DisplayName("Must calculate cost without discount")
    void calculateMore2() {
        TaxiService service = new TaxiService();
        int calculateValue = service.calculate(10);
        assertEquals(260, calculateValue);
    }

    @Test
    @DisplayName("Should return 0 for incorrect values")
    void calculateIncorrectValue() {
        TaxiService service = new TaxiService();
        int calculate = service.calculate(-5);
        assertEquals(0, calculate);
    }
}