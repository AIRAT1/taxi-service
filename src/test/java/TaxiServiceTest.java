import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {
    @Test
    void calculate() {
        TaxiService service = new TaxiService();
        int calculateValue = service.calculate(100);
        assertEquals(1960, calculateValue);
    }

    @Test
    void calculateIncorrectValue() {
        TaxiService service = new TaxiService();
        int calculate = service.calculate(-5);
        assertEquals(0, calculate);
    }
}