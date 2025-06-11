package fila;

public class Fila {
    int tamanho;
    int[] elementos;
    int inicio;
    int fim;
    int quantidade;

    public Fila (int tamanhoMaximo) {
        this.tamanho = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.quantidade = 0;
    }

    public void destruirFila() {
        this.elementos = null;
    }
    
    public boolean filaCheia() {
        return this.quantidade == this.tamanho;
    }

    public boolean filaVazia() {
        return this.quantidade == 0;
    }

    public boolean inserirElemento(int elemento){
        if (filaCheia()) {
            return false;
        } else {
            this.fim = (this.fim + 1) % this.tamanho;
            this.elementos[this.fim] = elemento;
            this.quantidade++;
            return true;
        }
    }

    public int removerElemento() {
        if (filaVazia()) {
            throw new IllegalStateException("Fila vazia, não é possível remover elemento.");
        } else {
            int elementoRemovido = this.elementos[this.inicio];
            this.elementos[this.inicio] = 0;
            this.inicio = (this.inicio + 1) % this.tamanho;
            this.quantidade--;
            return elementoRemovido;
        }
    }

    public int localizarElemento(int elemento) {
        for (int i = 0; i < this.quantidade; i++) {
            int posicao = (this.inicio + i) % this.tamanho;
            if (this.elementos[posicao] == elemento) {
                return posicao;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Fila fila = new Fila(10);

        fila.inserirElemento(10);
        fila.inserirElemento(20);
        fila.inserirElemento(30);

        System.out.println("Elemento removido: " + fila.removerElemento());
        
        int posicao = fila.localizarElemento(20);
        if (posicao != -1) {
            System.out.println("Elemento 20 encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento 20 não encontrado na fila.");
        }

        fila.destruirFila();
    }
}