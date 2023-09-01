package com.mycompany.atividade01;
import java.util.Scanner;

public class Atividade01 {
    public static int calculaDias (int dia_nascimento, int mes_nascimento, int ano_nascimento, int dia_atual, int mes_atual, int ano_atual){
        int dias;
        dias = (ano_atual - ano_nascimento)*365;
        if (mes_nascimento > mes_atual){
            dias = dias + ((mes_nascimento - 12) + mes_atual)*30;
        }else{
            dias = dias + (mes_atual - mes_nascimento)*30;
        }
        if (dia_nascimento > dia_atual){
            dias = dias + ((dia_nascimento - 30) + dia_atual);
        }else{
            dias = dias + (dia_atual - dia_nascimento);
        }
        return dias;
    }
    
    public static void main(String[] args) {
        int diaa, dian, mesa, mesn, anoa, anon, dias;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("PROGRAMA CALCULA DIAS");
        System.out.println("=====================");
        
        System.out.println("Digite sua data de nascimento (dd mm aaaa) ");
        dian = leitor.nextInt();
        mesn = leitor.nextInt();
        anon = leitor.nextInt();
        
        System.out.println("Digite a data atual (dd mm aaaa)");
        diaa = leitor.nextInt();
        mesa = leitor.nextInt();
        anoa = leitor.nextInt();
        
        dias = calculaDias (dian,mesn, anon, diaa, mesa, anoa);
        
        System.out.println("Total de dias vividos >>> " + dias);
    }
}
