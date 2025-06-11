package fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaIntegrada {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        
        System.out.println("Fila: " + fila);
        String primeiroElemento = fila.poll();
        System.out.println("Primeiro elemento removido: " + primeiroElemento);

        System.out.println("Fila após a remoção: " + fila);
        fila.add("Novo Elemento");
        System.out.println("Fila após adição: " + fila);

        String primeiroElementoSemRemover = fila.peek(); 
        System.out.println("Primeiro elemento sem remover: " + primeiroElementoSemRemover);
        System.out.println("Fila após peek: " + fila);

        System.out.println("Iteração sobre a fila:");
        for (String elemento : fila) {
            System.out.println(elemento);
        }
    }
}