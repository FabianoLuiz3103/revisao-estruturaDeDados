package br.com.fabianoLuiz3103.exercicios.lista02pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

import java.util.EmptyStackException;

/**
 * @author FabianoLuiz3103
 * programa para verificar se o uso de simbolos na expressão está certo
 *
 */
public class Exercicio05 {
    
    private static final String SIMBOLO_ABERTURA = "({[";
    private static final String SIMBOLO_FECHAMENTO = ")}]";
    public static void main(String[] args) {

        resultado("A + B");
        resultado("A + B + (C - D)");
        resultado("{[()]}[](){()}");
        resultado("{[()]}[)(){()}");
        resultado("((A + B)");
        resultado("A + B(");
        resultado(")A + B( - C");
        resultado("(A + B)) - (C + D");
        resultado("((A + B)/D)");
    }

    private static void resultado(String expressao){
        System.out.println("\n\t\tA expressão: " + expressao + " é " + (verificarExpressao(expressao)?"válida!":"inválida!"));
    }

    private static boolean verificarExpressao(String expressao){
        Pilha<Character> pilha = new Pilha<>();

        for(int i = 0; i < expressao.length(); i++){
            char simbolo = expressao.charAt(i);
            if(SIMBOLO_ABERTURA.indexOf(simbolo) >= 0){
                //empilhando só símbolos de abertura
                pilha.empilha(simbolo);
            } else if(SIMBOLO_FECHAMENTO.indexOf(simbolo) >= 0){
                try{
                    char topo = pilha.desempilha();
                    //verificar se o index do simbolo do topo é igual o index do simbolo de fechamento
                    if(SIMBOLO_ABERTURA.indexOf(topo) != SIMBOLO_FECHAMENTO.indexOf(simbolo)){
                        return false;
                    }

                }catch (EmptyStackException e){return false;}
            }
        }
        return (pilha.isEmpty());
    }
}
