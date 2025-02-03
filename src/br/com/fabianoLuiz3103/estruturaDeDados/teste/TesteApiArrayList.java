package br.com.fabianoLuiz3103.estruturaDeDados.teste;

import br.com.fabianoLuiz3103.estruturaDeDados.vetor.Vetor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteApiArrayList {

    public static void main(String[] args) {

        ArrayList<String> vetor = new ArrayList<>();

        vetor.add("A");
        vetor.add("C");
        vetor.add("D");

        System.out.println(vetor);

        vetor.add(1, "B");


        System.out.println(vetor);

        System.out.println(vetor.contains("C")); //--> true
       System.out.println(vetor.contains("c")); //--> false
        System.out.println(vetor.contains("E")); //--> false

        System.out.println(vetor.indexOf("C")); //--> 2
        System.out.println(vetor.indexOf("c")); //--> -1
        System.out.println(vetor.indexOf("E")); //--> -1

        System.out.println(vetor.get(2)); // C

        System.out.println(vetor.size());

        System.out.println(vetor.set(1, "OLA")); //--> Vai sobrescrever a posição 1
        vetor.add(1, "WORLD"); //--> Aqui adiciona na posição 1 e aumenta o tamanho do vetor
        System.out.println(vetor);
    }
}
