package aula4;

import java.util.Scanner;

public class Algoritmo346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("\n===============MENU===============");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPÇÃO: ");
            op = scanner.nextInt();
            switch (op) {
                case 1 -> {
                        System.out.print("\nDigite uma frase: ");
                        String frase = scanner.nextLine();
                        System.out.println("\nNúmero de caracteres da frase: " + frase.length());
                    }
                case 2 -> {
                        System.out.print("\nDigite uma frase: ");
                        String frase = scanner.nextLine();
                        if (frase.length() < 4) {
                            System.out.println("\nFrase muito curta para a operação.");
                        } else {
                            String primeiros = frase.substring(0, 2);
                            String ultimos = frase.substring(frase.length() - 2);
                            System.out.println("\nOs dois primeiros caracteres: " + primeiros);
                            System.out.println("Os dois últimos caracteres: " + ultimos);
                        }
                    }
                case 3 -> {
                        System.out.print("\nDigite uma frase: ");
                        String frase = scanner.nextLine();
                        StringBuilder espelhada = new StringBuilder(frase);
                        espelhada.reverse();
                        System.out.println("\nFrase espelhada: " + espelhada);
                    }
                case 4 -> System.out.println("\nFim do algoritmo!");
                default -> System.out.println("\nOpção não disponível!");
            }
            System.out.println();
        } while (op != 4);
        
        scanner.close();
    }
}
