public class Calculator {
    public int add(int a,int b) {
        return a + b;
    }
    public int div(int a,int b){
        if(b==0)
            throw new ArithmeticException("B value should be non-zero number==>"+b);
        return (a/b);
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public int subtraction(int a,int b){
        return a-b;
    }
}
