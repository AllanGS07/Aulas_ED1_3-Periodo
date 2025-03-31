package atividades;

import javax.swing.JOptionPane;

public class Algoritimo41 {
    double a;
    double b;
    double c;
    double d;
    double mp;

    public static void main(String[] args) {
        Algoritimo41 mediaPonderada = new Algoritimo41();

        mediaPonderada.a = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número: "));
        mediaPonderada.b = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número: "));
        mediaPonderada.c = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º número: "));
        mediaPonderada.d = Double.parseDouble(JOptionPane.showInputDialog("Digite o 4º número: "));

        mediaPonderada.mp = (mediaPonderada.a*1 + mediaPonderada.b*2 + mediaPonderada.c*3 + mediaPonderada.d*4)/10;

        JOptionPane.showMessageDialog(null, "Media Ponderada: " + mediaPonderada.mp);
    }
}
