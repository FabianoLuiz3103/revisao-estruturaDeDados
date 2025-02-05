package br.com.fabianoLuiz3103.estruturaDeDados.fila;

import br.com.fabianoLuiz3103.estruturaDeDados.estruturaEstatica.EstruturaEstatica;

import javax.print.DocFlavor;
import java.util.NoSuchElementException;


public class Fila <T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void adiciona(T elemento){
        super.adiciona(elemento);
    }


    public T remove(){
        final int POS = 0;
        T elemento = null;
        try{
            elemento = super.elementos[POS];
            super.remove(POS);
        }catch (IllegalArgumentException e){
            System.out.println("\n\tA fila está vazia!");
        }
        return elemento;
    }

    public T primeiroDaFila(){
        final int POS = 0;
        T elemento = null;
       try{
           elemento = super.elementos[POS];
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("\n\tA fila está vazia");
       }
       return elemento;
    }

    public T ultimoDaFila(){
        final int POS = super.tamanho-1;
        T elemento = null;
        try{
            elemento = super.elementos[POS];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n\tA fila está vazia");
        }
        return elemento;
    }

}
