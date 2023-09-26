package com.mycompany.lista1_usuario;

public class CondicionadorDeAr {
    boolean ligado;
    Termostato termostato;
    
    public CondicionadorDeAr(){
        this.ligado = false;
        termostato = new Termostato();
    }
    
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public void aumentarTemperatura(){
        if(this.ligado == true){
            this.termostato.upTempeeratura();
        }else{
            System.out.println("Ar-condicionado desligado");
        }
    }
    public void reduzirTemperatura(){
        if(this.ligado == true){
            this.termostato.dnTempeeratura();
        }else{
            System.out.println("Ar-condicionado desligado");
        }
    }
    public void mostraTemperatura(){
        if(this.ligado == true){
            System.out.printf("=================\nTemperatura atual\n=================\n>>> %d\n", this.termostato.getTemperatura());
        }else{
            System.out.println("Ar-condicionado desligado");
        }
    }
}
