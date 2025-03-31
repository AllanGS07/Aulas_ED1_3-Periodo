package atividades;

import javax.swing.JOptionPane;

public class Algoritimo54 {
    public float base;
    public float altura;

    public static void main(String[] args) {
        Algoritimo54 areaTriangulo = new Algoritimo54();

        areaTriangulo.base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        areaTriangulo.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo: "));

        JOptionPane.showMessageDialog(null, "Área do triângulo: " + ((areaTriangulo.base * areaTriangulo.altura) / 2));
        
    }
}
