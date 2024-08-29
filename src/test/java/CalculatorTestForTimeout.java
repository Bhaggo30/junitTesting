import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTestForTimeout {

    Calculator calculator = new Calculator();

    @Test()
    void testSlowAddWithTimeout() {
        assertTimeout(Duration.ofSeconds(5), () -> {
            calculator.slowAdd(1, 2);
        });
    }

    @Test
    void testSlowAddWithPreemptiveTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            calculator.slowAdd(1, 2);
        });
    }
}
