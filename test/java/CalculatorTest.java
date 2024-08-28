import org.junit.jupiter.api.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void setUpBeforeAll() {
        // This will run once before any of the test methods in this class.
        System.out.println("BeforeAll: Initialize resources like a database connection.");
    }

    @AfterAll
    static void tearDownAfterAll() {
        // This will run once after all the test methods in this class have run.
        System.out.println("AfterAll: Clean up resources like closing the database connection.");
    }

    @BeforeEach
    void setUpBeforeEach() {
        // This will run before each test method.
        calculator = new Calculator();
        System.out.println("BeforeEach: Create a new Calculator instance.");
    }

    @AfterEach
    void tearDownAfterEach() {
        // This will run after each test method.
        System.out.println("AfterEach: Perform any cleanup after each test.");
    }

    @Test
    void testAddition() {
        // This is the first test method.
        System.out.println("Test: Running testAddition.");
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testSubtraction() {
        // This is the second test method.
        System.out.println("Test: Running testSubtraction.");
        int result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

