import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void divideWithAppropriateArguments() {

        Calculator calculator = Calculator.instance.get();
        final int argument1 = 6;
        final int argument2 = 2;
        final int expected = 3;

        final int result = calculator.divide.apply(argument1, argument2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void divideWithZeroArgument() {

        Calculator calculator = Calculator.instance.get();
        final int argument1 = 6;
        final int argument2 = 0;

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide.apply(argument1, argument2));
    }

    @Test
    public void isPositiveWithPositive() {
        Calculator calculator = Calculator.instance.get();
        final int argument = 10;

        final boolean result = calculator.isPositive.test(argument);

        Assertions.assertTrue(result);
    }

    @Test
    public void isPositiveWithNegative() {
        Calculator calculator = Calculator.instance.get();
        final int argument = -5;

        final boolean result = calculator.isPositive.test(argument);

        Assertions.assertFalse(result);
    }
}
