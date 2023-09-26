package com.mycompany.lista1_usuario;

public class Termostato {
    private int temperatura;
    
    public Termostato(){
        this.temperatura = 20;
    }
    
    public int getTemperatura(){
        return this.temperatura;
    }
    
    public int upTempeeratura(){
        if(this.temperatura == 28){
            System.out.println("Temperatura máxima atingida");
        }
        else{
            this.temperatura = this.temperatura +1;
        }
        return 0;
    }
    public int dnTempeeratura(){
        if(this.temperatura == 15){
            System.out.println("Temperatura máxima atingida");
        }
        else{
            this.temperatura = this.temperatura - 1;
        }
        return 0;
    }
}
