package br.com.fabianoLuiz3103.exercicios.lista01.exercicio04;

public class TesteEx04 {

    public static void main(String[] args) {

        Vetor<String> a = new Vetor<>(2);

        a.adiciona("A");
        a.adiciona("B");
        a.adiciona("C");
        a.adiciona("D");
        System.out.println(a.get(3));
    }
}
