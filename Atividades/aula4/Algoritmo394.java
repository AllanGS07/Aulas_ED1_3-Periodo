package aula4;

import java.util.Scanner;

public class Algoritmo394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int total = 50;
        String[] nomes = new String[total];
        double[] nota1 = new double[total];
        double[] nota2 = new double[total];
        double[] media = new double[total];

        boolean nomesCadastrados = false;
        boolean nota1Cadastrada = false;
        boolean nota2Cadastrada = false;
        String op;

        do {
            System.out.println("\n\n\nMENU");
            System.out.println("1 - Entrar nomes");
            System.out.println("2 - Entrar 1ª nota");
            System.out.println("3 - Entrar 2ª nota");
            System.out.println("4 - Calcular média");
            System.out.println("5 - Listar no display");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            op = scanner.next();

            if(op.equals("1")) {
                nomesCadastrados = true;
                for(int L = 0; L < total; L++){
                    System.out.print("Digite o " + (L+1) + "º nome (com até 30 caracteres e todas as letras maiúsculas): ");
                    nomes[L] = scanner.next();
                    while(nomes[L].length() > 30) {
                        System.out.print("Nome com até 30 caracteres. Digite o " + (L+1) + "º nome (todas as letras maiúsculas): ");
                        nomes[L] = scanner.next();
                    }
                    while(nomes[L].length() < 30) {
                        nomes[L] += "B";
                    }
                }
            }
            else if(op.equals("2")) {
                if(!nomesCadastrados) {
                    System.out.println("\nNÃO HÁ NOMES CADASTRADOS");
                } else {
                    for(int L = 0; L < total; L++){
                        System.out.print("Digite a 1ª nota do aluno " + nomes[L] + ": ");
                        nota1[L] = scanner.nextDouble();
                    }
                    nota1Cadastrada = true;
                }
            }
            else if(op.equals("3")) {
                if(!nomesCadastrados) {
                    System.out.println("\nNÃO HÁ NOMES CADASTRADOS");
                } else {
                    for(int L = 0; L < total; L++){
                        System.out.print("Digite a 2ª nota do aluno " + nomes[L] + ": ");
                        nota2[L] = scanner.nextDouble();
                    }
                    nota2Cadastrada = true;
                }
            }
            else if(op.equals("4")) {
                if(!nomesCadastrados || !nota1Cadastrada || !nota2Cadastrada) {
                    System.out.println("\nNEM TODOS OS DADOS ESTÃO CADASTRADOS");
                } else {
                    for(int L = 0; L < total; L++){
                        media[L] = (3 * nota1[L] + 7 * nota2[L]) / 10;
                    }
                    System.out.println("\nMédias calculadas com sucesso.");
                }
            }
            else if(op.equals("5")) {
                if(!nomesCadastrados || !nota1Cadastrada || !nota2Cadastrada) {
                    System.out.println("\nNEM TODOS OS DADOS ESTÃO CADASTRADOS");
                } else {
                    System.out.println("\nNOME                               \tNOTA1\tNOTA2\tMÉDIA");
                    for(int L = 0; L < total; L++){
                        System.out.printf("%-35s\t%.2f\t%.2f\t%.2f%n", nomes[L], nota1[L], nota2[L], media[L]);
                    }
                }
            }
            else if(op.equals("6")) {
                System.out.println("Saindo...");
                break;
            }
            else {
                System.out.println("\nOPÇÃO NÃO DISPONÍVEL");
            }
        } while(!op.equals("6"));

        scanner.close();
    }
}
