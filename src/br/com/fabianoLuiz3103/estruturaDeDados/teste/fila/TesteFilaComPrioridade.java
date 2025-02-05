package br.com.fabianoLuiz3103.estruturaDeDados.teste.fila;


import br.com.fabianoLuiz3103.estruturaDeDados.fila.FilaComPrioridade;

public class TesteFilaComPrioridade {

    public static void main(String[] args) {


        FilaComPrioridade<String> filaComPrioridade = new FilaComPrioridade<>();
        filaComPrioridade.adiciona("1");
        filaComPrioridade.adiciona("3");
        filaComPrioridade.adiciona("2");
        filaComPrioridade.adiciona("0");
        filaComPrioridade.adiciona("7");
        //a fila adiciona ordenado por prioridade, então fica 0,1,2,3

        System.out.println(filaComPrioridade);
    }
}
