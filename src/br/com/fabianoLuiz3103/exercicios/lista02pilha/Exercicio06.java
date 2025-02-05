package br.com.fabianoLuiz3103.exercicios.lista02pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Converter decimal para binário
 * --> Decimal para octal
 * ---> Decimal para hex
 */
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valor = lerNumero(scanner);
        if(isInteiro(valor)){
            System.out.println("\n"+valor + " em binário fica: " + parteInteiraParaBinario((int)valor));
            System.out.println("\n"+valor + " em octal fica: " + parteInteiraParaQualquerBase((int)valor,8));
            System.out.println("\n"+valor + " em hex fica: " + parteInteiraParaQualquerBase((int)valor, 16));
        }else{
            System.out.print("\n"+valor + " em binário fica: " + parteInteiraParaBinario((int)valor) +"." +
                    ""+pontoFlutuanteParaBinario(arrumarNumero(valor-(int)valor)));
        }

        scanner.close();
    }

    private static String pontoFlutuanteParaBinario(double parteFracionaria){
        Pilha<Integer> pilha = new Pilha<>();
        String binario = "";
        int i = 0;
        while(i <=4){
            int parteInteira = (int) Math.floor(parteFracionaria * 2);
            pilha.empilha(parteInteira);
            parteFracionaria = arrumarNumero((parteFracionaria * 2.0) - parteInteira);
            i++;
        }
        while (!pilha.isEmpty()){
            binario+=pilha.desempilha();
        }
        return binario;
    }

    private static double arrumarNumero(double numero){
        return Math.round(numero * 100.0) / 100.0;
    }

    private static String parteInteiraParaBinario(int valor){
        Pilha<Integer> pilha = new Pilha<>();
        String binario = "";
        while(valor>0){
            int r = valor%2;
            pilha.empilha(r);
            valor = valor/2;
        }
        while (!pilha.isEmpty()){
            binario+=pilha.desempilha();
        }
        return binario;
    }

    private static String parteInteiraParaQualquerBase(int valor, int base){
        Pilha<Integer> pilha = new Pilha<>();
        String binario = "";
        String valores = "0123456789ABCDEF";
        while(valor>0){
            int r = valor%base;
            pilha.empilha(r);
            valor = valor/base;
        }
        while (!pilha.isEmpty()){
            binario+=valores.charAt(pilha.desempilha());
        }
        return binario;
    }

    private static double lerNumero(Scanner scanner){
        while (true){
            try{
                System.out.println("\n\tInforme um número: ");
                double v = scanner.nextDouble();
                if(v >=0){return v;}
                System.out.println("\n\tEntre com um valor maior ou igual a zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número!");
                scanner.nextLine();
            }
        }
    }

    private static boolean isInteiro(double numero){
        return numero - (int)numero == 0;
    }
}
