package br.com.fabianoLuiz3103.exercicios.exercicio03;


public class TesteEx03 {

    public static void main(String[] args) {

        Vetor<String> vetor = new Vetor<>(2);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("B");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);

        vetor.remove("B");
        vetor.remove("B");
        vetor.remove("B");
        vetor.remove("B");
        vetor.remove("Z");

        System.out.println(vetor);

    }
}
