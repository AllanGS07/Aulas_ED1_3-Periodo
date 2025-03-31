package atividades;
import javax.swing.JOptionPane;

public class Algoritimo161 {
    public static void main(String[] args) {
        for (int c = 1; c <= 5; c++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (" + c + " de 5):"));
            int quadrado = num * num;
            JOptionPane.showMessageDialog(null, "Quadrado de " + num + " é " + quadrado);
        }
    }
}
