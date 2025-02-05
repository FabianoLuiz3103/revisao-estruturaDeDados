package br.com.fabianoLuiz3103.exercicios.lista03lista.exercicio01;

import br.com.fabianoLuiz3103.estruturaDeDados.fila.FilaComPrioridade;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * Fila de documentos a serem impressos, documentos com
 * poucas folhas tem mais prioridade
 * Thread para esperar todas as folhas serem impressas antes de chamar o próximo documento
 */
public class TesteDocumento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FilaComPrioridade<Documento> documentos = new FilaComPrioridade<>();
        int opcaoMenu = 0;

        while (opcaoMenu != 4){
            opcaoMenu = lerInteiro(scanner, "\n\t\t *** INFORME ***" +
                    "\n(1) - Para inserir documento na fila; " +
                    "\n(2) - Para ver documentos da fila;" +
                    "\n(3) - Para mandar documentos para impressão;" +
                    "\n(4) - Para encerrar.");
            switch (opcaoMenu){

                case 1 -> {
                    String nome = lerNomeDocumento(scanner);
                    int qtdPaginas = lerInteiro(scanner, "\n\tInforme a quantidade de páginas do documento: ");
                    Documento documento = new Documento(nome, qtdPaginas);
                    documentos.adiciona(documento);
                }
                case 2 -> {
                    System.out.println("\n\t\t *** DOCUMENTOS ***");

                        System.out.println(documentos);

                }

                case 3 -> {
                    Documento d = null;
                    while (!documentos.isEmpty()) {
                        d = documentos.primeiroDaFila();
                        fazerImpressao(d);
                        if (erro) {
                            System.out.println("Erro ao imprimir " + d.getNome() + ". Reenviando para a fila...");
                            erro = false;
                            break;
                        } else {
                            documentos.remove();
                        }
                    }
                }

                case 4 -> System.out.println("\n\t\t *** ATÉ LOGO *** ");
                default -> System.out.println("\n\t\t *** OPÇÃO INVÁLIDA ***");
            }
        }
    }
    private static int folhas;
    private static boolean erro = false;
    private static void fazerImpressao(Documento documento){
        folhas = documento.getQuantidadeFolhas();
        System.out.print("\n\tFolhas a serem impressas do documento " + documento.getNome() + ":\n");
        Thread impressoes = getThread();
        while (folhas > 0) {
            try {
                impressoes.join(); //enquanto houver folhas para imprimir, espera a thread terminar
            } catch (InterruptedException e) {
                e.printStackTrace();
                erro = true;
            }
        }
        if(!erro){
        System.out.println("\n\tDocumento: " + documento.getNome() + " impresso! ");}
    }

    private static Thread getThread() {
        Thread impressoes = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (folhas > 0){
                                    folhas--;
                                    System.out.print("\r\t\t" + folhas); //move o cursor para o inicio da linha e exibe a variável no mesmo lugar

                                try {
                                    Thread.sleep(500); //decrementa as folha a cada 500ms
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    erro = true;
                                }
                        }
                    }
                });
        impressoes.start();
        return impressoes;
    }


    private static String lerNomeDocumento(Scanner scanner){
        while (true){
            System.out.println("\n\tInforme o nome do documento: ");
            String nome = scanner.nextLine();
            if(!nome.isBlank()){return nome;}
            System.out.println("\n\tERRO! Campo vazio! ");
        }
    }

    private static int lerInteiro(Scanner scanner, String texto){
        while (true){
            try{
                System.out.println(texto);
                int valor = scanner.nextInt();
                scanner.nextLine();
                if(valor > 0){return valor;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo inteiro!" );
                scanner.nextLine();
            }
        }
    }
}
