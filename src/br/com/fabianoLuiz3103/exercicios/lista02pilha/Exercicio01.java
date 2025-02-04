package br.com.fabianoLuiz3103.exercicios.lista02pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Ler 10 números, se o número for par empilha se for ímpar desempilha um número
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();
        int valor;
        System.out.print("\n------------------------" +
                "\nSE {N}:" +
                "\n(PAR) -> {N} É EMPILHADO;" +
                "\n(ÍMPAR) -> UM NÚMERO É DESEMPILHADO" +
                "\n------------------------");
        for(int i = 1; i<=10; i++){
            valor = lerInteiro(scanner, "\n\tInforme o " + i + "º valor:  ");
            try{
                if(valor%2==0){
                    pilha.empilha(valor);
                }else{
                    //lança exceção se a pilhar estiver vazia
                    System.out.print("\n\t\tNº DESEMPILHADO: " + pilha.desempilha() + "\n");
                }
            }catch (EmptyStackException e){
                System.out.print("\n\tA pilha está vazia! \n");
            }
        }

       while (!pilha.isEmpty()){
           System.out.println(pilha.desempilha());
       }
    }

    private static int lerInteiro(Scanner scanner, String texto){
        int v;
        while (true){
            try{
                System.out.print(texto);
                v = scanner.nextInt();
                if(v>=0){
                    scanner.nextLine();
                    return v;
                }
                System.out.print("\n\tERRO! O valor deve ser positivo!\n");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico!");
                scanner.nextLine();
            }
        }
    }
}
