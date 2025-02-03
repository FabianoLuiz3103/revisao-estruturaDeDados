package br.com.fabianoLuiz3103.exercicios.lista01.exercicio05;


public class TesteEx05 {

    public static void main(String[] args) {

        Vetor<String> v = new Vetor<>(2);

        v.adiciona("A");
        v.adiciona("B");
        v.adiciona("C");
        v.adiciona("D");
        v.adiciona("E");

        System.out.println(v);
        v.clear();
        System.out.println(v);


    }
}
