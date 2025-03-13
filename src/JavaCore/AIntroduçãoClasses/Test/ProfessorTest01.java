package JavaCore.AIntroduçãoClasses.Test;

import JavaCore.AIntroduçãoClasses.Dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Fernando";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.sexo + " " + professor.idade);


    }
}
