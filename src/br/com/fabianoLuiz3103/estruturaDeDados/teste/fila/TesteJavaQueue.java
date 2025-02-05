package br.com.fabianoLuiz3103.estruturaDeDados.teste.fila;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Classe QUEUE -> Não existe no java, só a interface
 * Temos que usar uma clase que implementam a classe QUEUE
 * A classe LinkedList implenta a Interface QUEUE
 *
 * Queue<String> fila = new LinkedList<>();
 * Está representando uma fila, somente os métodos declarados
 * na classe Queue ficarão disponíveis
 */
public class TesteJavaQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("A");
        fila.add("B");
        fila.add("C");
        fila.add("D");
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.isEmpty());

        System.out.println("Elemento removido da fila: " + fila.remove());
        System.out.println(fila);
        System.out.println(fila.peek());
    }
}
