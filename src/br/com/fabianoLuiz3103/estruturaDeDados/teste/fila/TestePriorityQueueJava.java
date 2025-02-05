package br.com.fabianoLuiz3103.estruturaDeDados.teste.fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueueJava {

    public static void main(String[] args) {

        Queue<String> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add("1");
        filaComPrioridade.add("3");
        filaComPrioridade.add("2");
        filaComPrioridade.add("0");
        filaComPrioridade.add("7");
        //a fila adiciona ordenado por prioridade, então fica 0,1,2,3

        System.out.println(filaComPrioridade);
    }
}
