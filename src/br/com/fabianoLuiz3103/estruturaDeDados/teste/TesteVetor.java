package br.com.fabianoLuiz3103.estruturaDeDados.teste;

import br.com.fabianoLuiz3103.estruturaDeDados.vetor.Vetor;
import br.com.fabianoLuiz3103.estruturaDeDados.vetor.VetorGenerico;
import br.com.fabianoLuiz3103.estruturaDeDados.vetor.VetorObjetos;

import javax.sql.rowset.spi.SyncProvider;
import java.awt.*;


public class TesteVetor {

    public static void main(String[] args) {

        VetorGenerico<String> vetorGenerico = new VetorGenerico<>(3);
        //vetorGenerico.adiciona(1); --> Não aceita, só recebe String

        vetorGenerico.adiciona("Olá!");
        System.out.println(vetorGenerico);

    }
}
