package br.com.fabianoLuiz3103.exercicios.lista02pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Verificar se uma palavra é palíndrome
 * --> Segunda solução pensada - mais simples e clara
 * ANA -> length() 3;
 * charAt(0): A
 * charAt(1): N
 * charAt(2): A
 * O desempilha vai retornar 2,1,0
 * (2,1,0) == (0,1,2) palíndrome
 */
public class Exercicio04_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pilha<Character> pilha = new Pilha<>();
        String palavra = receberPalavra(scanner);
        scanner.close();
        for(int i = 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));//charAt retorna o char no index informado
        }

        String palavraInvertida ="";
        while (!pilha.isEmpty()){
            palavraInvertida+=pilha.desempilha();
        }
        boolean palindrome = palavra.equals(palavraInvertida);
        System.out.println("\n\n\tA palavra: " + palavra + (palindrome?" é palíndrome!":" não é palíndrome!"));

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
