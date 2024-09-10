import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorsTest {

    Calculators calc = new Calculators();


    @Test
    @DisplayName("assert test for adding a and b")
    public void assertEqual(){
        Assertions.assertEquals(4,calc.add(2,2),"test cases pass");
    }

    @Test
    @DisplayName("assert test not equal")
    public void assertNotEqual(){
        Assertions.assertNotEquals(5,calc.add(2,2),"test cases failed");
    }
    @Test
    @DisplayName("assert array are equal")
    public void asserArrayEqual(){
        Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3},"test is pass");
    }
    @Test
    @DisplayName("assert iterable objects")
    public void assertIterableEqual(){
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));

        Assertions.assertIterableEquals(list1,list2,"list are equal");

    }
    @Test
    @DisplayName("the string is null or not")
    public void assertNotNull(){
        String nullString = "";
        String notNullString = "bhagyashree";

        Assertions.assertNotNull(nullString,"the string is null");

    }
    @Test
    @DisplayName("condition is true or false")
    public void assertTrueTest() {

        boolean trueValue = true;
        boolean falsevalue = false;

        Assertions.assertTrue(trueValue, "assert true is failed");
    }
        @Test
        @DisplayName("condition is true or false")
        public void assertFalseTest(){

            boolean trueValue = true;
            boolean falsevalue = false;

            Assertions.assertFalse(falsevalue,"assert false is failed");
    }
    @Test
    @DisplayName("throw an exception")
    public void assertExceptionTest(){
        Assertions.assertThrows(ArithmeticException.class,()->calc.devide(10,0));
    }

}
