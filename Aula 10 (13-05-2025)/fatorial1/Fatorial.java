package fatorial1;

public class Fatorial {
    public int fatorial(int x){
        if (x == 0){
            return 1;
        }
        return (x * fatorial(x - 1));
    }
    
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        System.out.println(fatorial.fatorial(10));
    }
}