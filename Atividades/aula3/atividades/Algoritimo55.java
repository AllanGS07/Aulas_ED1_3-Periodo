package atividades;

import javax.swing.JOptionPane;

public class Algoritimo55 {
    public float diagonalMaior;
    public float diagonalMenor;
    public float areaLosango;

    public static void main(String[] args) {
        Algoritimo55 areaDoLosango = new Algoritimo55();

    areaDoLosango.diagonalMaior = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da maior diagonal: "));
    areaDoLosango.diagonalMenor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da menor diagonal: "));
    
    areaDoLosango.areaLosango = (areaDoLosango.diagonalMaior * areaDoLosango.diagonalMenor) / 2;

    JOptionPane.showMessageDialog(null, "Área do losango: " + areaDoLosango.areaLosango);
    }
}
