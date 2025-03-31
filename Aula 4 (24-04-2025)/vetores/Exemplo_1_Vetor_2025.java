package vetores;

public class Exemplo_1_Vetor_2025 {
    public static void main(String[] args) {
        Numeros numero = new Numeros();

        for (byte i=0; i < 10; i++){
            numero.vetor[i] = i;
            System.err.println(numero.vetor[i]);
        }

        System.err.println("\n");
        
        byte i = 0;
        while (i < 10) {
            numero.vetor[i] = i;
            System.err.println(numero.vetor[i]);
            i++;
        }
    }
}
