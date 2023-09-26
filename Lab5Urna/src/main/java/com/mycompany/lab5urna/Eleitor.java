package com.mycompany.lab5urna;


public class Eleitor {
    private String nome;
    private String intençãoDeVoto;
    private int numeroTitulo;
    
    public Eleitor(String nome, String intencaoDeVoto, int numeroTitulo){
        this.intençãoDeVoto = intencaoDeVoto;
        this.nome = nome;
        this.numeroTitulo = numeroTitulo;
    }
    
    public String getintencaoDeVoto(){
        return this.intençãoDeVoto;
    }
}
