package br.com.fabianoLuiz3103.exercicios.lista02pilha.exercicio03;


import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class TesteLivroPilhaJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Livro> livros = new Stack<>();
        int opcao = 0;

        while (opcao != 8){
            opcao = receberInteiro(scanner, false, "\n\t\t *** INFORME ***" +
                    "\n(1) Cadastrar um livro;" +
                    "\n(2) Ver livro que está no topo; " +
                    "\n(3) Remover último livro colocado;" +
                    "\n(4) Ver se a pilha está vazia;" +
                    "\n(5) Ver quantos livros existem na pilha;" +
                    "\n(6) Ver os livros da pilha sem ser na ordem LIFO;" +
                    "\n(7) Esvaziar pilha de livros;" +
                    "\n(8) Para sair.");

            switch (opcao){

                case 1 -> {
                    String nome = receberString(scanner, "\n\tInforme o nome do livro: ");
                    String isbn = receberString(scanner, "\n\tInforme o ISBN do livro");
                    int ano = receberInteiro(scanner, true, "\n\tInforme o ano de lançamento do livro");
                    String autor = receberString(scanner, "\n\tInforme o nome do autor do livro");
                    Livro livro = new Livro(nome, isbn, ano, autor);
                    livros.push(livro);
                    System.out.println("\n *** LIVRO RECÉM COLOCADO NA PILHA ***" +
                            "\n" + livros.peek());
                }
                case 2 -> ultimoLivro(livros, false);
                case 3 -> ultimoLivro(livros, true);
                case 4 -> System.out.println("\n *** A PILHA " + ((livros.isEmpty()) ? "" : "NÃO") + " ESTÁ VAZIA ***");
                case 5 -> System.out.println("\n *** A PILHA ESTÁ COM " + livros.size() + " LIVROS *** " );
                case 6 -> System.out.println("\n *** LIVROS DA PILHA NA ORDEM DE VETOR (SEM LIFO)***" +
                        "\n" + livros);
                case 7 -> {
                    System.out.println("\n *** LIVROS REMOVIDOS DA PILHA *** ");
                    while (!livros.isEmpty()){
                        System.out.println(livros.pop());
                    }
                }
                case 8 -> System.out.println("\n\t\t *** ATÉ LOGO *** ");
                default -> System.out.println("\n\t\t *** OPÇÃO INVÁLIDA ***");
            }
        }


        scanner.close();
    }

    private static void ultimoLivro(Stack<Livro> pilha, boolean desempilha){
        try{
            System.out.println("\n *** LIVRO QUE " + ((desempilha)?"ACABOU DE SER REMOVIDO": "ESTÁ NO TOPO DA PILHA") + " *** " +
                    "\n" + (desempilha?pilha.pop():pilha.peek()));
        }catch (EmptyStackException e){
            System.out.println("\n\tA pilha de livros está vazia!! \n");
        }
    }

    private static String receberString(Scanner scanner, String texto){
        while (true){
            System.out.println(texto);
            String v = scanner.nextLine();
            if(!v.isBlank()){return v;}
            System.out.println("\n\tERRO! Campo vazio! ");
        }
    }

    private static int receberInteiro(Scanner scanner, boolean ano, String texto){
        while (true){
            try {
                System.out.println(texto);
                int valor = scanner.nextInt();
                scanner.nextLine();
                if(ano){
                    if(valor >= 1950 && valor <= 2024) {
                        return valor;
                    }
                    System.out.println("\n\tAno inválido! O ano deve estar entre 1950 e 2024!");
                }else{
                    return valor;
                }
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }
}
