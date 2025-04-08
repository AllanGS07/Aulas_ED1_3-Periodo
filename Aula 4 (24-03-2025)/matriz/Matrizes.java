package matriz;

public class Matrizes {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        for (byte i = 0; i < 3; i++){
            for (byte j = 0; j < 3;  j++){
                numeros.matriz[i][j] = (i * 3 + j + 1);
            }
        }
        for (byte i = 0; i < 3; i++){
            for (byte j = 0; j < 3;  j++){
                System.out.print(numeros.matriz[i][j] + " ");
                if (j == 2) {
                    System.out.println();
                }
            }
        }

        for (byte i = 0; i < 3; i++){
            for (byte j = 0; j < 3; j++){
                numeros.vetor[i * 3 + j] = numeros.matriz[i][j];
            }
        }
        for (byte i = 0; i < numeros.vetor.length; i++){
            System.out.print(numeros.vetor[i] + " ");
        }
    }
}