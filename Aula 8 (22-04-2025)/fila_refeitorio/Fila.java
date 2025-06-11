package fila_refeitorio;

public class Fila {
    Aluno[] alunos;
    int tamanho;
    int inicio;
    int fim;
    int quantidade;

    public Fila(int tamanhoMaximo) {
        this.tamanho = tamanhoMaximo;
        this.alunos = new Aluno[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.quantidade = 0;
    }

    public void destruirFila() {
        this.alunos = null;
    }
    
    public boolean filaCheia() {
        return this.quantidade == this.tamanho;
    }

    public boolean filaVazia() {
        return this.quantidade == 0;
    }

    public boolean inserirElemento(Aluno aluno) {
        if (filaCheia()) {
            return false;
        } else {
            this.fim = (this.fim + 1) % this.tamanho;
            this.alunos[this.fim] = aluno;
            this.quantidade++;
            return true;
        }
    }

    public Aluno removerElemento() {
        if (filaVazia()) {
            throw new IllegalStateException("Fila vazia, não é possível remover elemento.");
        } else {
            Aluno elementoRemovido = this.alunos[this.inicio];
            this.alunos[this.inicio] = null;
            this.inicio = (this.inicio + 1) % this.tamanho;
            this.quantidade--;
            return elementoRemovido;
        }
    }

    public int localizarElemento(Aluno aluno) {
        for (int i = 0; i < this.quantidade; i++) {
            int posicao = (this.inicio + i) % this.tamanho;
            // Aqui a comparação é baseada na matrícula. Se desejar comparar de outra forma, ajuste.
            if (this.alunos[posicao].Matricula == aluno.Matricula) {
                return posicao;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Fila fila = new Fila(10);

        Aluno aluno1 = new Aluno(2, "Carolyn Shelton", (byte)20, "Ciências da Computação", (byte)2);
        Aluno aluno2 = new Aluno(9, "Christine Ballard", (byte)29, "Engenharia", (byte)5);
        Aluno aluno3 = new Aluno(16, "Maude Butler", (byte)40, "Educação Física", (byte)8);
        
        fila.inserirElemento(aluno1);
        fila.inserirElemento(aluno2);
        fila.inserirElemento(aluno3);

        Aluno removido = fila.removerElemento();
        System.out.println("Elemento removido: " + removido.Matricula);
        
        int posicao = fila.localizarElemento(aluno1);
        if (posicao != -1) {
            System.out.println("Aluno com matrícula " + aluno1.Matricula + " encontrado na posição: " + posicao);
        } else {
            System.out.println("Aluno com matrícula " + aluno1.Matricula + " não encontrado na fila.");
        }

        fila.destruirFila();
    }
}