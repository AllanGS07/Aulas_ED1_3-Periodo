package atividades;
import javax.swing.JOptionPane;

public class Algoritimo163 {
    public static void main(String[] args) {
        for (int voltaLagoa = 1; voltaLagoa <= 3; voltaLagoa++) {
            JOptionPane.showMessageDialog(null, voltaLagoa + "ª volta na Lagoa.");
            
            for (int abdominais = 1; abdominais <= 5; abdominais++) {
                JOptionPane.showMessageDialog(null, abdominais + "º abdominal.");
            }
        }
    }
}