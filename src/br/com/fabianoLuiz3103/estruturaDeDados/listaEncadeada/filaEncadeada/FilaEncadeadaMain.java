package br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.filaEncadeada;

public class FilaEncadeadaMain {

    public static void main(String[] args) {

        FilaEncadeada<String> filaEncadeada = new FilaEncadeada<>();

        filaEncadeada.add("A");
        filaEncadeada.add("Z");
        filaEncadeada.add("B");
        filaEncadeada.add("Y");
        filaEncadeada.add("C");

        System.out.println("\n -- primeiro da fila: " + filaEncadeada.peek());

        System.out.println(filaEncadeada);

        filaEncadeada.clear();

        System.out.println(filaEncadeada);


        filaEncadeada.add("1");
        filaEncadeada.add("2");
        filaEncadeada.add("3");
        filaEncadeada.add("4");
        filaEncadeada.add("5");

        System.out.println("\n -- primeiro da fila: " + filaEncadeada.peek());

        System.out.println(filaEncadeada);

        while (!filaEncadeada.isEmpty()){
            System.out.println(filaEncadeada.remove());
        }


    }
}
