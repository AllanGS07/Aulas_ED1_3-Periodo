package atividades;

public class Algoritimo167 {
    public static void main(String[] args) {
        System.out.println("ACIMA DA DIAGONAL PRINCIPAL");

        for (int L = 1; L <= 9; L++) {
            for (int c = L + 1; c <= 10; c++) {
                System.out.print("\t" + L + "-" + c);
            }
            System.out.println();
            for (int t = 1; t <= L; t++) {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}