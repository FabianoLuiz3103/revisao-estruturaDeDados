package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio03;

public class Senha implements Comparable<Senha>{

    private String senha;
    private int prioridade;

    public Senha(){}

    public Senha(String senha, int prioridade) {
        this.senha = senha;
        this.prioridade = prioridade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n ** SENHA **");
        sb.append("\n- SENHA: " + senha);
        sb.append("\n- PRIORIDADE: " + getPrioridade(prioridade));
        return sb.toString();
    }

    @Override
    public int compareTo(Senha s) {
        if(this.prioridade > s.getPrioridade()){
            return 1;
        }else if(this.prioridade < s.getPrioridade()){
            return -1;
        }
        return 0;
    }

    private String getPrioridade(int prioridade){
        return switch (prioridade){
            case 1 -> "verde";
            case 2 -> "amarelo";
            case 3 -> "vermelho";
            default -> "S/P";
        };
    }
}
