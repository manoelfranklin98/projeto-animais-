package br.com.fesfcfafic.poo.model;

public class Papagaio extends Animal {
    public Papagaio(String nome, int idade) {
        super(nome, idade, "Papagaio", false);
    }

    @Override
    public String fazerSom() {
        return "Repetindo palavras";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Animal: Doméstico");
    }
}
