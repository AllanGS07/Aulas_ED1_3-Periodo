package input;
import javax.swing.JOptionPane;

public class Input {
    public static void main(String[] args) {
        String nome;
        float peso;
        float altura;

        nome = JOptionPane.showInputDialog("Insira seu nome: ");
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));

        float imc = peso / (altura * altura);

        System.out.println("Olá " + nome + ". Seu IMC é: " + imc);
    }
}
