package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio03;

import br.com.fabianoLuiz3103.estruturaDeDados.fila.FilaComPrioridade;

import java.util.Random;

public class ThreadNovasSenhas implements Runnable{

    private FilaComPrioridade<Senha> fila;
    private int contPacientes = 7;
    private Random r = new Random();

    public ThreadNovasSenhas(FilaComPrioridade<Senha> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        for(int i = 0; i < 8; i++){
            try {
                Thread.sleep(4000);
                Senha s = new Senha(("S"+contPacientes), r.nextInt(3)+1);
                fila.adiciona(s);
                contPacientes++;
                System.out.println("\n\tSenha adicionada na fila: \n"+s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
