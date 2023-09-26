package br.com.fesfcfafic.poo.model;

public abstract class Animal {
    private String nome;
    private int idade;
    private String especie;
    private boolean carnivoro;


    public Animal(String nome, int idade, String especie, boolean carnivoro) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.carnivoro = carnivoro;
    }


    public abstract String fazerSom();


    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Espécie: " + especie);
        System.out.println("Carnívoro: " + (carnivoro ? "Sim" : "Não"));
    }


    public boolean ehJovem() {
        return idade < 2;
    }


    public boolean ehAdulto() {
        return idade >= 2;
    }
}