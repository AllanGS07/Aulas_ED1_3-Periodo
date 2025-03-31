package atividades;

import javax.swing.JOptionPane;

public class Algoritimo43 {
    double num;
    double logaritimo;

    public static void main(String[] args) {
        Algoritimo43 logaritimo = new Algoritimo43();
        
        logaritimo.num = Double.parseDouble(JOptionPane.showInputDialog("Digite o logaritmando: "));
        logaritimo.logaritimo = Math.log10(logaritimo.num);

        JOptionPane.showMessageDialog(null, logaritimo.logaritimo);
    }
}
