package aula4;

import java.util.Scanner;

public class Algoritmo370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número de voos:");
        int nv = scanner.nextInt();
        String[] nome = new String[1000];
        int[] voos = new int[1000];

        for (int i = 0; i < nv; i++) {
            System.out.println("Entre com a identificação do voo " + (i + 1) + ":");
            nome[i] = scanner.next();
            System.out.println("Entre com a quantidade de lugares disponíveis no voo " + nome[i] + ":");
            voos[i] = scanner.nextInt();
        }

        System.out.println("Entre com o número do voo desejado ou O para terminar:");
        String nvd = scanner.next();
        while (!nvd.equals("O")) {
            int i = 0;
            while (!nvd.equals(nome[i]) && i < nv - 1) {
                i++;
            }
            if (nvd.equals(nome[i])) {
                if (voos[i] > 0) {
                    voos[i]--;
                    System.out.println("Qual o número da identidade do cliente?");
                    String id = scanner.next();
                    System.out.println("Identidade: " + id + " Voo: " + nvd);
                } else {
                    System.out.println("Não existem mais lugares neste voo.");
                }
            } else {
                System.out.println("Não existe este voo.");
            }
            System.out.println("Entre com o número do voo desejado ou O para terminar:");
            nvd = scanner.next();
        }
        scanner.close();
    }
}