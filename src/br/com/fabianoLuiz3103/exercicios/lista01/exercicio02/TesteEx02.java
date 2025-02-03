package br.com.fabianoLuiz3103.exercicios.lista01.exercicio02;

public class TesteEx02 {

    public static void main(String[] args) {

        Vetor<Integer> vetor = new Vetor<>(2);

        vetor.adiciona(1);
        vetor.adiciona(5);
        vetor.adiciona(5);
        vetor.adiciona(5);
        vetor.adiciona(6);

        System.out.println(vetor.busca(Integer.valueOf(5))); // funciona como indexOf -> index 1
        System.out.println(vetor.lastIndexOf(5)); // index 3
    }
}
