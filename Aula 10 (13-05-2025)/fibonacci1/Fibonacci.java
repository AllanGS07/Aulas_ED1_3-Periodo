package fibonacci1;

public class Fibonacci {
    public int fibonacci(int x) {
        return(x<2? x : fibonacci(x - 1) + fibonacci(x - 2));
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(12));
    }
}
