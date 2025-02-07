package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio01;

public class Documento implements Comparable<Documento> {

    private String nome;
    private int quantidadeFolhas;

    public Documento(){}

    public Documento(String nome, int quantidadeFolhas) {
        this.nome = nome;
        this.quantidadeFolhas = quantidadeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    public void setQuantidadeFolhas(int quantidadeFolhas) {
        this.quantidadeFolhas = quantidadeFolhas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n *** DOCUMENTO *** ");
        sb.append("\n- NOME: " + this.nome);
        sb.append("\n- QTD. FOLHAS: " + this.quantidadeFolhas);
        return sb.toString();
    }

    @Override
    public int compareTo(Documento d) {
        if(this.quantidadeFolhas > d.quantidadeFolhas){
            return 1;
        }else if(this.quantidadeFolhas < d.quantidadeFolhas){
            return -1;
        }
        return 0;
    }
}
