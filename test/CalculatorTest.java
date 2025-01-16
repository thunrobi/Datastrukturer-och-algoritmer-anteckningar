import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testMultiply(){
        Calculator calc = new Calculator();
      assertEquals(50, calc.multiply(2,25));
    }
}
