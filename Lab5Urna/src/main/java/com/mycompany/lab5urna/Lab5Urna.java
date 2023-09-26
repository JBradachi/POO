package com.mycompany.lab5urna;

public class Lab5Urna {

    public static void main(String[] args) {
        Candidato c1 = new Candidato("Jose", "Socialista", "prefeito", 0043);
        Candidato c2 = new Candidato("Florinda", "PDA", "prefeito", 6006);
        Candidato c3 = new Candidato("Girafales", "PP", "prefeito", 660);
        UrnaEletronica u1 = new UrnaEletronica();
        u1.cadastraCandidato(c1);
        u1.cadastraCandidato(c2);
        u1.cadastraCandidato(c3);
        Eleitor e1 = new Eleitor("Joao", "0000", 435432);
        Eleitor e2 = new Eleitor("Zorza", "BRANCO", 435431);
        Eleitor e3 = new Eleitor("Joao", "6006", 435432);
        Mesario m1 = new Mesario( u1, 1559);
        m1.addEleitorNaLista(e1);
        m1.addEleitorNaLista(e2);
        m1.addEleitorNaLista(e3);
        m1.InicializaUrna();
        m1.GeraRelatorio();
        m1.Votacao();
        m1.GeraRelatorio();
    }
}
