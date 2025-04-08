package aula4;

import java.util.Scanner;

public class Algoritmo356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL = 15;
        String[] nomes = new String[TOTAL];
        double[] pr1 = new double[TOTAL];
        double[] pr2 = new double[TOTAL];
        int[] media = new int[TOTAL];
        String[] situacao = new String[TOTAL];

        for (int i = 0; i < TOTAL; i++) {
            System.out.print("\n\nDigite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.next();
            while (nomes[i].length() > 30) {
                System.out.println("Nomes com até 30 caracteres!");
                System.out.print("\n\nDigite o " + (i + 1) + "º nome: ");
                nomes[i] = scanner.next();
            }
            int t = 30 - nomes[i].length();
            for (int j = 0; j < t; j++) {
                nomes[i] += " ";
            }
            System.out.print("\nDigite a 1ª nota: ");
            pr1[i] = scanner.nextDouble();
            System.out.print("\nDigite a 2ª nota: ");
            pr2[i] = scanner.nextDouble();
            media[i] = (int) Math.round((pr1[i] + pr2[i]) / 2.0);
            if (media[i] >= 5) {
                situacao[i] = "AP";
            } else {
                situacao[i] = "RP";
            }
        }

        System.out.println("\n\n\n\t\t\t\tRELAÇÃO FINAL");
        for (int i = 0; i < TOTAL; i++) {
            System.out.println((i + 1) + "- " + nomes[i] + "\t" + pr1[i] + "\t" + pr2[i] + "\t" + media[i] + "\t" + situacao[i]);
        }
        scanner.close();
    }
}
