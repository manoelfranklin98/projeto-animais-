package br.com.fesfcfafic.poo.model;

 public class Leao extends Animal {
    public Leao(String nome, int idade) {
        super(nome, idade, "Leão", true);
    }

    @Override
    public String fazerSom() {
        return "Rugindo";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Animal: Selvagem");
    }
}
