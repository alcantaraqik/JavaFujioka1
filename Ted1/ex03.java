package Exercicios;

import java.util.Scanner;

/* 3. Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são
inferiores a 500 reais. Escreva um programa que leia o salário de vários
funcionários se mostre o valor do salário reajustado ou uma mensagem caso o
funcionário não tenha direito ao aumento. O programa será encerrado quando se
digitar “fim” para o nome do funcionário. (Comando while) */
public class ex03 {
    public static void main(String[] args) {
        var funcionario = "";
        while (!funcionario.equalsIgnoreCase("fim")) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o nome do funcionário: ");
            funcionario = leitor.nextLine();

            int salario = 0;
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite seu respectivo salário: ");
            salario = leitor2.nextInt();

            int novoSalario = 0;
            int aumento = 0;
            if (salario < 500) {
                aumento = (20 * salario) / 100;
                novoSalario = salario + aumento;
            } else {
                System.out.println("Seu salário não houve reajuste!");

            }
            System.out.println("o novo salário de " + funcionario + " é " + novoSalario);

            Scanner leitor3 = new Scanner(System.in);
            System.out.println("Funcionário ou fim? ");
            funcionario = leitor3.nextLine();


        }

    }
}
