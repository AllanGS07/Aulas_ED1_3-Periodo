package atividades;

import javax.swing.JOptionPane;

public class Algoritimo59 {
    public static void main(String[] args) {
        double catetoAdjacente = Double.parseDouble(
                JOptionPane.showInputDialog("Entre com o cateto adjacente:"));
        double catetoOposto = Double.parseDouble(
                JOptionPane.showInputDialog("Entre com o cateto oposto:"));

        double hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));
        JOptionPane.showMessageDialog(null, "A hipotenusa é " + hipotenusa);
    }
}
