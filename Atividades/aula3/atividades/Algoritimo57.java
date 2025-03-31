package atividades;
import javax.swing.JOptionPane;

public class Algoritimo57 {
    public static void main(String[] args) {
        double pr1 = Double.parseDouble(JOptionPane.showInputDialog("Digite pr1: "));
        double pr2 = Double.parseDouble(JOptionPane.showInputDialog("Digite pr2: "));
        
        double mf = (pr1 + pr2) / 2;
        
        JOptionPane.showMessageDialog(null, "Media truncada: " +  (int) mf);
        JOptionPane.showMessageDialog(null, "Media arredondada: " + (int) Math.round(mf));
    }
}
