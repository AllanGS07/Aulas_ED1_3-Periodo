package atividades;

import javax.swing.JOptionPane;

public class Algoritimo42 {
    double angulo;
    double anguloEmRadianos;

    public static void main(String[] args) {
        Algoritimo42 funcoesTrigonometricas = new Algoritimo42();

        funcoesTrigonometricas.angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o angulo(em graus): "));
        funcoesTrigonometricas.anguloEmRadianos = (funcoesTrigonometricas.angulo * Math.PI) / 180;

        JOptionPane.showMessageDialog(null, "Seno: " + Math.sin(funcoesTrigonometricas.anguloEmRadianos));
        JOptionPane.showMessageDialog(null, "Coseno: " + Math.cos(funcoesTrigonometricas.anguloEmRadianos));
        JOptionPane.showMessageDialog(null, "Tangente: " + Math.tan(funcoesTrigonometricas.anguloEmRadianos));
        JOptionPane.showMessageDialog(null, "Secante: " + (1 / Math.cos(funcoesTrigonometricas.anguloEmRadianos)));
        JOptionPane.showMessageDialog(null, "Cosecante: " + (1 / Math.sin(funcoesTrigonometricas.anguloEmRadianos)));
        JOptionPane.showMessageDialog(null, "Cotangente: " + (1 / Math.tan(funcoesTrigonometricas.anguloEmRadianos)));
    }
}
