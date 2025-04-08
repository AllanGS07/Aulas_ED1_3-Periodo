package aula4;

import java.util.Scanner;


public class Algoritmo398 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cod = new int[50];
        int[] quant = new int[50];
        double[] preco = new double[50];
        int nProdutos = 0;
        double totalVendas = 0.0;
        
        System.out.print("Digite o código do produto ou -1 para acabar: ");
        int codigo = scanner.nextInt();
        while(nProdutos < 50 && codigo != -1) {
            cod[nProdutos] = codigo;
            System.out.print("Digite a quantidade do produto: ");
            quant[nProdutos] = scanner.nextInt();
            System.out.print("Digite o preço do produto: ");
            preco[nProdutos] = scanner.nextDouble();
            nProdutos++;
            if(nProdutos < 50) {
                System.out.print("Digite o código do produto ou -1 para acabar: ");
                codigo = scanner.nextInt();
            }
        }
        
        while (true) {
            System.out.print("Digite o código do produto a ser vendido ou 0 para acabar: ");
            codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            }
            
            int indice = -1;
            for (int i = 0; i < nProdutos; i++) {
                if(cod[i] == codigo) {
                    indice = i;
                    break;
                }
            }
            if (indice == -1) {
                System.out.println("Produto Não-Cadastrado");
                continue;
            }
            
            System.out.print("Digite a quantidade requerida: ");
            int quantidade = scanner.nextInt();
            if (quant[indice] < quantidade) {
                System.out.println("Estoque Insuficiente");
            } else {
                quant[indice] -= quantidade;
                totalVendas += quantidade * preco[indice];
            }
        }
        
        for (int i = 0; i < nProdutos - 1; i++) {
            for (int j = i + 1; j < nProdutos; j++) {
                if(quant[i] < quant[j]) {
                    int auxQuant = quant[i];
                    quant[i] = quant[j];
                    quant[j] = auxQuant;
                    
                    int auxCod = cod[i];
                    cod[i] = cod[j];
                    cod[j] = auxCod;
                    
                    double auxPreco = preco[i];
                    preco[i] = preco[j];
                    preco[j] = auxPreco;
                }
            }
        }
        
        System.out.printf("Total vendido no dia: %.2f%n", totalVendas);
        System.out.println("Relação dos produtos em estoque (ordem decrescente de quantidade):");
        for (int i = 0; i < nProdutos; i++) {
            System.out.println("Código: " + cod[i] + " - Quantidade: " + quant[i]);
        }
        scanner.close();
    }
}
