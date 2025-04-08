package aula4;

import java.util.Scanner;

public class Algoritmo362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[20];
        int[] vetc = new int[10];
        int L = 0;

        System.out.println("Entrada de dados do vetor 1 (10 elementos):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Entre com o " + (i + 1) + "º elemento: ");
            vet1[i] = scanner.nextInt();
        }

        System.out.println("\nEntrada de dados do vetor 2 (20 elementos):");
        for (int i = 0; i < 20; i++) {
            System.out.print("Entre com o " + (i + 1) + "º elemento: ");
            vet2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetc[i] = -999999999;
        }

        for (int i = 0; i < 10; i++) {
            int c = 0;
            while (c < 20 && vet1[i] != vet2[c]) {
                c++;
            }
            if (c < 20 && vet1[i] == vet2[c]) {                
                int d = 0;
                while (d < L && vet1[i] != vetc[d]) {
                    d++;
                }
                if (d == L) {
                    vetc[L] = vet1[i];
                    L++;
                }
            }
        }

        if (L != 0) {
            System.out.println("\nElementos comuns:");
            for (int i = 0; i < L; i++) {
                System.out.println(vetc[i]);
            }
        } else {
            System.out.println("\nNão existem elementos comuns");
        }
        scanner.close();
    }
}
