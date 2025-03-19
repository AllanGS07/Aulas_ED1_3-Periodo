package divisao;
import javax.swing.JOptionPane;

public class VerificarDivisao {
    public static void main(String[] args) {
        Num numeros = new Num();
        numeros.fNumerador = Float.parseFloat(JOptionPane.showInputDialog("Digite o numerador: "));
        numeros.fDenominador = Float.parseFloat(JOptionPane.showInputDialog("Digite o denominador: "));

        if (numeros.fDenominador == 0){
            JOptionPane.showMessageDialog(null, "Operação Inválida!!!\nDigite um denominador diferente de 0.");
            numeros.fDenominador = Float.parseFloat(JOptionPane.showInputDialog("Digite o denominador: "));
        }
        else{
            numeros.fResultado = numeros.fNumerador / numeros.fDenominador;
        }
        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + numeros.fResultado);
    }
}
