public class Calculator {

    public int slowAdd(int a, int b) throws InterruptedException {
        Thread.sleep(5000);
        return a + b;
    }
}
