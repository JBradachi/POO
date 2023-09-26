package com.mycompany.lista1_dna1;
import java.util.Scanner;

public class DNA {
    public String sequencia;
    
    public DNA(){
        this.lerDNA();
    }
    
    public void lerDNA(){
        Scanner ler = new Scanner(System.in);
        int tam = 0;
        System.out.printf("Insira a sequencia de bases\n>>> ");
        while(tam != 9){
            this.sequencia = ler.next().toLowerCase();
            tam = this.sequencia.length();
            if(tam!=9){
                System.out.printf("Por favor, insira a quantidade valida [ 9 ]\n>>> ");
            }
        }
   }
    
    public String getsequencia(){
        return this.sequencia;
    }
    
    public void setsequencia(String sequencia){
        this.lerDNA();
    }
    public String toString(){
        return this.getsequencia();
    }
    public int obterFrequencia(char base){
        int freq = 0;
        for(int a = 0; a<9; a++){
            if(this.sequencia.charAt(a) == base){
                freq++;
            }
        }
        return freq;
    }
    public int verificarSimilaridade(DNA that){
        int similiaridade = 0;
        for(int a = 0; a<9; a++){
            if(this.sequencia.charAt(a) == that.sequencia.charAt(a)){
                similiaridade++;
            }
        }
        return similiaridade;
    }
}
 