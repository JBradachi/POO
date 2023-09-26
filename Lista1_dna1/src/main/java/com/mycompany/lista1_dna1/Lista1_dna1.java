package com.mycompany.lista1_dna1;

public class Lista1_dna1 {

    public static void main(String[] args) {
        //DNA dna = new DNA();
        //System.out.printf("existem %d quantidade(s) de Adenina\n", dna.obterFrequencia('a'));
        DNA dna1 = new DNA();
        DNA dna2 = new DNA();
        DNA dna3 = new DNA();
        DNA dna4 = new DNA();
        
        System.out.printf("%d | %d | %d | %d\n", dna1.verificarSimilaridade(dna1), dna1.verificarSimilaridade(dna2), dna1.verificarSimilaridade(dna3), dna1.verificarSimilaridade(dna4));
        System.out.printf("%d | %d | %d | %d\n", dna2.verificarSimilaridade(dna1), dna2.verificarSimilaridade(dna2), dna2.verificarSimilaridade(dna3), dna2.verificarSimilaridade(dna4));
        System.out.printf("%d | %d | %d | %d\n", dna3.verificarSimilaridade(dna1), dna3.verificarSimilaridade(dna2), dna3.verificarSimilaridade(dna3), dna3.verificarSimilaridade(dna4));
        System.out.printf("%d | %d | %d | %d\n", dna4.verificarSimilaridade(dna1), dna4.verificarSimilaridade(dna2), dna4.verificarSimilaridade(dna3), dna4.verificarSimilaridade(dna4));
        
    }
}
