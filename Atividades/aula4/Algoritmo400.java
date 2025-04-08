import java.util.Scanner;

package aula4;

public class Algoritmo400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] leitos = new int[50], nd = new int[50];
        double[] precos = new double[50], despesas = new double[50];
        String[] sit = new String[50], din = new String[50], dout = new String[50], nome = new String[50], tel = new String[50];
        int chave = 0, op = 0, quarto = 0, i;
        String resp, respi, nomep;
        do {
            System.out.println("\n\n\nHotel Fazenda Sucesso");
            System.out.println("\n1. Cadastra quartos");
            System.out.println("2. Lista todos os quartos");
            System.out.println("3. Lista quartos ocupados");
            System.out.println("4. Aluguel/reserva quarto");
            System.out.println("5. Entra despesas extras");
            System.out.println("6. Calcula despesa do quarto");
            System.out.println("7. Sai");
            System.out.print("\nOpção: ");
            op = scanner.nextInt();
            scanner.nextLine();
            if(op == 1) {
                if(chave == 1) {
                    System.out.println("\nAtenção. Dados já cadastrados");
                } else {
                    for(i = 0; i < 50; i++) {
                        System.out.print("\nQuantidade de leitos para o quarto " + (i + 1) + ": ");
                        leitos[i] = scanner.nextInt();
                        System.out.print("Preço do quarto: ");
                        precos[i] = scanner.nextDouble();
                        scanner.nextLine();
                        sit[i] = "L";
                        nd[i] = 0;
                        despesas[i] = 0.0;
                        din[i] = "XXXX";
                        dout[i] = "XXXX";
                        nome[i] = "";
                        tel[i] = "";
                    }
                    chave = 1;
                }
            } else if(op == 2) {
                if(chave == 0) {
                    System.out.println("\nEscolha a opção 1");
                } else {
                    for(i = 0; i < 50; i++) {
                        System.out.println("\nNúmero do quarto: " + (i + 1));
                        System.out.println("Situação do quarto: " + sit[i]);
                        if(sit[i].equals("A") || sit[i].equals("R")) {
                            System.out.println("Nome: " + nome[i]);
                            System.out.println("Telefone: " + tel[i]);
                        }
                        System.out.println("Quantidade de leitos: " + leitos[i]);
                        System.out.println("Preço do quarto: " + precos[i]);
                        System.out.println("Despesas: " + despesas[i]);
                        System.out.println("Data de entrada: " + din[i]);
                        System.out.println("Data de saída: " + dout[i]);
                        System.out.println("Número de diárias: " + nd[i]);
                        System.out.println("Pressione enter para continuar...");
                        scanner.nextLine();
                    }
                }
            } else if(op == 3) {
                if(chave == 0) {
                    System.out.println("\nEscolha a opção 1");
                } else {
                    for(i = 0; i < 50; i++) {
                        if(sit[i].equals("A")) {
                            System.out.println("\nNúmero do quarto: " + (i + 1));
                            System.out.println("Despesas: " + despesas[i]);
                            System.out.println("Data de entrada: " + din[i]);
                            System.out.println("Data de saída: " + dout[i]);
                            System.out.println("Número de dias: " + nd[i]);
                            System.out.println("Pressione enter para continuar...");
                            scanner.nextLine();
                        }
                    }
                }
            } else if(op == 4) {
                if(chave == 0) {
                    System.out.println("\nEscolha a opção 1");
                } else {
                    System.out.print("\nDigite A (aluguel) ou R (reserva): ");
                    resp = scanner.nextLine();
                    while(!resp.equalsIgnoreCase("A") && !resp.equalsIgnoreCase("R")) {
                        System.out.print("\nResposta inválida. Digite A (aluguel) ou R (reserva): ");
                        resp = scanner.nextLine();
                    }
                    if(resp.equalsIgnoreCase("A")) {
                        System.out.print("\nTinha reserva (S/N)? ");
                        respi = scanner.nextLine();
                        if(respi.equalsIgnoreCase("S")) {
                            System.out.print("\nEntre com nome: ");
                            nomep = scanner.nextLine();
                            i = 0;
                            while(i < 50 && !nome[i].equalsIgnoreCase(nomep)) {
                                i++;
                            }
                            if(i < 50 && nome[i].equalsIgnoreCase(nomep)) {
                                quarto = i;
                                sit[quarto] = "A";
                                despesas[quarto] = 0.0;
                                System.out.print("Data de entrada: ");
                                din[quarto] = scanner.nextLine();
                                System.out.print("Data de saída: ");
                                dout[quarto] = scanner.nextLine();
                                System.out.print("Número de dias: ");
                                nd[quarto] = scanner.nextInt();
                                scanner.nextLine();
                            } else {
                                System.out.println("\nReserva não encontrada");
                            }
                        } else {
                            for(i = 0; i < 50; i++) {
                                if(sit[i].equals("L")) {
                                    System.out.println("\nNúmero do quarto: " + (i + 1));
                                    System.out.println("Quantidade de leitos: " + leitos[i]);
                                    System.out.println("Preço do quarto: " + precos[i]);
                                    System.out.println("Pressione enter para continuar...");
                                    scanner.nextLine();
                                }
                            }
                            System.out.print("\nDigite o número do quarto para aluguel ou reserva: ");
                            quarto = scanner.nextInt();
                            scanner.nextLine();
                            while(quarto < 1 || quarto > 50) {
                                System.out.print("\nQuarto inválido. Entre novamente: ");
                                quarto = scanner.nextInt();
                                scanner.nextLine();
                            }
                            while(sit[quarto - 1].equals("A")) {
                                System.out.print("\nQuarto ocupado. Digite novamente: ");
                                quarto = scanner.nextInt();
                                scanner.nextLine();
                            }
                            sit[quarto - 1] = "A";
                            despesas[quarto - 1] = 0.0;
                            System.out.print("Digite nome: ");
                            nome[quarto - 1] = scanner.nextLine();
                            System.out.print("Digite telefone para contato: ");
                            tel[quarto - 1] = scanner.nextLine();
                            System.out.print("Data de entrada: ");
                            din[quarto - 1] = scanner.nextLine();
                            System.out.print("Data de saída: ");
                            dout[quarto - 1] = scanner.nextLine();
                            System.out.print("Número de dias: ");
                            nd[quarto - 1] = scanner.nextInt();
                            scanner.nextLine();
                        }
                    } else if(resp.equalsIgnoreCase("R")) {
                        for(i = 0; i < 50; i++) {
                            if(sit[i].equals("L")) {
                                System.out.println("\nNúmero do quarto: " + (i + 1));
                                System.out.println("Quantidade de leitos: " + leitos[i]);
                                System.out.println("Preço do quarto: " + precos[i]);
                                System.out.println("Pressione enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        System.out.print("\nDigite o número do quarto para aluguel ou reserva: ");
                        quarto = scanner.nextInt();
                        scanner.nextLine();
                        while(quarto < 1 || quarto > 50) {
                            System.out.print("\nQuarto inválido. Entre novamente: ");
                            quarto = scanner.nextInt();
                            scanner.nextLine();
                        }
                        while(sit[quarto - 1].equals("A")) {
                            System.out.print("\nQuarto ocupado. Digite novamente: ");
                            quarto = scanner.nextInt();
                            scanner.nextLine();
                        }
                        sit[quarto - 1] = "R";
                        System.out.print("Digite nome: ");
                        nome[quarto - 1] = scanner.nextLine();
                        System.out.print("Digite telefone para contato: ");
                        tel[quarto - 1] = scanner.nextLine();
                        System.out.print("Data de entrada: ");
                        din[quarto - 1] = scanner.nextLine();
                        System.out.print("Data de saída: ");
                        dout[quarto - 1] = scanner.nextLine();
                        System.out.print("Número de dias: ");
                        nd[quarto - 1] = scanner.nextInt();
                        scanner.nextLine();
                    }
                }
            } else if(op == 5) {
                if(chave == 0) {
                    System.out.println("\nEscolha a opção 1");
                } else {
                    System.out.print("\nEntre com número do quarto: ");
                    quarto = scanner.nextInt();
                    scanner.nextLine();
                    while(quarto < 1 || quarto > 50) {
                        System.out.print("\nEntre com número do quarto: ");
                        quarto = scanner.nextInt();
                        scanner.nextLine();
                    }
                    System.out.print("Despesas: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    despesas[quarto - 1] = despesas[quarto - 1] + valor;
                }
            } else if(op == 6) {
                if(chave == 0) {
                    System.out.println("\nEscolha a opção 1");
                } else {
                    System.out.print("\nEntre com número do quarto: ");
                    quarto = scanner.nextInt();
                    scanner.nextLine();
                    while(quarto < 1 || quarto > 50) {
                        System.out.print("\nEntre com número do quarto: ");
                        quarto = scanner.nextInt();
                        scanner.nextLine();
                    }
                    double total = despesas[quarto - 1] + precos[quarto - 1];
                    System.out.println("\nDespesas: R$ " + total);
                    sit[quarto - 1] = "L";
                    despesas[quarto - 1] = 0.0;
                    din[quarto - 1] = "XXXX";
                    dout[quarto - 1] = "XXXX";
                    nd[quarto - 1] = 0;
                    nome[quarto - 1] = "";
                    tel[quarto - 1] = "";
                }
            } else if(op == 7) {
                System.out.println("\nSaindo");
            } else {
                System.out.println("\nOpção não disponível");
            }
        } while(op != 7);
        scanner.close();
    }
}
