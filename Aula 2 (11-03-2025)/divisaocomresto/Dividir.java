package divisaocomresto;

public class Dividir {
    public static void main (String[] args){
        Divisao div = new Divisao();
        div.dividendo = 5;
        div.divisor = 3;

        int quociente = div.dividendo / div.divisor;
        int resto = div.dividendo % div.divisor;

        div.quociente = quociente;
        div.resto = resto;

        System.out.println("Dividendo: " + div.dividendo);
        System.out.println("Divisor: " + div.divisor);
        System.out.println("Quociente: " + div.quociente);
        System.out.println("Resto: " + div.resto);
    }
}
