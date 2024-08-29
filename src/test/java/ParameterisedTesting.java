import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterisedTesting {
    Pallindrome pal;

    @BeforeEach
    public void init() {
        pal = new Pallindrome();
        System.out.println(" executed every time before every method ");
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "rotator", "civic"})
    public void valuesource(String s) {
        assertEquals(true, pal.check_Palindrome(s));
    }

    @ParameterizedTest
    @CsvSource({
            "true,2",
            "false,6",
            "true,7"
    })
    public void csvsource(boolean expected, int input) {
        assertEquals(expected, pal.isPrime(input));
    }

    enum Data {
        madam, rotator, civic
    }

    @ParameterizedTest
    @EnumSource(Data.class)
    public void enumsource(Data data) {
        assertEquals(true, pal.check_Palindrome(data.name()));
    }

    public static String[] data() {
        return new String[]{"madam", "rotator", "civic"};
    }

    @ParameterizedTest
    @MethodSource("data")
    public void enumsource(String ss) {
        assertEquals(true, pal.check_Palindrome(ss));
    }

}

