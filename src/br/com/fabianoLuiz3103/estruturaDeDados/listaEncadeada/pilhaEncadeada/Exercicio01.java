package br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.pilhaEncadeada;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Armazenar as vogais de uma frase em uma pilha
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PilhaEncadeada<Character> vogais = new PilhaEncadeada<>();

        //recebendo frase do usuário
        String fraseRecebida = lerString(scanner);
        //retornando qtd de vogais
        int qtdVogais = verificarVogais(fraseRecebida.trim().toCharArray(), vogais);

        System.out.println(gerarResultado(
                vogais,
                qtdVogais,
                fraseRecebida
        ));

        scanner.close();
    }

    public static String lerString(Scanner scanner){
        while (true){
            System.out.println("\n\t\tInforme uma frase:");
            String frase = scanner.nextLine().toUpperCase();
            if(!frase.isBlank()){return frase;}
            System.out.println("\n\tERRO! Frase em branco!");
        }
    }

    public static int verificarVogais(char[] carcteres, PilhaEncadeada<Character> vogais){
        int qtdVogais = 0;
        for (char c : carcteres) {
            if (c == 'A' || c == 'E' || c == 'I' ||
                    c == 'O' || c == 'U') {
                vogais.push(c);
                qtdVogais++;
            }
        }
        return qtdVogais;
    }

    public static String gerarResultado(PilhaEncadeada<Character> vogais, int qtdVogais, String frase){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n *** NA FRASE: " + frase + " ***");
        sb.append("\nEXISTEM " + qtdVogais + " VOGAIS! QUE SÃO: ");
        while (!vogais.isEmpty()){
            sb.append(vogais.pop());
            sb.append(vogais.tamanho() >= 1 ? ",":".");
        }
        return sb.toString();
    }
}
