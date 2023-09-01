
package com.mycompany.atividade02;

public class Atividade02 {

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Joao bradas", 12, 02, 2004);
        Funcionario func2 = new Funcionario("Pedro augusto", 21, 12, 2004);
        func1.contratar("efetivo", 1300f, 3, "pesquisador", 30,  8, 2023);
        func2.contratar("horista", 60, 1, "vendedor", 30, 8, 2023);
        func1.folha_pagamento(10);
        System.out.println(" ");
        func2.folha_pagamento(120);
    }
}
