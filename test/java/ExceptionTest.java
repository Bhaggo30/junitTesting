import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExceptionTest {

    ExceptionDivide devide = new ExceptionDivide(10,2);
    ExceptionDivide devide1 = new ExceptionDivide(10,0);


    @Test()
    public void testDevisionMethod(){
        Assertions.assertEquals(5,devide.devisionMethod());

    }
    @Test
    public void testException(){
        Assertions.assertEquals(5,devide1.devisionMethod());
    }
}
