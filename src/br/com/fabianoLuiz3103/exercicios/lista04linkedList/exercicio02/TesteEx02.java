package br.com.fabianoLuiz3103.exercicios.lista04linkedList.exercicio02;

public class TesteEx02 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        for(int i=1; i<= 20; i++){
            listaEncadeada.adiciona(i);
        }

        System.out.println(listaEncadeada);

        listaEncadeada.inverter();

        System.out.println("\n --- INVERTIDA ---" +
               "\n"+ listaEncadeada);
    }
}
