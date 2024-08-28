import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Demo1 {
    @Test
    @BeforeAll
    public void start(){
        System.out.println("program started");
    }
    @Test
    @BeforeEach
    public void m1(){
        System.out.println("welcome to m1");
    }
    @Test
    public void trainer(){
        System.out.println("trainned");
    }
    @Test
    @AfterEach
    public void m2(){
        System.out.println("thanku  m2");
    }
    @Test
    @AfterAll
    public void end(){
        System.out.println("end the session");
    }

}
