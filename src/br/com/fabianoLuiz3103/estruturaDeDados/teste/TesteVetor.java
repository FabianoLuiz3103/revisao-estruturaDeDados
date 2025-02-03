package br.com.fabianoLuiz3103.estruturaDeDados.teste;

import br.com.fabianoLuiz3103.estruturaDeDados.vetor.Vetor;
import br.com.fabianoLuiz3103.estruturaDeDados.vetor.VetorObjetos;

import javax.sql.rowset.spi.SyncProvider;
import java.awt.*;


public class TesteVetor {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);
        vetor.adiciona(3); //Tipo primitivo sendo transformado em objeto
        /*
        autoboxing -> O Java vai converter o int automaticamente para a um objeto
        da classe Integer

        Mas para recuperar esse valor eu preciso de um cast explicito
        int numero = (Integer) array[1];
         */
        vetor.adiciona(4);
        vetor.adiciona("palavra"); //Posso misturar string com int ou qualquer outro objeto porque herdam de object

        System.out.println(vetor);

        Contato c1 = new Contato("contato 1", "telefone 1", "email 1");
        Contato c2 = new Contato("contato 2", "telefone 2", "email 2");
        Contato c3 = new Contato("contato 3", "telefone 3", "email 3");

        Contato c4 = new Contato("contato 3", "telefone 3", "email 3");

        VetorObjetos contatos = new VetorObjetos(0);
        contatos.adiciona(c1);
        contatos.adiciona(c2);
        contatos.adiciona(c3);
        System.out.println(contatos);

        System.out.println(contatos.busca(c4));
        /*
        Como eu sobrescrevi o método equals na classe
        Contato ele vai comparar todos os atributos além da referência
        de memória, então ele vai ver que c4 é igual a c3 e vai retornar a posição
        de c3 no vetor
         */

    }
}
