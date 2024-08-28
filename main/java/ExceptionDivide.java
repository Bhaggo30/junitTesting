public class ExceptionDivide {

    int n1;
    int n2;

    ExceptionDivide(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;

    }
    public int devisionMethod() throws  ArithmeticException{
        return n1/n2;


    }
}
