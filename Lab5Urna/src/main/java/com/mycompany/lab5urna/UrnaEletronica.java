package com.mycompany.lab5urna;
import java.util.ArrayList;

public class UrnaEletronica {
    private ArrayList<Candidato> listaCandidatos;
    private ArrayList<Integer> numVotosCandidatos;
    private int numVotosBranco;
    private int numVotosNulo;
    private boolean acesso;
    
    public UrnaEletronica(){
    this.listaCandidatos = new ArrayList<Candidato>();
    this.listaCandidatos.clear();
    this.numVotosCandidatos = new ArrayList<Integer>();
    this.numVotosCandidatos.clear();
    this.numVotosBranco = 0;
    this.numVotosNulo = 0;
    this.acesso = false;
}
    public int cadastraCandidato(Candidato candidato){
        this.listaCandidatos.add(candidato);
        this.numVotosCandidatos.add(0);
        return 0;
    }
    public void autorizaEleitor(){
        this.setacessoON();
    }
    public int verificaCandidato(int numVotacao){
        int index = 0;
        for(Candidato candidato: listaCandidatos){
            if(numVotacao == candidato.getnumeroVotacao()){
                return index;
            }
            index++;
        }
        System.out.println("Candidato não existente");
        return -1;
    }
    private void setacessoON(){
        this.acesso = true;
    }
    private void setacessoOFF(){
        this.acesso = false;
    }
    
    public void recebeVotoCandidato(int voto){
        if(this.verificaCandidato(voto) > 0){
            this.numVotosCandidatos.set(this.verificaCandidato(voto), this.numVotosCandidatos.get(this.verificaCandidato(voto))+1);
        }
        this.setacessoOFF();
    }
    
    public void recebeVotoNulo(){
        this.numVotosNulo+=1;
        this.setacessoOFF();
    }
    
    public void recebeVotoBranco(){
        this.numVotosBranco += 1;
        this.setacessoOFF();
    }
    
    public void geraRelatorio(){
        int index = 0;
        for(Candidato candidato: listaCandidatos){
            System.out.printf("Candidato %s >>> %d votos\n", candidato.getnome(), this.numVotosCandidatos.get(index));
            index++;
        }
        System.out.printf("Quantidade de votos Nulos: %d \nQuantidade de votos Branco %d\n", this.numVotosNulo, this.numVotosBranco);
    }
    
    public boolean urnaLiberada(){
        return this.acesso;
    }
}
