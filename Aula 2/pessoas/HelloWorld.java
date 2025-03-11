package pessoas;

public class HelloWorld {
    public static void main(String[] args) {
        //NC     NO   = new    NC();
        Pessoa aluno = new Pessoa();
        aluno.nome = "Allan";
        aluno.idade = 19;
        aluno.data_de_nascimento = "07/02/2006";
        
        System.out.println("Olá " + aluno.nome);
        System.out.println("Sua idade é: " + aluno.idade);
        System.out.println("Sua data de nascimento é: " + aluno.data_de_nascimento);
        System.out.println("-------------------------------------------------");

        Pessoa professor = new Pessoa();
        professor.nome = "João";
        professor.idade = 35;
        professor.data_de_nascimento = "01/01/1990";

        System.out.println("Olá " + professor.nome);
        System.out.println("Sua idade é: " + professor.idade);
        System.out.println("Sua data de nascimento é: " + professor.data_de_nascimento);
        System.out.println("-------------------------------------------------");

        Pessoa mecanico = new Pessoa();
        mecanico.nome = "José";
        mecanico.idade = 45;
        mecanico.data_de_nascimento = "01/01/1980";

        System.out.println("Olá " + mecanico.nome);
        System.out.println("Sua idade é: " + mecanico.idade);
        System.out.println("Sua data de nascimento é: " + mecanico.data_de_nascimento);
        System.out.println("-------------------------------------------------");
    }
}