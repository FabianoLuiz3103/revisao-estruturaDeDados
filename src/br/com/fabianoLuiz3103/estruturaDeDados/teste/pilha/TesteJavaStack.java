package br.com.fabianoLuiz3103.estruturaDeDados.teste.pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

import java.util.Stack;

public class TesteJavaStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        System.out.println("---------------");
//        for(int i = 0; i < stack.size(); i++){
//            System.out.println(stack.pop());
//        }
        /*
        O código acima não esvazia a pilha porque o tamanho
        dela muda a cada interação
         */

        /*
        Código que funciona:
         */
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
