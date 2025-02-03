package br.com.fabianoLuiz3103.exercicios.lista01.exercicio01;

public class TesteEx01 {

    public static void main(String[] args) {

        Vetor<String> vetor = new Vetor<>(1);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor.contains("A")); //--> true
        System.out.println(vetor.contains("a")); //--> false
    }
}
