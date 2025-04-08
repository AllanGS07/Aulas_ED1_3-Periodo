package aula4;

import java.util.Scanner;

public class Algoritmo360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ultDia = new int[12];
        String[] signo = new String[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("\nDigite signo: ");
            signo[i] = scanner.next();
            System.out.print("Digite último dia: ");
            ultDia[i] = scanner.nextInt();
        }

        System.out.print("\nDigite data no formato ddmm ou 9999 para terminar: ");
        int data = scanner.nextInt();

        while (data != 9999) {
            int dia = data / 100;
            int mes = data % 100;
            mes--; // ajustar para índice do vetor
            if (dia > ultDia[mes]) {
                mes = (mes + 1) % 12;
            }
            System.out.println("\nSigno: " + signo[mes] + "\n");
            System.out.print("Digite data no formato ddmm ou 9999 para terminar: ");
            data = scanner.nextInt();
        }
        System.out.println("\n");
        scanner.close();
    }
}
