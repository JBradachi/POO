package com.mycompany.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? "+ this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true || this.carga == 0){
            System.out.println("ERRO!!!, não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
            this.carga --;
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
