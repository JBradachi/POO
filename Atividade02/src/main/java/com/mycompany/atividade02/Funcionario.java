
package com.mycompany.atividade02;

public class Funcionario {
    private String nome;
    private Data data_nasc;
    private String cargo;
    private String tipo_de_contrato;
    private float salario;
    private int n_filhos;
    private Data data_adms;
    
    public Funcionario(String Nnome, int dia, int mes, int ano){
        this.nome = Nnome.toUpperCase();
        this.data_nasc = new Data(dia, mes, ano);
    }
    
    public void contratar(String tipo, float Ssalario, int n_fi, String Ccargo, int dia, int mes, int ano){
        this.setcargo(Ccargo);
        this.settipodecontrato(tipo);
        this.setsalario(Ssalario);
        this.setnfi(n_fi);
        this.setdataadm(dia, mes, ano);
    }
    
    public void setcargo(String Ccargo){
        this.cargo = Ccargo.toLowerCase();
    }
    
    public void settipodecontrato(String tipo){
        this.tipo_de_contrato = tipo.toLowerCase();
    }
    
    public void setsalario(float Ssalario){
        this.salario = Ssalario;
    }
    
    public void setnfi(int n_fi){
        this.n_filhos = n_fi;
    }
    
    public void setdataadm(int dia, int mes, int ano){
        this.data_adms = new Data(dia, mes, ano);
    }
    
    public String getcargo(){
        return this.cargo;
    }
    
    public String gettipodecontrato(){
        return this.tipo_de_contrato;
    }
    
    public float getsalario(){
        return this.salario;
    }
    
    public int getnfi(){
        return this.n_filhos;
    }
    
    public void getdataadm(){
        this.data_adms.show_data();
    }
    
    public float salario_bruto(float horas_trabalhadas){
        if(this.tipo_de_contrato.equals("efetivo")){
            return this.salario;
        }
        else{
            return this.salario * horas_trabalhadas;
        }
    }
    
    public float d_inss(float horas_trabalhadas){
        float desconto = 0, s_bruto;
        
        s_bruto = this.salario_bruto(horas_trabalhadas);
        
        if(s_bruto > 3896.94f){
            desconto = desconto + (s_bruto-3896.94f)*0.14f;
            s_bruto = 3896.94f;
        }
        if(s_bruto > 2571.29f){
            desconto = desconto + (s_bruto-2571.29f)*0.12f;
            s_bruto = 2571.29f;
        }
        if(s_bruto > 1302f){
            desconto = desconto + (s_bruto-1302f)*0.09f;
            s_bruto = 1302f;
        }
        desconto = desconto + (s_bruto)*0.075f;
        
        return desconto;
    }
    
    public float d_impostorenda(float horas_trabalhadas){
        float desconto = 0, s_bruto;
        
        s_bruto = this.salario_bruto(horas_trabalhadas) - this.getnfi()*189.59f;
        
        if(s_bruto > 4664.68f){
            desconto = desconto + (s_bruto-4664.68f)*0.275f;
            s_bruto = 4664.68f;
        }
        if(s_bruto > 3751.05f){
            desconto = desconto + (s_bruto-3751.05f)*0.225f;
            s_bruto = 3751.05f;
        }
        if(s_bruto > 2826.65f){
            desconto = desconto + (s_bruto-2826.65f)*0.15f;
            s_bruto = 2826.65f;
        }
        if(s_bruto > 1903.98f){
            desconto = desconto + (s_bruto)*0.075f;
        }
        
        return desconto;
    }
    
    public float salario_liquido(float horas_trabalhadas){
        return (this.salario_bruto(horas_trabalhadas) - this.d_impostorenda(horas_trabalhadas) - this.d_inss(horas_trabalhadas));
    }
    
    public void folha_pagamento(float horas_trabalhadas){
        System.out.printf("%s \n==================================\n", this.nome);
        System.out.printf("Salário bruto ........ R$%.2f\n", this.salario_bruto(horas_trabalhadas));
        System.out.printf("Desconto INSS ........ R$%.2f\n", this.d_inss(horas_trabalhadas));
        System.out.printf("Desconto IR .......... R$%.2f\n", this.d_impostorenda(horas_trabalhadas));
        System.out.println("----------------------------------");
        System.out.printf("Salário líquido ...... R$%.2f\n", this.salario_liquido(horas_trabalhadas));
        System.out.println("----------------------------------");
    }
}
