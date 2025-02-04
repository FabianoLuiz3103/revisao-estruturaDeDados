package br.com.fabianoLuiz3103.exercicios.lista02pilha.exercicio03;

public class Livro {

    private static int contador;
    private int id;
    private String nome;
    private String isbn;
    private int anoDeLancamento;
    private String autor;

    public Livro() {
        this.id = ++contador;
    }

    public Livro(String nome, String isbn, int anoDeLancamento, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.anoDeLancamento = anoDeLancamento;
        this.autor = autor;
        this.id = ++contador;
    }

    private int getId(){
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n >>>> LIVRO #" + this.id + " <<<<");
        sb.append("\n- NOME: " + this.nome);
        sb.append("\n- ISBN: " + this.isbn);
        sb.append("\n- ANO DE LANÇAMENTO: " + this.anoDeLancamento);
        sb.append("\n- AUTOR: " + this.autor);
        return sb.toString();
    }
}
