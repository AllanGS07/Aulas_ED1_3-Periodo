package aula4;

import java.util.Scanner;

public class Algoritmo354 {
    public static void main(String[] args) {
        int[] num = new int[15];
        Scanner scanner = new Scanner(System.in);

        for (int L = 0; L < 15; L++) {
            System.out.print((L + 1) + "º número: ");
            num[L] = scanner.nextInt();
        }

        System.out.println("\nRELAÇÃO DOS NÚMEROS");
        for (int L = 0; L < 15; L++) {
            System.out.print((L + 1) + "- " + num[L]);
            if (num[L] % 2 == 0) {
                System.out.println(" é PAR");
            } else {
                System.out.println(" é ÍMPAR");
            }
        }
        
        scanner.close();
    }
}
