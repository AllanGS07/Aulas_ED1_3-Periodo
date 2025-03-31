package atividades;

import javax.swing.JOptionPane;

public class Algoritimo56 {
    public String nome;
    public byte idade;

    public static void main(String[] args) {
        Algoritimo56 imprimirNomeEIdade = new Algoritimo56();

        imprimirNomeEIdade.nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        imprimirNomeEIdade.idade = Byte.parseByte(JOptionPane.showInputDialog("Digite sua idade: "));

        JOptionPane.showMessageDialog(null, "Nome: " + imprimirNomeEIdade.nome);
        JOptionPane.showMessageDialog(null, "Idade: " + imprimirNomeEIdade.idade);
    }
}
