package Aula05EstruturasCondicionais;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Qual é o valor dos impostos que devo pagar na Holanda com base no meu salário anual?
        double salario = 60000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.75 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salario <= 34712) {
            valorImposto = salario *  primeiraFaixa;
        } else if (salario >= 34712 && salario <= 68508) {
            valorImposto = salario * segundaFaixa;
        } else {
            valorImposto = salario * terceiraFaixa;
        }
            System.out.println(valorImposto);

        }
    }
