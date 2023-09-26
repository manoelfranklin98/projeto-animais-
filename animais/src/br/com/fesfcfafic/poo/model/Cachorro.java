package br.com.fesfcfafic.poo.model;

 public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro", true);
    }

    @Override
    public String fazerSom() {
        return "Latindo";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Animal: Doméstico");
    }
}
