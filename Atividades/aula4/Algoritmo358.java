package aula4;

import java.util.Scanner;

public class Algoritmo358 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];
        int totLucroMenor10 = 0;
        int totLucroEntre10E20 = 0;
        int totLucroMaior20 = 0;
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Preço de compra: ");
            precoCompra[i] = scanner.nextDouble();
            System.out.print("Preço de venda: ");
            precoVenda[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < 100; i++) {
            double lucro = precoVenda[i] - precoCompra[i];
            if (lucro < 10.0)
                totLucroMenor10++;
            else if (lucro <= 20.0)
                totLucroEntre10E20++;
            else
                totLucroMaior20++;
        }
        
        System.out.println("\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totLucroEntre10E20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totLucroMaior20);
        
        scanner.close();
    }
}