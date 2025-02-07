package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio02;

import br.com.fabianoLuiz3103.estruturaDeDados.fila.Fila;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteAtendimento {
    private static int MAX_PRIORIDADE = 3;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fila<Senha> filaNormal = new Fila<>();
        Fila<Senha> filaPrioridade = new Fila<>();
        int opcaoMenu = 0;

        while (opcaoMenu != 4){

            opcaoMenu = lerInteiro(scanner, "\n\t\t ** INFORME **" +
                    "\n(1) - Para dar uma senha; " +
                    "\n(2) - Para ver as filas de senha;" +
                    "\n(3) - Para atender;" +
                    "\n(4) - Para sair.");
            switch (opcaoMenu){

                case 1 -> {
                    int menuUm = 0;
                    while (menuUm != 3){
                        menuUm = lerInteiro(scanner, "\n\t\t ** INFORME **" +
                                "\n(1) - Para senha normal; " +
                                "\n(2) - Para senha prioritária;" +
                                "\n(3) - Para sair;");
                        switch (menuUm){

                            case 1 -> {
                                filaNormal.adiciona(new Senha(false));
                                System.out.println("Senha normal gerada: " + filaNormal.ultimoDaFila());
                            }
                            case 2 -> {
                                filaPrioridade.adiciona(new Senha(true));
                                System.out.println("Senha prioridade gerada: " + filaPrioridade.ultimoDaFila());
                            }
                            case 3 -> System.out.println("\n\t\tVOLTANDO...");
                            case 4 -> System.out.println("\n\t\tOPÇÃO INVÁLIDA");
                        }
                    }
                }
                case 2 -> {
                    int menuUm = 0;
                    while (menuUm != 3){
                        menuUm = lerInteiro(scanner, "\n\t\t ** INFORME **" +
                                "\n(1) - Para senha normal; " +
                                "\n(2) - Para senha prioritária;" +
                                "\n(3) - Para sair;");
                        switch (menuUm){

                            case 1 -> System.out.println(filaNormal);
                            case 2 -> System.out.println(filaPrioridade);
                            case 3 -> System.out.println("\n\t\tVOLTANDO...");
                            case 4 -> System.out.println("\n\t\tOPÇÃO INVÁLIDA");
                        }
                    }
                }
                case 3 -> {
                    int quantidadeSenhas = filaPrioridade.tamanho() + filaNormal.tamanho();
                    /*
                    Enquanto a fila de prioridade não estiver vazia e a quantidade de prio atendido for menor que 3
                    eu atendo prioridade;
                    Depois eu atendo um normal, se a fila de normal não estiver vazia
                    Depois eu vejo se ainda tem fila de prioridade, se não tiver atendo o resto normal, se tiver
                     */
                    while (quantidadeSenhas > 0){
                        int qtdP = 0;
                        while (!filaPrioridade.isEmpty() && qtdP < MAX_PRIORIDADE){
                            System.out.println(filaPrioridade.remove());
                            qtdP++;
                            quantidadeSenhas--;
                        }
                        if(!filaNormal.isEmpty()){
                            System.out.println(filaNormal.remove());
                            quantidadeSenhas--;
                        }
                        if(filaPrioridade.isEmpty()){
                            while (!filaNormal.isEmpty()){
                                System.out.println(filaNormal.remove());
                                quantidadeSenhas--;
                            }
                        }
                    }
                    if(filaNormal.isEmpty() && filaPrioridade.isEmpty()){
                        Senha.setContadorNormal(0);
                        Senha.setContadorPrioridade(0);
                    }
                }
                case 4 -> System.out.println("\n\t\t ATÉ LOGO");
                default -> System.out.println("\n\t\tOPÇÃO INVÁLIDA");
            }
        }
        scanner.close();
    }

    private static int lerInteiro(Scanner scanner, String texto){
        while (true){
            try{
                System.out.println(texto);
                int v = scanner.nextInt();
                scanner.nextLine();
                if(v > 0){return v;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro!");
                scanner.nextLine();
            }
        }
    }
}
