package diagonais;

import javax.swing.JOptionPane;

public class CalcularDiagonal {
    public static void main(String[] args) {
        Paralelepipedo pp = new Paralelepipedo();
        pp.dA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da lateral A: "));
        pp.dB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da lateral B: "));
        pp.dC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da lateral C: "));

        pp.dDiagonal = Math.sqrt(Math.pow(pp.dA, 2) + Math.pow(pp.dB, 2) + Math.pow(pp.dC, 2));

        JOptionPane.showMessageDialog(null, "O valor da Diagonal é: " + pp.dDiagonal);
    }
}
