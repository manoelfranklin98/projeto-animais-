package br.com.fesfcfafic.poo.main;
import br.com.fesfcfafic.poo.model.Animal;
import br.com.fesfcfafic.poo.model.Cachorro;
import br.com.fesfcfafic.poo.model.Gato;
import br.com.fesfcfafic.poo.model.Leao;
import br.com.fesfcfafic.poo.model.Papagaio;

    public class Main {
        public static void main(String[] args) {

            Cachorro cachorro = new Cachorro("Rex", 3);
            Gato gato = new Gato("Miau", 2);
            Leao leao = new Leao("Simba", 5);
            Papagaio papagaio = new Papagaio("Loro", 10);


            System.out.println("Cachorro faz: " + cachorro.fazerSom());
            cachorro.mostrarInfo();
            System.out.println();

            System.out.println("Gato faz: " + gato.fazerSom());
            gato.mostrarInfo();
            System.out.println();

            System.out.println("Leão faz: " + leao.fazerSom());
            leao.mostrarInfo();
            System.out.println();

            System.out.println("Papagaio faz: " + papagaio.fazerSom());
            papagaio.mostrarInfo();
        }
    }
