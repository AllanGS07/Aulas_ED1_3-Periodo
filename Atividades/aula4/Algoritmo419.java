package aula4;

import java.util.Scanner;

public class Algoritmo419 {
public static void main(String[] args) {
    int[][] A = new int[5][5], B = new int[5][5], DIF = new int[5][5];
    Scanner scanner = new Scanner(System.in);
    for (int L = 0; L < 5; L++) {
        for (int c = 0; c < 5; c++) {
            System.out.print("\nDigite elemento de A[" + (L + 1) + "][" + (c + 1) + "]: ");
            A[L][c] = scanner.nextInt();
        }
    }
    for (int L = 0; L < 5; L++) {
        for (int c = 0; c < 5; c++) {
            System.out.print("\nDigite elemento de B[" + (L + 1) + "][" + (c + 1) + "]: ");
            B[L][c] = scanner.nextInt();
            DIF[L][c] = A[L][c] - B[L][c];
        }
    }
    System.out.println("\n\tMATRIZ DIFERENÇA\n");
    for (int L = 0; L < 5; L++) {
        for (int c = 0; c < 5; c++) {
            System.out.print("\t" + DIF[L][c]);
        }
        System.out.println();
    }
    System.out.println();
    scanner.close();
}
}