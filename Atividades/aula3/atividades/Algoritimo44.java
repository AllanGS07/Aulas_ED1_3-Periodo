// prog leal7
// real num, base, logaritmo;
// imprima "\nentre com o logaritmando: II;
// leia num;
// imprima \nentre com a base: ";
// leia base;
// logaritmo <- log(num) / log(base);
// imprima "\no logaritmo deb", num, "bna baseb",base, "be:b", logaritmo;
// imprima "\n";
// fi mprog 
package atividades;

import javax.swing.JOptionPane;

public class Algoritimo44 {
    double num;
    double logaritimo;
    double base;

    public static void main(String[] args) {
        Algoritimo44 logaritimo = new Algoritimo44();
        
        logaritimo.num = Double.parseDouble(JOptionPane.showInputDialog("Digite o logaritmando: "));
        logaritimo.base = Double.parseDouble(JOptionPane.showInputDialog("Digite o base: "));
        
        logaritimo.logaritimo = Math.log10(logaritimo.num) /  Math.log10(logaritimo.base);

        JOptionPane.showMessageDialog(null, logaritimo.logaritimo);
    }
}
