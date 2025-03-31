package atividades;

import javax.swing.JOptionPane;

public class Algoritimo40{
    int quociente;
    int resto;
    int valor1;
    int valor2;

    public static void main(String[] args) {
        Algoritimo40 divisao = new Algoritimo40();
        divisao.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digigite o valor 1: "));
        divisao.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digigite o valor 2: "));

        divisao.quociente = divisao.valor1 / divisao.valor2;
        divisao.resto = divisao.valor1 % divisao.valor2;

        JOptionPane.showMessageDialog(null, "Dividendo: " + divisao.valor1);
        JOptionPane.showMessageDialog(null, "Divisor: " + divisao.valor2);
        JOptionPane.showMessageDialog(null, "Quociente: " + divisao.quociente);
        JOptionPane.showMessageDialog(null, "Resto: " + divisao.resto);
    }
}
