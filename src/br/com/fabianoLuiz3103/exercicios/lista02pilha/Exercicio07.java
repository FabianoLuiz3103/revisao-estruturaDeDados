package br.com.fabianoLuiz3103.exercicios.lista02pilha;

import java.util.Stack;

/**
 * @author FabianoLuiz3103
 * --> Torre de Hanoi
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        for(int i =2; i >= 1; i--){
            original.push(i);
        }

        torreDeHanoi(original.size(), original, destino, aux);
        while (!destino.isEmpty()){
            System.out.println(destino.pop());
        }
    }

    public static void torreDeHanoi(int nDiscos, Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux){

        if(nDiscos > 0){
            //movendo da origem para aux
          torreDeHanoi(nDiscos-1, ori, aux, dest);
          dest.push(ori.pop());
          // movendo da aux para destino
          torreDeHanoi(nDiscos-1, aux, dest, ori);
        }
    }
}
