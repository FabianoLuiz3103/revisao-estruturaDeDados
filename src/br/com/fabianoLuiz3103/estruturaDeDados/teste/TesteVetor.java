package br.com.fabianoLuiz3103.estruturaDeDados.teste;

import br.com.fabianoLuiz3103.estruturaDeDados.vetor.Vetor;

import java.io.StreamTokenizer;

public class TesteVetor {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        try{
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("5");
            vetor.adiciona("8");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(vetor.tamanho());

       System.out.println(vetor);

        try{
            vetor.busca(5);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println(vetor.busca("8"));
        System.out.println(vetor.busca(vetor.busca("9")));
    }
}
