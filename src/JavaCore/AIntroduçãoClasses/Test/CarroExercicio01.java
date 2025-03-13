package JavaCore.AIntroduçãoClasses.Test;

import JavaCore.AIntroduçãoClasses.Dominio.Carro;

/* Crie uma classe carro com os seguintes atributos
Nome
Modelo
Ano
em seguida crie dois objetos distintos e imprima seus valores.
 */

public class CarroExercicio01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Vectra";
        carro1.modelo = "Sedan";
        carro1.ano = 2010;

        carro2.nome = "Gol";
        carro2.modelo = "Sedan";
        carro2.ano = 2021;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }


}
