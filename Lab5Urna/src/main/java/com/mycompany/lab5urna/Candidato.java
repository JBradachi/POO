package com.mycompany.lab5urna;

public class Candidato {
    private String nome;
    private String partido;
    private String cargo;
    private int numeroVotacao;
    
    public Candidato(String nome, String partido, String cargo, int numeroVotacao){
        this.cargo = cargo;
        this.nome = nome;
        this.numeroVotacao = numeroVotacao;
        this.partido = partido;
    }
    
    public String getcargo(){
        return this.cargo;
    }
    public String getnome(){
        return this.nome;
    }
    public String getpartido(){
        return this.partido;
    }
    public int getnumeroVotacao(){
        return this.numeroVotacao;
    }
}
