import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeFactoryTest {

    @Test
    void testcreateExpensiveBike() {
        double price = BikeFactory.createExpensiveBike("a").getGrossPrice();
        assertTrue(price >=800, String.format("price %.2f not >= 800", price));
    }

    @Test
    void testcreateCheapBike() {
    }
}