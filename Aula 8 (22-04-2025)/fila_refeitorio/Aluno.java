package fila_refeitorio;

public class Aluno {
    int Matricula;
    String Nome;
    byte Idade;
    String Curso;
    byte Semestre;

    public Aluno(int matricula, String nome, byte idade, String curso, byte semestre) {
        this.Matricula = matricula;
        this.Nome = nome;
        this.Idade = idade;
        this.Curso = curso;
        this.Semestre = semestre;
    }
}
