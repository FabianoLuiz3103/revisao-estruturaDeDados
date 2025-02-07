package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio04;

import br.com.fabianoLuiz3103.estruturaDeDados.fila.Fila;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Jogo batata quente
 */
public class BatataQuente {

    public static void main(String[] args) {

        Random r = new Random();
        boolean queimou=false;
        int contador = 0;
        Fila<Jogador> jogadores = new Fila<>();
        for (int i = 1; i <= 20; i++){
            jogadores.adiciona(new Jogador("Jogador " + i));
        }

        int maxPassadas = r.nextInt(9)+1;
        while (jogadores.tamanho() > 1){
            queimou = contador==maxPassadas;
            if(queimou){
                System.out.println("O " + jogadores.remove() + " foi eliminado");
                contador = 0;
                maxPassadas = r.nextInt(9)+1;
            }else{
                Jogador j = jogadores.remove();
                jogadores.adiciona(j);
            }
            contador++;
        }
        System.out.println("\n\n\t\tO jogador " + jogadores.primeiroDaFila() + " foi o ganhador");
    }
}
