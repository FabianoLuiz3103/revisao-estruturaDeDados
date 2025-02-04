package br.com.fabianoLuiz3103.exercicios.lista02pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Ler 10 números:
 * --> Se for par -> pilha de par
 * --> Se for impar -> pilha de impar
 * --> Se for zero -> tira das duas
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        for(int i = 1; i <= 10; i++){
            int valor = lerInteiro(scanner, "\n\tInforme o " + i + "º número:  ");
                if(valor == 0){
                    fazerPop(par, "par");
                    fazerPop(impar, "impar");
                }else if(valor%2==0){
                    par.empilha(valor);
                }else{
                    impar.empilha(valor);
                }
        }

        System.out.print("\n\tPILHA PAR\n");
        while (!par.isEmpty() || !impar.isEmpty()){
            System.out.println(par.desempilha());
        }

        System.out.print("\n\tPILHA ÍMPAR\n");
        while (!impar.isEmpty()){
            System.out.println(impar.desempilha());
        }


        scanner.close();
    }

    private static void fazerPop(Pilha<Integer> pilha, String tipo){
        try{
            System.out.println("\n\t\tDESEMPILHANDO O VALOR  " + pilha.desempilha() + " DA PILHA " + tipo.toUpperCase());
        }catch (EmptyStackException e){
            System.out.println("\n\t\tA pilha " + tipo+ " está vazia!" );
        }
    }

    private static int lerInteiro(Scanner scanner, String texto){
        while (true){
            try{
                System.out.print(texto);
                int v = scanner.nextInt();
                if(v>=0){
                    scanner.nextLine();
                    return v;
                }
                System.out.print("\n\tERRO! O valor deve ser maior ou igual a zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }
}
