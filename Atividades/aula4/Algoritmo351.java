package aula4;

import java.util.Scanner;

public class Algoritmo351 {

    public static void main(String[] args) {
        String[] nomes = {"ANITA", "GUTO", "JOAO", "PEDRO", "FILIPE"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nome " + (i + 1) + ": " + nomes[i]);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero da pessoa: ");
        int num = scanner.nextInt();

        while (num < 1 || num > 5) {
            System.out.println("Número fora do intervalo");
            System.out.print("Digite o numero da pessoa: ");
            num = scanner.nextInt();
        }

        System.out.println(nomes[num - 1]);
        scanner.close();
    }
}
