package br.com.fabianoLuiz3103.exercicios.lista02pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Verificar se uma palavra é palíndrome
 * --> Primeira solução pensada
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pilha<Character> pilha = new Pilha<>();
        Pilha<Character> pilhaAux = new Pilha<>();

        String palavra = receberPalavra(scanner);
        scanner.close();

        for(char c : palavra.toCharArray()){
            pilha.empilha(c);
        }
        int tamanhoInteiro = pilha.tamanho()/2;
       for(int i = 0; i < tamanhoInteiro; i++){
           pilhaAux.empilha(pilha.desempilha());
       }
       if(pilha.tamanho() != tamanhoInteiro){
           pilha.desempilha();
       }
       boolean palindrome = true;
       while (!pilha.isEmpty()){
           if(!pilha.desempilha().equals(pilhaAux.desempilha())){
               palindrome= false;
               break;
           }
       }

        System.out.println("A palavra: " + palavra + (palindrome ? " é palíndrome!":" não é palíndrome!"));
    }

    private static String receberPalavra(Scanner scanner){
        while (true){
            System.out.print("\n\t\tInforma uma palavra: ");
            String p = scanner.nextLine().trim().toUpperCase();
            if(!p.isBlank()){return p;}
            System.out.println("\n\tERRO! Campo vazio! ");
        }
    }
}
