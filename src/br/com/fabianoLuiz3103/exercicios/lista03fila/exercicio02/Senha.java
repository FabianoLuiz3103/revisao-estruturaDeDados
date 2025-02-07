package br.com.fabianoLuiz3103.exercicios.lista03fila.exercicio02;

public class Senha{

    private static int contadorPrioridade;
    private static int contadorNormal;

    private String senha;

    public Senha(boolean prioridade){
        if(prioridade){
            this.senha = "P"+(++contadorPrioridade);
        }else{
            this.senha = "N"+(++contadorNormal);
        }
    }

    public static void setContadorPrioridade(int contadorPrioridade) {
        Senha.contadorPrioridade = contadorPrioridade;
    }

    public static void setContadorNormal(int contadorNormal) {
        Senha.contadorNormal = contadorNormal;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return senha;
    }
}
