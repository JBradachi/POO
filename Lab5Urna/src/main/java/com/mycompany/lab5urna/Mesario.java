package com.mycompany.lab5urna;
import java.util.ArrayList;

public class Mesario {
    private int zonaEleitoral;
    private UrnaEletronica urna;
    private ArrayList<Eleitor> listaEleitores;
    
    public Mesario(UrnaEletronica urna, int zonaE){
        this.urna = urna;
        this.zonaEleitoral = zonaE;
        this.listaEleitores = new ArrayList<Eleitor>();
        this.listaEleitores.clear();
    }
    
    public void addEleitorNaLista(Eleitor eleitor){
        this.listaEleitores.add(eleitor);
    }
    
    public void InicializaUrna(){
        //this.urna.iniciaUrna();
    }
    
    public void AutorizaEleitor(){
        this.urna.autorizaEleitor();
    }
    public void GeraRelatorio(){
        this.urna.geraRelatorio();
    }
    
    public void Votacao(){
        for(Eleitor eleitor: listaEleitores){
            this.AutorizaEleitor();
            if(this.urna.urnaLiberada()){
                if(eleitor.getintencaoDeVoto().equals("BRANCO")){
                    this.urna.recebeVotoBranco();
                }
                else if(eleitor.getintencaoDeVoto().equals("0000")){
                    this.urna.recebeVotoNulo();
                }
                else{
                    int numerodevotacao = Integer.parseInt(eleitor.getintencaoDeVoto());
                    this.urna.recebeVotoCandidato(numerodevotacao);
                }
            }
        }
            
    }
}
