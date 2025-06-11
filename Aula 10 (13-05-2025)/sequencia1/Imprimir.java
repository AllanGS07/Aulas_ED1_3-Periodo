package sequencia1;

public class Imprimir {
    public void imprimirsequencia(int x){
        if (x == 0){
            return;
        }
        System.out.println(x);
        imprimirsequencia(x - 1);
    }
    
    public static void main(String[] args) {
        Imprimir imprimir = new Imprimir();
        imprimir.imprimirsequencia(5);
    }
}
