package br.com.fesfcfafic.poo.model;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade, "Gato", true);
    }

    @Override
    public String fazerSom() {
        return "Miando";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Animal: Doméstico");
    }
}
