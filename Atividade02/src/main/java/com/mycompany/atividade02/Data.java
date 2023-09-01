
package com.mycompany.atividade02;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    public void show_data(){
        System.out.printf("%d/%d/%d", this.dia, this.mes, this.ano);
    }
    
    public int calculaDias (int dia, int mes, int ano){
        int dias;
        dias = (ano - this.ano)*365;
        if (this.mes > mes){
            dias = dias + ((this.mes - 12) + mes)*30;
        }else{
            dias = dias + (mes - this.mes)*30;
        }
        if (this.dia > dia){
            dias = dias + ((this.dia - 30) + dia);
        }else{
            dias = dias + (dia - this.dia);
        }
        return dias;
    }
}
