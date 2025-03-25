package JavaCore.AIntroduçãoClasses.Test;

import JavaCore.AIntroduçãoClasses.Dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante.nome = "João";
        estudante.idade = 34;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


        System.out.println("----------------------------------");
        estudante2.nome = "Fernando";
        estudante2.idade = 25;
        estudante2.sexo = 'M';
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
