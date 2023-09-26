package com.mycompany.lista1_usuario;

public class Lista1_Usuario {

    public static void main(String[] args) {
        CondicionadorDeAr c1 = new CondicionadorDeAr();
        
        System.out.println("inicia com 20 de temperatura");
        c1.mostraTemperatura();
        c1.ligar();
        c1.mostraTemperatura();
        
        System.out.println("aumentando para 30");
        for(int a = 20; a<30; a++){
            c1.aumentarTemperatura();
        }
        c1.mostraTemperatura();
        
        System.out.println("diminuindo para 10");
        for(int a = 28; a>10; a--){
            c1.reduzirTemperatura();
        }
        c1.mostraTemperatura();
        
        System.out.println("aumentando para 25");
        for(int a = 15; a<25; a++){
            c1.aumentarTemperatura();
        }
        c1.mostraTemperatura();
        
        System.out.println("fim");
    }
}
