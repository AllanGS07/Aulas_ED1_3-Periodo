package aula4;

import java.util.Scanner;

public class Algoritmo348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] medias = new double[5];

        for (int L = 0; L < 5; L++) {
            System.out.print("\nDigite o " + (L + 1) + "º nome: ");
            nomes[L] = scanner.nextLine();

            System.out.print("Digite a 1ª nota: ");
            pr1[L] = scanner.nextDouble();

            System.out.print("Digite a 2ª nota: ");
            pr2[L] = scanner.nextDouble();

            scanner.nextLine();

            medias[L] = (pr1[L] + pr2[L]) / 2.0;
        }

        System.out.println("\n\n\ntRELAÇÃO FINAL\n");
        for (int L = 0; L < 5; L++) {
            System.out.println((L + 1) + " - " + nomes[L]);
            System.out.println(pr1[L] + "\t" + pr2[L] + "\t" + medias[L]);
        }
        
        scanner.close();
    }
}
