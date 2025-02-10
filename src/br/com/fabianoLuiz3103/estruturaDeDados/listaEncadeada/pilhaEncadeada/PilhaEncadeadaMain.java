package br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.pilhaEncadeada;

public class PilhaEncadeadaMain {

    public static void main(String[] args) {

        PilhaEncadeada<String> pilhaEncadeada = new PilhaEncadeada<>();

        pilhaEncadeada.push("A");
        pilhaEncadeada.push("B");
        pilhaEncadeada.push("C");

        System.out.println(pilhaEncadeada);
        System.out.println(" -- topo: " + pilhaEncadeada.peek());

        while (!pilhaEncadeada.isEmpty()){
            System.out.println(pilhaEncadeada.pop());
        }
    }
}
