import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
@TestInstance(Lifecycle.PER_CLASS)// Allows the method source to be non-static
public class CalculatorTest1 {

    // Enum for testing with @EnumSource
    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    // Parameterized Test with @CsvSource for the add method
    @CsvSource({
            "1, 2, 3",
            "-1, -2, -3",
            "0, 5, 5",
            "100, 200, 300"
    })
    void testAddWithCsvSource(int a, int b, int expected) {
        assertEquals(expected, ParametricedCalculator.add(a,b));
    }

    // Parameterized Test with @CsvFileSource for the subtract method
//    @ParameterizedTest
//    @CsvFileSource(resources = "/subtract_data.csv", numLinesToSkip = 1)
    @DisplayName("Test subtraction with CsvFileSource")
    void testSubtractWithCsvFileSource(int a, int b, int expected) {
        assertEquals(expected, ParametricedCalculator.subtract(a, b));
    }

    // Parameterized Test with @EnumSource for the multiply method
    @EnumSource(Operation.class)
    @DisplayName("Test multiplication with EnumSource")
    void testMultiplyWithEnumSource(Operation operation) {
        if (operation == Operation.MULTIPLY) {
            assertEquals(6, ParametricedCalculator.multiply(2, 3));
        }
    }

    // Method Source for generating test data for division
    static Stream<Object[]> divisionProvider() {
        return Stream.of(
                new Object[]{6, 3, 2.0},
                new Object[]{10, 2, 5.0},
                new Object[]{9, 3, 3.0},
                new Object[]{100, 4, 25.0}
        );
    }

    // Parameterized Test with @MethodSource for the divide method
    @MethodSource("divisionProvider")
    @DisplayName("Test division with MethodSource")
    void testDivideWithMethodSource(int a, int b, double expected) {
        assertEquals(expected, ParametricedCalculator.divide(a, b));
    }

    // Additional test for division by zero using @CsvSource
    @CsvSource({
            "6, 0",
            "10, 0"
    })
    @DisplayName("Test division by zero with CsvSource")
    void testDivideByZero(int a, int b) {
        assertThrows(IllegalArgumentException.class, () -> ParametricedCalculator.divide(a, b));
    }
}


