package br.com.fabianoLuiz3103.exercicios.exercicio07;

import java.util.Objects;

public class Contato {

    protected static int contador;
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Contato(){
        //contador++ faz o valor ser atribuido e depois incrementado então vai de [0, 29] para 30 contatos
        this.id = ++contador;
    }

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        //contador++ faz o valor ser atribuido e depois incrementado então vai de [0, 29] para 30 contatos
        this.id = ++contador;
    }

    public Contato(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n------------------");
        sb.append("\n *** CONTATO #" + id);
        sb.append(" *** ");
        sb.append("\n- NONE: " + this.nome);
        sb.append("\n- EMAIL: " + this.email);
        sb.append("\n- TELEFONE: " + this.telefone);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(email, contato.email) && Objects.equals(telefone, contato.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, telefone);
    }
}
