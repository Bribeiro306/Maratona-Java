package JavaCore.BIntroduçãoMetodos.Dominio;

public class Funcionário01 {

    public class Funcionario {
        public String nome;
        public int idade;
        public char salário;

        public void imprime() {
            System.out.println("------------------------------------------");

            System.out.println(this.nome);
            System.out.println(this.idade);
            System.out.println(this.salário);

        }
    }


}
