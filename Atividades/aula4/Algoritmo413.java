package aula4;

import java.util.Scanner;

public class Algoritmo413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] n = new int[5][5];
        int soma = 0;
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Digite elemento: ");
                n[L][c] = scanner.nextInt();
            }
        }
        System.out.println("\nToda a matriz");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(n[L][c] + "\t");
            }
            System.out.println();
        }
        for (int L = 1; L < 5; L++) {
            for (int c = 0; c < L; c++) {
                if (n[L][c] % 2 != 0) {
                    soma += n[L][c] * n[L][c];
                }
            }
        }
        System.out.println("\nRaiz quadrada da soma dos quadrados dos números ímpares: " + Math.sqrt(soma));
        scanner.close();
    }
}
