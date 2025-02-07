package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio03;

import br.com.fabianoLuiz3103.estruturaDeDados.fila.FilaComPrioridade;

public class ThreadAtendimento implements Runnable{

    private FilaComPrioridade<Senha> fila;

    public ThreadAtendimento(FilaComPrioridade<Senha> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        while (!fila.isEmpty()){

            try{
                System.out.println("\n\t\tSenha atendida:\n"+fila.remove());
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n\t\tATENDIMENTO FINALIZADO!");
    }
}
