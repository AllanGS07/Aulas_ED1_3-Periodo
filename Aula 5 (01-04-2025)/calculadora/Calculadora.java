package calculadora;
import java.util.Scanner;

public class Calculadora {
    
    public float somar(float numero1, float numero2) {
        return numero1 + numero2;
    }
    
    public float subtrair(float numero1, float numero2) {
        return numero1 - numero2;
    }
    
    public float multiplicar(float numero1, float numero2) {
        return numero1 * numero2;
    }
    
    public float dividir(float numero1, float numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("Divisão por zero.");
        }
    }
    
    public double elevar(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    
    public double raiz(double numero) {
        if (numero >= 0) {
            return Math.sqrt(numero);
        } else {
            throw new ArithmeticException("Raiz de número negativo.");
        }
    }
    
    public static void main(String[] args) {
        byte op = 0;
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("===============MENU DE OPÇÕES===============");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Elevar");
            System.out.println("6 - Tirar raiz");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextByte();

            try {
                switch (op) {
                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        float n1 = scanner.nextFloat();
                        System.out.print("Digite o segundo número: ");
                        float n2 = scanner.nextFloat();
                        float soma = calculadora.somar(n1, n2);
                        System.out.println("Resultado: " + soma);
                        break;
                    case 2:
                        System.out.print("Digite o primeiro número: ");
                        n1 = scanner.nextFloat();
                        System.out.print("Digite o segundo número: ");
                        n2 = scanner.nextFloat();
                        float sub = calculadora.subtrair(n1, n2);
                        System.out.println("Resultado: " + sub);
                        break;
                    case 3:
                        System.out.print("Digite o primeiro número: ");
                        n1 = scanner.nextFloat();
                        System.out.print("Digite o segundo número: ");
                        n2 = scanner.nextFloat();
                        float mult = calculadora.multiplicar(n1, n2);
                        System.out.println("Resultado: " + mult);
                        break;
                    case 4:
                        System.out.print("Digite o dividendo: ");
                        n1 = scanner.nextFloat();
                        System.out.print("Digite o divisor: ");
                        n2 = scanner.nextFloat();
                        float div = calculadora.dividir(n1, n2);
                        System.out.println("Resultado: " + div);
                        break;
                    case 5:
                        System.out.print("Digite a base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Digite o expoente: ");
                        double expoente = scanner.nextDouble();
                        double pot = calculadora.elevar(base, expoente);
                        System.out.println("Resultado: " + pot);
                        break;
                    case 6:
                        System.out.print("Digite um número para calcular a raiz: ");
                        double num = scanner.nextDouble();
                        double raiz = calculadora.raiz(num);
                        System.out.println("Resultado: " + raiz);
                        break;
                    case 7:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            System.out.println();
        } while (op != 7);
        
        scanner.close();
    }
}
