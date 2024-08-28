import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JUnitBaics {
    @BeforeEach
    public void beforeEach(){
        System.out.println("running before each of the test case");
    }
    @Test
    @DisplayName("hello world test case")
    public  void testMethod(){
        String actualValue = "hello world";
        Assertions.assertEquals("hello world",actualValue);
        System.out.println(actualValue);
    }
    //@BeforeAll
    @Disabled
    public void testClass(){
        System.out.println("excuted the program without main method");
    }
    @AfterAll
    @Disabled
    public void afterAll(){
        System.out.println("running the program");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("running after each test case");
    }
}
