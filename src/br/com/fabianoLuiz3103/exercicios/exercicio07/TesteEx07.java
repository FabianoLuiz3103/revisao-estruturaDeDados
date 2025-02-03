package br.com.fabianoLuiz3103.exercicios.exercicio07;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Refazer exercício 06 mas usando a classe ArrayList
 */
public class TesteEx07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> agenda = new ArrayList<>(); // -> Usando ArrayList
        int opcao = 0;
        adicionandoContatos(agenda);

        while (opcao != 7){
            opcao = menuOpcoes(scanner);
            scanner.nextLine();
            switch (opcao){
                case 1 -> {
                    System.out.println("\n\n\t\t >> ADIÇÃO DE CONTATO <<");
                    Contato contato = retornarContatoAdicao(scanner);
                    agenda.add(contato);
                    System.out.println(contato + "\n\t ->>> ADICIONADO COM SUCESSO! ");
                }

                case 2 -> {
                    int indice = receberInteiro(scanner, agenda.size());
                    System.out.println("\n\n\t\t >> ADIÇÃO DE CONTATO NA POSIÇÃO " +indice + " DA AGENDA <<");
                    Contato contato = retornarContatoAdicao(scanner);
                    agenda.add((indice-1), contato);//-1 porque o vetor vai de [0, tamanho-1]
                    System.out.println(contato + "\n\t ->>> ADICIONADO COM SUCESSO! ");
                }

                case 3 -> {
                    System.out.println("\n\n\t\t >> REMOÇÃO DE CONTATO <<");
                    Contato contato = retornarContatoBusca(scanner);
                    try{
                        Contato c = agenda.get(agenda.indexOf(contato));
                        if(c!=null){
                            agenda.remove(c);
                            System.out.println(c + "\n\t ->>> REMOVIDO COM SUCESSO! ");
                        }
                    }catch (Exception e){
                        System.out.println("\n\t\t >> " + e.getMessage());
                    }
                }

                case 4 -> {
                    System.out.println("\n\n\t\t >> CONSULTA DE CONTATO <<");
                    Contato contato = retornarContatoBusca(scanner);
                    try{
                        //contato retornado da busca
                        Contato c = agenda.get(agenda.indexOf(contato));
                        if(c!=null){
                            System.out.println(c);
                        }
                    }catch (Exception e){
                        System.out.println("\n\t\t >> " + e.getMessage());
                    }
                }

                case 5 -> System.out.println("\n\t\t >>>> NÚMERO DE CONTATOS " + Contato.contador + " <<<<" +
                        "\n" + agenda);

                case 6 -> {
                    agenda.clear();
                    Contato.contador = 0;
                    System.out.println("\n\t\t >>> AGENDA LIMPA COM SUCESSO, NÚMERO DE CONTATOS: " + Contato.contador);
                }

                case 7 -> System.out.println("\n\t\tATÉ LOGO...");

                default -> System.out.println("\n\t\tOPÇÃO INVÁLIDA!!");
            }
        }
    }

    private static Contato retornarContatoAdicao(Scanner scanner){
        String nome = receberString(scanner, "\n\tInforme o nome: ");
        String email = receberString(scanner, "\n\tInforme o email: ");
        String telefone = receberString(scanner, "\n\tInforme o telefone: ");
        return new Contato(nome, email, telefone);
    }

    private static Contato retornarContatoBusca(Scanner scanner){
        String email = receberString(scanner, "\n\tInforme o email: ");
        String telefone = receberString(scanner, "\n\tInforme o telefone: ");
        return new Contato(email, telefone);
    }


    private static String receberString(Scanner scanner, String texto){
        String v;
        while (true){
            System.out.println(texto);
            v = scanner.nextLine();
            if(!v.isBlank()){return v;}
            System.out.println("\n\tERRO! Campo vazio! ");
        }
    }

    private static int receberInteiro(Scanner scanner, int tamanho){
        int v;
        while (true){
            try{
                System.out.println("\n\tInforme a posição que você deseja add o contato: ");
                v = scanner.nextInt();
                scanner.nextLine();
                if(v >= 1 && v <= tamanho){return v;}
                System.out.println("\n\tERRO! Valor inválido. O valor deve ser de 1 até " +tamanho);
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo inteiro! ");
                scanner.nextLine();
            }
        }
    }

    private static int menuOpcoes(Scanner scanner){
        while (true){
            try{
                System.out.println("\n >>> INFORME <<<" +
                        "\n(1) -> Adicionar novo contato:" +
                        "\n(2) -> Adicionar novo contato na posição informada: " +
                        "\n(3) -> Remover um contato:" +
                        "\n(4) -> Consultar um contato: " +
                        "\n(5) -> Listar todos os contatos: " +
                        "\n(6) -> Limpar a agenda" +
                        "\n(7) -> Encerrar o programa.");
                return scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }


    private static void adicionandoContatos(ArrayList<Contato> agenda){
        //adicionando 30 contatos no vetor
        for(int i = 1; i <= 30; i++){
            String nome = "Name do contato " + i;
            String email = "contato"+i+"@example.com";
            String telefone = "Telefone do contato " + i;
           Contato contato = new Contato(nome, email, telefone);
            agenda.add(contato);
        }
    }
}
