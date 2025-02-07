package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio03;

import br.com.fabianoLuiz3103.estruturaDeDados.fila.FilaComPrioridade;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> PS
 * vermelho -> maior prioridade
 * amarelo -> prioridade média
 * verde -> menor prioridade
 */
public class TesteProntoSocorro {

    public static void main(String[] args) {
        //Avisando que a ordem do comparador é diferente, agora vai exibir do maior para o menor
        FilaComPrioridade<Senha> fila = new FilaComPrioridade<>(false);
        iniciarFila(fila);
        System.out.println(fila);
        System.out.println("----------------------------\n");
        ThreadAtendimento thrAtendimento = new ThreadAtendimento(fila);
        ThreadNovasSenhas thrSenhas = new ThreadNovasSenhas(fila);

        Thread tA = new Thread(thrAtendimento);
        Thread tS = new Thread(thrSenhas);

        tA.start();
        tS.start();

    }

    private static void iniciarFila(FilaComPrioridade<Senha> f){
        for(int i = 1; i <= 6; i++){
            Random r = new Random();
            f.adiciona(new Senha(("S"+i), (r.nextInt(3)+1)));
        }
    }
}
