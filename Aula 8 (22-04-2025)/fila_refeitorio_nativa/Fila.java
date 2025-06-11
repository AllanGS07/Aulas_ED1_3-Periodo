package fila_refeitorio_nativa;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    Queue<Object> filaDePessoas = new LinkedList<>();

    void insere(Object pessoa) {
        filaDePessoas.add(pessoa);
    }

    void remove() {
        if (!filaDePessoas.isEmpty()) {
            filaDePessoas.remove();
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public static void main(String[] args) {
        
    }
}
